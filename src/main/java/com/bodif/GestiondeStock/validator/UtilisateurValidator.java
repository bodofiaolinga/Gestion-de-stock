package com.bodif.GestiondeStock.validator;


import com.bodif.GestiondeStock.dto.CategoryDto;
import com.bodif.GestiondeStock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {
    public List<String> validate(UtilisateurDto utilisateurDto){
        List<String> errors =new ArrayList<>();

        if(utilisateurDto==null){
            errors.add("veuiller renseigner le champ nom de l'utilisateur");
            errors.add("veuiller renseigner le champ prenom de l'utilisateur");
            errors.add("veuiller renseigner le champ mot de passe de l'utilisateur");
            errors.add("veuiller renseigner l'adresse de l'utilisateur");
            return errors;
        }

        if(!StringUtils.hasLength(utilisateurDto.getNom())){
            errors.add("veuiller renseigner le champ nom de l'utilisateur");
        }

        if(!StringUtils.hasLength(utilisateurDto.getPrenom())){
            errors.add("veuiller renseigner le champ prenom de l'utilisateur");
        }

        if(!StringUtils.hasLength(utilisateurDto.getMotDePasse())){
            errors.add("veuiller renseigner le champ mot de passe de l'utilisateur");
        }
        if(utilisateurDto.getDateDeNaissance()==null){
            errors.add("veuiller renseigner la date de naissance ");
        }

        if(utilisateurDto.getAdresse()==null){
            errors.add("veuiller renseigner l'adresse de l'utilisateur");
        }else{

            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getAdresse1())){
                errors.add(" le champ adresse1 est obligatoire ");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getVille())){
                errors.add(" le champ ville est obligatoire ");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getCodepostale())){
                errors.add(" le champ code postal est obligatoire ");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getPays())){
                errors.add(" le champ pays est obligatoire ");
            }

        }


        return errors;
    }

}
