package com.bodif.GestiondeStock.repository;

import com.bodif.GestiondeStock.model.MvtStk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStkRepository extends JpaRepository<Integer, MvtStk> {
}
