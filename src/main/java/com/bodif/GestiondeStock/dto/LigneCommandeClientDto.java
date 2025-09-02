package com.bodif.GestiondeStock.dto;

import com.bodif.GestiondeStock.model.LigneCommandeClient;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Builder
@Data
public class LigneCommandeClientDto {


    private Integer id;

    private ArticleDto article;

    private CommandeClientDto commandeClient;
    private BigDecimal quantite;

    private BigDecimal prixUnitaire;


    public static LigneCommandeClientDto fromEntity(LigneCommandeClient ligneCommandeClient) {
        if (ligneCommandeClient == null) {
            return null;
        }

        return LigneCommandeClientDto.builder()
                .id(ligneCommandeClient.getId())
                .article(ArticleDto.fromEntity(ligneCommandeClient.getArticle()))
                .commandeClient(CommandeClientDto.fromEntity(ligneCommandeClient.getCommandeClient()))
                .quantite(ligneCommandeClient.getQuantite())
                .prixUnitaire(ligneCommandeClient.getPrixUnitaire())
                .build();
    }

    // Conversion DTO -> Entity
    public static LigneCommandeClient toEntity(LigneCommandeClientDto dto) {
        if (dto == null) {
            return null;
        }

        LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
        ligneCommandeClient.setId(dto.getId());
        ligneCommandeClient.setArticle(ArticleDto.toEntity(dto.getArticle()));
        ligneCommandeClient.setCommandeClient(CommandeClientDto.toEntity(dto.getCommandeClient()));
        ligneCommandeClient.setQuantite(dto.getQuantite());
        ligneCommandeClient.setPrixUnitaire(dto.getPrixUnitaire());

        return ligneCommandeClient;
    }
}
