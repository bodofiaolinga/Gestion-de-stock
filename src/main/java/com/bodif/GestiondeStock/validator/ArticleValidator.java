package com.bodif.GestiondeStock.validator;

import com.bodif.GestiondeStock.dto.ArticleDto;
import com.bodif.GestiondeStock.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {

    public List<String> validate(ArticleDto dto){
        List<String> errors =new ArrayList<>();

        if(dto==null){
            errors.add("veuiller renseigner le code de l'article ");
            errors.add("veuiller renseigner le prix unitaire de l'article ");
            errors.add("veuiller renseigner le taux tva de l'article ");
            errors.add("veuiller renseigner le prix ttc de l'article ");
            return errors;
        }

        if(!StringUtils.hasLength(dto.getCodeArticle())){
            errors.add("veuiller renseigner le code de l'article ");
        }
        if(dto.getPrixUnitaireHt()==null){
            errors.add("veuiller renseigner le prix unitaire de l'article ");
        }
        if(dto.getTauxTva()==null){
            errors.add("veuiller renseigner le taux tva de l'article ");
        }
        if(dto.getPrixUnitaireTtc()==null){
            errors.add("veuiller renseigner le prix ttc de l'article ");
        }
        if(dto.getCategory()==null){
            errors.add("veuiller selectionner une categories  ");
        }

        return errors;
    }
}
