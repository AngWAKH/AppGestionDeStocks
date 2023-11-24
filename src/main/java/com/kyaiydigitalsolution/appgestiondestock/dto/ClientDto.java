package com.kyaiydigitalsolution.appgestiondestock.dto;
import com.kyaiydigitalsolution.appgestiondestock.model.Client;
import lombok.Builder;
import lombok.Data;
import java.util.List;
@Data
@Builder
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String email;

    private String numTel;

    private List<CommandeClientDto> commandeClients;


    public ClientDto fromEntity(Client client){
        if(client == null){
            return null;
        }
        return ClientDto.builder()
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .photo(client.getPhoto())
                .email(client.getEmail())
                .numTel(client.getNumTel())
                .build();
    }

    public Client toEntity(ClientDto clientDto){
        if(clientDto == null){
            return null;
        }
        Client client = new Client();
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setPhoto(client.getPhoto());
        client.setEmail(clientDto.getEmail());
        client.setNumTel(clientDto.getNumTel());
        return client;
    }



}
