package com.bodif.GestiondeStock.repository;

import com.bodif.GestiondeStock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Integer, Client> {
}
