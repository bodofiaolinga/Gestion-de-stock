package com.bodif.GestiondeStock.model;

import jakarta.persistence.Embeddable;
import lombok.*;

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
    private Integer idEntreprise;
}
