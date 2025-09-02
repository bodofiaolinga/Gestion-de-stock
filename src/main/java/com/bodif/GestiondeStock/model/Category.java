package com.bodif.GestiondeStock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;


import java.util.List;

@Getter
@Setter
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
