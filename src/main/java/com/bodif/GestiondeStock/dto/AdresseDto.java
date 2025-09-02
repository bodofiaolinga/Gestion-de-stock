package com.bodif.GestiondeStock.dto;


import com.bodif.GestiondeStock.model.Adresse;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AdresseDto {
    private String Adresse1;
    private String Adresse2;
    private String ville;
    private String codepostale;
    private String pays;


    public static AdresseDto fromEntity(Adresse adresse){

        if (adresse==null){
            return null;
        }
        return AdresseDto.builder()
                .Adresse1(adresse.getAdresse1())
                .Adresse2(adresse.getAdresse2())
                .ville(adresse.getVille())
                .codepostale(adresse.getCodepostale())
                .pays(adresse.getPays())
                .build();
    }

    public static Adresse toEntity(AdresseDto adresseDto){
        if (adresseDto==null){
            return null;
        }

        Adresse adresse=new Adresse();
        adresse.setAdresse1(adresseDto.getAdresse1());
        adresse.setAdresse2(adresseDto.getAdresse2());
        adresse.setVille(adresseDto.getVille());
        adresse.setCodepostale(adresse.getCodepostale());
        adresse.setPays(adresse.getPays());

        return adresse;
    }
}



