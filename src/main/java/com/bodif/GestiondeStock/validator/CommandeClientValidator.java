package com.bodif.GestiondeStock.validator;

import com.bodif.GestiondeStock.dto.CommandeClientDto;
import com.bodif.GestiondeStock.dto.CommandeFournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeClientValidator {

    public List<String> validate(CommandeFournisseurDto dto){
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
