package com.bodif.GestiondeStock.validator;

import com.bodif.GestiondeStock.dto.MvtStkDto;
import com.bodif.GestiondeStock.dto.RolesDto;

import java.util.ArrayList;
import java.util.List;

public class RolesValidator {

    public List<String> validate(RolesDto dto){
        List<String> errors =new ArrayList<>();

        if(dto.getRoleName()==null){
            errors.add("veuiller renseigner le role ");
        }

        return errors;
    }
}
