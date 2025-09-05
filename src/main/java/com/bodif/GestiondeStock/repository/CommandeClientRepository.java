package com.bodif.GestiondeStock.repository;

import com.bodif.GestiondeStock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<Integer, CommandeClient> {
}
