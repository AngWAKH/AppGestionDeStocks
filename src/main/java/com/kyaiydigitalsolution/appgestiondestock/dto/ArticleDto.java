package com.kyaiydigitalsolution.appgestiondestock.dto;
import com.kyaiydigitalsolution.appgestiondestock.model.Article;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {

    private Integer id;

    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private String photo;

    private CategorieDto categorieDto;


    public ArticleDto fromEntity(Article article){
        if(article == null){
            return null;
        }
        return ArticleDto.builder()
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .tauxTva(article.getTauxTva())
                .photo(article.getPhoto())
                .build();
    }


    public Article toEntity(ArticleDto articleDto){
        if(articleDto == null){
            return null;
        }
        Article article = new Article();
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
        article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
        article.setPhoto(articleDto.getPhoto());
        return article;
    }

}
