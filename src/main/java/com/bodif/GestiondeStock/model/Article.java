package com.bodif.GestiondeStock.model;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Article")
public class Article extends AbstractEntity {



    private String CodeArticle;

    private String designation;

    private BigDecimal PrixUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal PrixUnitaireTtc;

    private String Photo;

    @ManyToOne
    @JoinColumn(name="idCategory")
    private Category category;


}
