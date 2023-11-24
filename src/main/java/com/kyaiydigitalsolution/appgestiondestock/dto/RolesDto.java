package com.kyaiydigitalsolution.appgestiondestock.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

    private Integer id;

    private String rolename;

    private UtilisateurDto utilisateur;
}
