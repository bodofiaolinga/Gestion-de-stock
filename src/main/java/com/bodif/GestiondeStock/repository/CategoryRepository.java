package com.bodif.GestiondeStock.repository;


import com.bodif.GestiondeStock.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Integer, Category> {
}
