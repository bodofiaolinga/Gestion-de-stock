package com.bodif.GestiondeStock.dto;

import com.bodif.GestiondeStock.model.Adresse;
import com.bodif.GestiondeStock.model.Category;
import com.bodif.GestiondeStock.model.Client;
import com.bodif.GestiondeStock.model.CommandeClient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Builder
@Data
public class ClientDto {

    private Integer id;
    private String nom;
    private String prenom;
    private AdresseDto adresse;
    private String photo;
    private String mail;
    private String numtel;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients;

    public static ClientDto fromEntity(Client client) {
        if (client == null) {
            return null;
        }

        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .adresse(AdresseDto.fromEntity(client.getAdresse()))
                .photo(client.getPhoto())
                .mail(client.getMail())
                .numtel(client.getNumtel())
                .build();
    }

    public static Client toEntity(ClientDto dto) {
        if (dto == null) {
            return null;
        }

        Client client = new Client();
        client.setId(dto.getId());
        client.setNom(dto.getNom());
        client.setPrenom(dto.getPrenom());
        client.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
        client.setPhoto(dto.getPhoto());
        client.setMail(dto.getMail());
        client.setNumtel(dto.getNumtel());

        return client;
    }
}

