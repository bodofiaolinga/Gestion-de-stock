package com.bodif.GestiondeStock.validator;

import com.bodif.GestiondeStock.dto.ClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {

    public List<String> validate(ClientDto dto){
        List<String> errors =new ArrayList<>();

        if (dto==null){
            errors.add("veuiller renseigner le nom du  Fournisseur");
            errors.add("veuiller renseigner le prenom du  Fournisseur");
            errors.add("veuiller renseigner le mail du  Fournisseur");
            errors.add("veuiller renseigner le numero de telephone du  Fournisseur");
            return errors;
        }

        if (StringUtils.hasLength(dto.getNom())){
            errors.add("veuiller renseigner le nom du Fournisseur");
        }
        if (StringUtils.hasLength(dto.getPrenom())){
            errors.add("veuiller renseigner le prenom du  Fournisseur");
        }
        if (StringUtils.hasLength(dto.getMail())){
            errors.add("veuiller renseigner le mail du  Fournisseur");
        }
        if (StringUtils.hasLength(dto.getNumtel())){
            errors.add("veuiller renseigner le numero de telephone du  Fournisseur");
        }


        return errors;
    }
}
