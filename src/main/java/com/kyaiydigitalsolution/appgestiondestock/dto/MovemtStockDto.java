package com.kyaiydigitalsolution.appgestiondestock.dto;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;


@Data
@Builder
public class MovemtStockDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    //verifier typeMvtStkDto??
    private TypeMvtStkDto typeMvtStk;
}
