package com.bodif.GestiondeStock.repository;

import com.bodif.GestiondeStock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Integer, Article> {
}
