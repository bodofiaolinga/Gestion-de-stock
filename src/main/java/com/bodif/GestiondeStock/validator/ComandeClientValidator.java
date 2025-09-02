package com.bodif.GestiondeStock.validator;

import com.bodif.GestiondeStock.dto.CategoryDto;
import com.bodif.GestiondeStock.dto.CommandeClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ComandeClientValidator {

    public List<String> validate(CommandeClientDto dto){
        List<String> errors =new ArrayList<>();

        if(!StringUtils.hasLength(dto.getCode())){
            errors.add("veuiller renseigner le champ code ");
        }

        if(dto==null){
            errors.add("veuiller renseigner la date de commande  ");
        }

        return errors;
    }
}
