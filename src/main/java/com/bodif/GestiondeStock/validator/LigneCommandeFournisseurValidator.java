package com.bodif.GestiondeStock.validator;

import com.bodif.GestiondeStock.dto.LigneCommandeClientDto;
import com.bodif.GestiondeStock.dto.LigneCommandeFournisseurDto;

import java.util.ArrayList;
import java.util.List;

public class LigneCommandeFournisseurValidator {
    public List<String> validate(LigneCommandeFournisseurDto dto){
        List<String> errors =new ArrayList<>();

        if(dto.getQuantite()==null){
            errors.add("veuiller renseigner la quantite ");
        }
        if(dto.getPrixUnitaire()==null){
            errors.add("veuiller renseigner le prix unitaire ");
        }

        return errors;
    }
}
