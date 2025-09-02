package com.bodif.GestiondeStock.dto;


import com.bodif.GestiondeStock.model.CommandeClient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public class CommandeClientDto {

        private Integer id;
        private String code;
        private Instant dateCommande;
        private ClientDto client;
        private List<LigneCommandeClientDto> ligneCommandeClients;

        public static CommandeClientDto fromEntity(CommandeClient commandeClient) {
            if (commandeClient == null) {
                return null;
            }

            return CommandeClientDto.builder()
                    .id(commandeClient.getId())
                    .code(commandeClient.getCode())
                    .dateCommande(commandeClient.getDateCommande())
                    .client(ClientDto.fromEntity(commandeClient.getClient()))
                    .ligneCommandeClients(
                            commandeClient.getLigneCommandeClients() == null ? null :
                                    commandeClient.getLigneCommandeClients().stream()
                                            .map(LigneCommandeClientDto::fromEntity)
                                            .collect(Collectors.toList())
                            )
                    .build();
        }

        public static CommandeClient toEntity(CommandeClientDto dto) {
            if (dto == null) {
                return null;
            }

            CommandeClient commandeClient = new CommandeClient();
            commandeClient.setId(dto.getId());
            commandeClient.setCode(dto.getCode());
            commandeClient.setDateCommande(dto.getDateCommande());
            commandeClient.setClient(ClientDto.toEntity(dto.getClient()));
            commandeClient.setLigneCommandeClients(
                    dto.getLigneCommandeClients() == null ? null :
                            dto.getLigneCommandeClients().stream()
                                    .map(LigneCommandeClientDto::toEntity)
                                    .collect(Collectors.toList())
            );
            return commandeClient;
        }
    }




