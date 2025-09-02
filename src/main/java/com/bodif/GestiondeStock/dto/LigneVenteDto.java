package com.bodif.GestiondeStock.dto;

import com.bodif.GestiondeStock.model.LigneVente;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Builder
@Data
public class LigneVenteDto {

    private Integer id;


    private VentesDto vente;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    public static LigneVenteDto fromEntity(LigneVente entity) {
        if (entity == null) {
            return null;
        }

        return LigneVenteDto.builder()
                .id(entity.getId())
                .vente(VentesDto.fromEntity(entity.getVente()))
                .quantite(entity.getQuantite())
                .prixUnitaire(entity.getPrixUnitaire())
                .build();
    }

    // Conversion DTO -> Entity
    public static LigneVente toEntity(LigneVenteDto dto) {
        if (dto == null) {
            return null;
        }

        LigneVente entity = new LigneVente();
        entity.setId(dto.getId());
        entity.setVente(VentesDto.toEntity(dto.getVente()));
        entity.setQuantite(dto.getQuantite());
        entity.setPrixUnitaire(dto.getPrixUnitaire());

        return entity;
    }
}
