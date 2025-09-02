package com.bodif.GestiondeStock.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "CommandeFournisseur")
public class CommandeFournisseur extends AbstractEntity{

    private String code;

    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name="idFournisseur")
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
}
