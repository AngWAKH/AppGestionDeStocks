package com.kyaiydigitalsolution.appgestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
//@Builder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CommandeClient")
public class CommandeClient extends AbstractEntity {

    //code ou référence
    @Column(name = "code")
    private String code;

    @Column(name = "dateCommande")
    private Instant dateCommande;


    @ManyToOne
    @JoinColumn(name = "idclient")
    private Client client;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;










}
