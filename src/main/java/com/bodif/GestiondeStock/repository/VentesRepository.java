package com.bodif.GestiondeStock.repository;

import com.bodif.GestiondeStock.model.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentesRepository extends JpaRepository<Integer, Vente> {
}
