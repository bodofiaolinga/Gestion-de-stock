package com.bodif.GestiondeStock.dto;

import com.bodif.GestiondeStock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
public class UtilisateurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private String mail;

    private Instant dateDeNaissance;

    private String motDePasse;


    private AdresseDto adresse;

    private String photo;


    private EntrepriseDto entreprise;

    private List<RolesDto> roles;

    // Conversion Entity -> DTO
    public static UtilisateurDto fromEntity(Utilisateur entity) {
        if (entity == null) {
            return null;
        }

        return UtilisateurDto.builder()
                .id(entity.getId())
                .nom(entity.getNom())
                .prenom(entity.getPrenom())
                .mail(entity.getMail())
                .dateDeNaissance(entity.getDateDeNaissance())
                .motDePasse(entity.getMotDePasse())
                .adresse(AdresseDto.fromEntity(entity.getAdresse()))
                .photo(entity.getPhoto())
                .entreprise(EntrepriseDto.fromEntity(entity.getEntreprise()))
                .roles(
                        entity.getRoles() == null ? null :
                                entity.getRoles().stream()
                                        .map(RolesDto::fromEntity)
                                        .collect(Collectors.toList())
                )
                .build();
    }

    // Conversion DTO -> Entity
    public static Utilisateur toEntity(UtilisateurDto dto) {
        if (dto == null) {
            return null;
        }

        Utilisateur entity = new Utilisateur();
        entity.setId(dto.getId());
        entity.setNom(dto.getNom());
        entity.setPrenom(dto.getPrenom());
        entity.setMail(dto.getMail());
        entity.setDateDeNaissance(dto.getDateDeNaissance());
        entity.setMotDePasse(dto.getMotDePasse());
        entity.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
        entity.setPhoto(dto.getPhoto());
        entity.setEntreprise(EntrepriseDto.toEntity(dto.getEntreprise()));
        entity.setRoles(
                dto.getRoles() == null ? null :
                        dto.getRoles().stream()
                                .map(RolesDto::toEntity)
                                .collect(Collectors.toList())
        );

        return entity;
    }
}
