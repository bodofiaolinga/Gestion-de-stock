package com.bodif.GestiondeStock.validator;

import com.bodif.GestiondeStock.dto.LigneCommandeClientDto;
import java.util.ArrayList;
import java.util.List;

public class LigneCommandeClientValidator {
    public List<String> validate(LigneCommandeClientDto dto){
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
