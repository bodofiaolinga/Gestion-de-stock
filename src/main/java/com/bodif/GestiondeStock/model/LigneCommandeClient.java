package com.bodif.GestiondeStock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "LigneCommandeClient")
public class LigneCommandeClient extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name="idArticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name="idCommandeClient")
    private CommandeClient commandeClient;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
