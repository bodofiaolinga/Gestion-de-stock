package com.bodif.GestiondeStock.validator;

import com.bodif.GestiondeStock.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {

    public List<String> validate(CategoryDto categoryDto){
        List<String> errors =new ArrayList<>();

        if(categoryDto==null || !StringUtils.hasLength(categoryDto.getCode())){
            errors.add("veuiller renseigner le champ code ");
        }

        return errors;
    }
}
