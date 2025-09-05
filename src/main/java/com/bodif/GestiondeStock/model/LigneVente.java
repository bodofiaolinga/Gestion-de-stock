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
@Table(name = "LigneVente")
public class LigneVente extends AbstractEntity {


    @ManyToOne
    @JoinColumn(name="idvente")
    private Vente vente;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
    private Integer idEntreprise;
}
