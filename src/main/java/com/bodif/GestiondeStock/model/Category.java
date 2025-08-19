package com.bodif.GestiondeStock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Category")
public class Category extends AbstractEntity{

    private String code;

    private String designation;

    @OneToMany(mappedBy = "category")
    private List<Article> Articles;
}
