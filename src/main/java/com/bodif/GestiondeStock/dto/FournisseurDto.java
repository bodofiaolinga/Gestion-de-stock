package com.bodif.GestiondeStock.dto;

import com.bodif.GestiondeStock.model.Adresse;
import com.bodif.GestiondeStock.model.Fournisseur;
import jakarta.persistence.Embedded;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
public class FournisseurDto {

    private Integer id;

    private String nom;

    private String prenom;

    @Embedded
    private AdresseDto adresse;

    private String photo;

    private String mail;

    private String numtel;


    private List<CommandeFournisseurDto> commandeFournisseurs;

    public static FournisseurDto fromEntity(Fournisseur fournisseur) {
        if (fournisseur == null) {
            return null;
        }

        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .adresse(AdresseDto.fromEntity(fournisseur.getAdresse()))
                .photo(fournisseur.getPhoto())
                .mail(fournisseur.getMail())
                .numtel(fournisseur.getNumtel())
                .commandeFournisseurs(
                        fournisseur.getCommandeFournisseurs() == null ? null :
                                fournisseur.getCommandeFournisseurs().stream()
                                        .map(CommandeFournisseurDto::fromEntity)
                                        .collect(Collectors.toList())
                )
                .build();
    }

    // Conversion DTO -> Entity
    public static Fournisseur toEntity(FournisseurDto dto) {
        if (dto == null) {
            return null;
        }

        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(dto.getId());
        fournisseur.setNom(dto.getNom());
        fournisseur.setPrenom(dto.getPrenom());
        fournisseur.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
        fournisseur.setPhoto(dto.getPhoto());
        fournisseur.setMail(dto.getMail());
        fournisseur.setNumtel(dto.getNumtel());
        fournisseur.setCommandeFournisseurs(
                dto.getCommandeFournisseurs() == null ? null :
                        dto.getCommandeFournisseurs().stream()
                                .map(CommandeFournisseurDto::toEntity)
                                .collect(Collectors.toList())
        );

        return fournisseur;
    }
}
