package com.bodif.GestiondeStock.dto;


import com.bodif.GestiondeStock.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Builder
@Data
public class LigneCommandeFournisseurDto {

    private Integer id;

    private ArticleDto article;

    private CommandeFournisseurDto commandeFournisseur;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    public static LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur entity) {
        if (entity == null) {
            return null;
        }

        return LigneCommandeFournisseurDto.builder()
                .id(entity.getId())
                .article(ArticleDto.fromEntity(entity.getArticle()))
                .commandeFournisseur(CommandeFournisseurDto.fromEntity(entity.getCommandeFournisseur()))
                .quantite(entity.getQuantite())
                .prixUnitaire(entity.getPrixUnitaire())
                .build();
    }

    // Conversion DTO -> Entity
    public static LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto dto) {
        if (dto == null) {
            return null;
        }

        LigneCommandeFournisseur entity = new LigneCommandeFournisseur();
        entity.setId(dto.getId());
        entity.setArticle(ArticleDto.toEntity(dto.getArticle()));
        entity.setCommandeFournisseur(CommandeFournisseurDto.toEntity(dto.getCommandeFournisseur()));
        entity.setQuantite(dto.getQuantite());
        entity.setPrixUnitaire(dto.getPrixUnitaire());

        return entity;
    }
}
