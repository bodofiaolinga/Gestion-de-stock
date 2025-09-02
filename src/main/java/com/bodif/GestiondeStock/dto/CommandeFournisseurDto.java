package com.bodif.GestiondeStock.dto;

import com.bodif.GestiondeStock.model.CommandeFournisseur;
import com.bodif.GestiondeStock.model.Fournisseur;
import com.bodif.GestiondeStock.model.LigneCommandeFournisseur;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
public class CommandeFournisseurDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private FournisseurDto fournisseur;


    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;

    public static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur) {
        if (commandeFournisseur == null) {
            return null;
        }

        return CommandeFournisseurDto.builder()
                .id(commandeFournisseur.getId())
                .code(commandeFournisseur.getCode())
                .dateCommande(commandeFournisseur.getDateCommande())
                .fournisseur(FournisseurDto.fromEntity(commandeFournisseur.getFournisseur()))
                .ligneCommandeFournisseurs(
                        commandeFournisseur.getLigneCommandeFournisseurs() == null ? null :
                                commandeFournisseur.getLigneCommandeFournisseurs().stream()
                                        .map(LigneCommandeFournisseurDto::fromEntity)
                                        .collect(Collectors.toList())
                )
                .build();
    }

    public static CommandeFournisseur toEntity(CommandeFournisseurDto dto) {
        if (dto == null) {
            return null;
        }

        CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
        commandeFournisseur.setId(dto.getId());
        commandeFournisseur.setCode(dto.getCode());
        commandeFournisseur.setDateCommande(dto.getDateCommande());
        commandeFournisseur.setFournisseur(FournisseurDto.toEntity(dto.getFournisseur()));
        commandeFournisseur.setLigneCommandeFournisseurs(
                dto.getLigneCommandeFournisseurs() == null ? null :
                        dto.getLigneCommandeFournisseurs().stream()
                                .map(LigneCommandeFournisseurDto::toEntity)
                                .collect(Collectors.toList())
        );

        return commandeFournisseur;
    }


}
