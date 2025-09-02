package com.bodif.GestiondeStock.validator;

import com.bodif.GestiondeStock.dto.ClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {

    public List<String> validate(ClientDto dto){
        List<String> errors =new ArrayList<>();

        if (dto==null){
            errors.add("veuiller renseigner le nom du client");
            errors.add("veuiller renseigner le prenom du client");
            errors.add("veuiller renseigner le mail du client");
            errors.add("veuiller renseigner le numero de telephone du client");
            return errors;
        }

      if (StringUtils.hasLength(dto.getNom())){
          errors.add("veuiller renseigner le nom du client");
      }
        if (StringUtils.hasLength(dto.getPrenom())){
            errors.add("veuiller renseigner le prenom du client");
        }
        if (StringUtils.hasLength(dto.getMail())){
            errors.add("veuiller renseigner le mail du client");
        }
        if (StringUtils.hasLength(dto.getNumtel())){
            errors.add("veuiller renseigner le numero de telephone du client");
        }


        return errors;
    }
}
