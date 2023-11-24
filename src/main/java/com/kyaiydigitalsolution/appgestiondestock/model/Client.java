package com.kyaiydigitalsolution.appgestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
//@Builder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Client")
public class Client extends AbstractEntity {

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

//@Embedded ?? Pourquoi ?
    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    @Column(name = "email")
    private String email;

    @Column(name = "numTel")
    private String numTel;

    @OneToMany(mappedBy = "Client")
    private List<CommandeClient> commandeClients;

}
