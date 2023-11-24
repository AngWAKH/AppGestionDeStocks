package com.kyaiydigitalsolution.appgestiondestock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Data
//@Builder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Categorie")
public class Categorie extends AbstractEntity {


    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "designation")
    private String designation;


    @OneToMany
    private List<Article> articles;










}
