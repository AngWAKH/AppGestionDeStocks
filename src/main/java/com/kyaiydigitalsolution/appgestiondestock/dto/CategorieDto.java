package com.kyaiydigitalsolution.appgestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kyaiydigitalsolution.appgestiondestock.model.Categorie;
import lombok.Builder;
import lombok.Data;
import java.util.List;
@Data
@Builder
public class  CategorieDto {

    private Integer id;

    private String code;

    private String designation;

    @JsonIgnore
    private List<ArticleDto> articles;

    //DTOs from Entity
    public CategorieDto fromEntity(Categorie categorie){
        if (categorie == null){
            return null;
            //TODO THROW AN EXCEPTION
        }
        //mapping categorie vers CategorieDto
        return  CategorieDto.builder()
                .id(categorie.getId())
                .code(categorie.getCode())
                .designation(categorie.getDesignation())
                .build();
    }

        //mapping CategorieDto vers categorie

    public Categorie toEntity(CategorieDto categorieDto){
        if(categorieDto == null){
            return null;
            //TODO THROW AN EXCEPTION
        }
        Categorie categorie = new Categorie();
        categorie.setId(categorieDto.getId());
        categorie.setCode(categorieDto.getCode());
        categorie.setDesignation(categorieDto.getDesignation());
        return categorie;
    }
}
