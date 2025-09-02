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
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "Entreprise")
public class Entreprise extends AbstractEntity {

    private String nom;

    private String description;

    @Embedded
    private Adresse adresse;

    private String codeFiscal;

    private String photo;

    private String mail;

    private String numtel;

    private String steWeb;

    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;
}
