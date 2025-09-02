package com.bodif.GestiondeStock.validator;

import com.bodif.GestiondeStock.dto.LigneVenteDto;
import com.bodif.GestiondeStock.dto.MvtStkDto;

import java.util.ArrayList;
import java.util.List;

public class MvtStkValidator {

    public List<String> validate(MvtStkDto dto){
        List<String> errors =new ArrayList<>();

        if(dto.getQuantite()==null){
            errors.add("veuiller renseigner la quantite ");
        }
        if(dto.getDateMvt()==null){
            errors.add("veuiller renseigner du mvt de stock");
        }

        return errors;
    }
}
