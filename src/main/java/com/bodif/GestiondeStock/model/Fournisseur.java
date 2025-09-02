package com.bodif.GestiondeStock.model;


import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Fournisseur")
public class Fournisseur extends AbstractEntity{

    private String nom;

    private String prenom;

    @Embedded
    private Adresse adresse;

    private String photo;

    private String mail;

    private String numtel;

    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur>commandeFournisseurs;
}
