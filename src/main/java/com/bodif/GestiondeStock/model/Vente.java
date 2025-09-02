package com.bodif.GestiondeStock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Vente")
public class Vente extends AbstractEntity{

    private String code;

    private Instant dateVente;

    private String commentaire;
}
