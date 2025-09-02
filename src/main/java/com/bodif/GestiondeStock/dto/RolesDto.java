package com.bodif.GestiondeStock.dto;

import com.bodif.GestiondeStock.model.Roles;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RolesDto {

    private Integer id;

    private String roleName;

    private UtilisateurDto utilisateur;

    // Conversion Entity -> DTO
    public static RolesDto fromEntity(Roles entity) {
        if (entity == null) {
            return null;
        }

        return RolesDto.builder()
                .id(entity.getId())
                .roleName(entity.getRoleName())
                .utilisateur(UtilisateurDto.fromEntity(entity.getUtilisateur()))
                .build();
    }

    // Conversion DTO -> Entity
    public static Roles toEntity(RolesDto dto) {
        if (dto == null) {
            return null;
        }

        Roles entity = new Roles();
        entity.setId(dto.getId());
        entity.setRoleName(dto.getRoleName());
        entity.setUtilisateur(UtilisateurDto.toEntity(dto.getUtilisateur()));

        return entity;
    }
}
