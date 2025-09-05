package com.bodif.GestiondeStock.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "CommandeClient")
public class CommandeClient extends AbstractEntity {



    private String code;

    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name="ideclient")
    private Client client;
    private Integer idEntreprise;
    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient>ligneCommandeClients;

}
