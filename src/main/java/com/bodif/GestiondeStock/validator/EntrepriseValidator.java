package com.bodif.GestiondeStock.validator;

import com.bodif.GestiondeStock.dto.ClientDto;
import com.bodif.GestiondeStock.dto.EntrepriseDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {

    public List<String> validate(EntrepriseDto dto){
        List<String> errors =new ArrayList<>();

        if (dto==null){
            errors.add("veuiller renseigner le nom de l'entreprise");
            errors.add("veuiller renseigner la description ");
            errors.add("veuiller renseigner le code fiscal de l'entreprise");
            errors.add("veuiller renseigner le mail de l'entreprise");
            errors.add("veuiller renseigner le numero de telephone de l'entreprise");
            errors.add("veuiller renseigner le site web de l'entreprise");
            return errors;
        }

        if (StringUtils.hasLength(dto.getNom())){
            errors.add("veuiller renseigner le nom de l'entreprise");
        }
        if (StringUtils.hasLength(dto.getDescription())){
            errors.add("veuiller renseigner la description ");
        }
        if (StringUtils.hasLength(dto.getCodeFiscal())){
            errors.add("veuiller renseigner le code fiscal de l'entreprise");
        }
        if (StringUtils.hasLength(dto.getMail())){
            errors.add("veuiller renseigner le mail de l'entreprise");
        }
        if (StringUtils.hasLength(dto.getNumtel())){
            errors.add("veuiller renseigner le numero de telephone de l'entreprise");
        }
        if (StringUtils.hasLength(dto.getSteWeb())){
            errors.add("veuiller renseigner le site web de l'entreprise");
        }


        return errors;
    }
}
