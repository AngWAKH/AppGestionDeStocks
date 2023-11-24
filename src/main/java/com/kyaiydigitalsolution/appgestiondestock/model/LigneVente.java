package com.kyaiydigitalsolution.appgestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
//@Builder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LigneVente")
public class LigneVente extends AbstractEntity {


    @ManyToOne
    @JoinColumn(name = "idvente")
    private Ventes ventes;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;
}
