package com.bodif.GestiondeStock.dto;

import com.bodif.GestiondeStock.model.Adresse;
import com.bodif.GestiondeStock.model.Entreprise;
import com.bodif.GestiondeStock.model.Utilisateur;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
public class EntrepriseDto {

    private Integer id;

    private String nom;

    private String description;

    @Embedded
    private AdresseDto adresse;

    private String codeFiscal;

    private String photo;

    private String mail;

    private String numtel;

    private String steWeb;


    private List<UtilisateurDto> utilisateurs;


    public static EntrepriseDto fromEntity(Entreprise entreprise) {
        if (entreprise == null) {
            return null;
        }

        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .description(entreprise.getDescription())
                .adresse(AdresseDto.fromEntity(entreprise.getAdresse()))
                .codeFiscal(entreprise.getCodeFiscal())
                .photo(entreprise.getPhoto())
                .mail(entreprise.getMail())
                .numtel(entreprise.getNumtel())
                .steWeb(entreprise.getSteWeb())
                .utilisateurs(
                        entreprise.getUtilisateurs() == null ? null :
                                entreprise.getUtilisateurs().stream()
                                        .map(UtilisateurDto::fromEntity)
                                        .collect(Collectors.toList())
                )
                .build();
    }

    // Conversion DTO -> Entity
    public static Entreprise toEntity(EntrepriseDto dto) {
        if (dto == null) {
            return null;
        }

        Entreprise entreprise = new Entreprise();
        entreprise.setId(dto.getId());
        entreprise.setNom(dto.getNom());
        entreprise.setDescription(dto.getDescription());
        entreprise.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
        entreprise.setCodeFiscal(dto.getCodeFiscal());
        entreprise.setPhoto(dto.getPhoto());
        entreprise.setMail(dto.getMail());
        entreprise.setNumtel(dto.getNumtel());
        entreprise.setSteWeb(dto.getSteWeb());
        entreprise.setUtilisateurs(
                dto.getUtilisateurs() == null ? null :
                        dto.getUtilisateurs().stream()
                                .map(UtilisateurDto::toEntity)
                                .collect(Collectors.toList())
        );

        return entreprise;
    }
}

