package com.bodif.GestiondeStock.validator;

import com.bodif.GestiondeStock.dto.ArticleDto;
import com.bodif.GestiondeStock.dto.VentesDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class VentesValidator {
    public List<String> validate(VentesDto dto){
        List<String> errors =new ArrayList<>();

        if(dto==null){
            errors.add("veuiller renseigner le code de vente");
            errors.add("veuiller renseigner la date de vente");
            errors.add("veuiller renseigner le commentaire ");
            return errors;
        }

        if(!StringUtils.hasLength(dto.getCode())){
            errors.add("veuiller renseigner le code de vente");
        }
        if(dto.getDateVente()==null){
            errors.add("veuiller renseigner la date de vente");
        }
        if(!StringUtils.hasLength(dto.getCommentaire())){
            errors.add("veuiller renseigner le commentaire ");
        }

        return errors;
    }
}
