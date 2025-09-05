package com.bodif.GestiondeStock.repository;

import com.bodif.GestiondeStock.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Integer, Entreprise> {
}
