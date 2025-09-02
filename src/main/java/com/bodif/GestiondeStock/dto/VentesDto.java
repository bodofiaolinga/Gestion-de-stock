package com.bodif.GestiondeStock.dto;

import com.bodif.GestiondeStock.model.Vente;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
@Builder
@Data
public class VentesDto {

    private Integer id;

    private String code;

    private Instant dateVente;

    private String commentaire;

    // Conversion Entity -> DTO
    public static VentesDto fromEntity(Vente entity) {
        if (entity == null) {
            return null;
        }

        return VentesDto.builder()
                .id(entity.getId())
                .code(entity.getCode())
                .dateVente(entity.getDateVente())
                .commentaire(entity.getCommentaire())
                .build();
    }

    // Conversion DTO -> Entity
    public static Vente toEntity(VentesDto dto) {
        if (dto == null) {
            return null;
        }

        Vente entity = new Vente();
        entity.setId(dto.getId());
        entity.setCode(dto.getCode());
        entity.setDateVente(dto.getDateVente());
        entity.setCommentaire(dto.getCommentaire());

        return entity;
    }
}
