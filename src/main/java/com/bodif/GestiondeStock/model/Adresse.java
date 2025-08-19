package com.bodif.GestiondeStock.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adresse {

    private String Adresse1;
    private String Adresse2;
    private String ville;
    private String codepostale;
    private String pays;
}
