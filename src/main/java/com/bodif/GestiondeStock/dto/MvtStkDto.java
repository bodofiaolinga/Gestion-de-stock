package com.bodif.GestiondeStock.dto;

import com.bodif.GestiondeStock.model.Article;
import com.bodif.GestiondeStock.model.MvtStk;
import com.bodif.GestiondeStock.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
@Builder
@Data
public class MvtStkDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    private TypeMvtStk typeMvt;

    // Conversion Entity -> DTO
    public static MvtStkDto fromEntity(MvtStk entity) {
        if (entity == null) {
            return null;
        }

        return MvtStkDto.builder()
                .id(entity.getId())
                .dateMvt(entity.getDateMvt())
                .quantite(entity.getQuantite())
                .article(ArticleDto.fromEntity(entity.getArticle()))
                .typeMvt(entity.getTypeMvt())
                .build();
    }

    // Conversion DTO -> Entity
    public static MvtStk toEntity(MvtStkDto dto) {
        if (dto == null) {
            return null;
        }

        MvtStk entity = new MvtStk();
        entity.setId(dto.getId());
        entity.setDateMvt(dto.getDateMvt());
        entity.setQuantite(dto.getQuantite());
        entity.setArticle(ArticleDto.toEntity(dto.getArticle()));
        entity.setTypeMvt(dto.getTypeMvt());

        return entity;
    }
}
