package com.bodif.GestiondeStock.dto;

import com.bodif.GestiondeStock.model.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;


import java.util.List;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {

    private Integer id;

    private String code;

    private String designation;

    @JsonIgnore
    private List<ArticleDto> articles;


    public static CategoryDto fromEntity(Category category){
     if(category==null){
         return null;
     }


         return CategoryDto.builder()
                 .id(category.getId())
                 .code(category.getCode())
                 .designation(category.getDesignation())
                 .build();
    }

    public static Category toEntity(CategoryDto categoryDto){
        if(categoryDto==null){
            return null;
        }
        Category category=new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());

        return category;

    }
}
