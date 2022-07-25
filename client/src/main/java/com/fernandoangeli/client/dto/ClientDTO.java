package com.fernandoangeli.client.dto;

import com.fernandoangeli.client.entities.Client;
import lombok.Data;

import java.time.Instant;

@Data
public class ClientDTO {

    private Long id;
    private String name;
    private String cpf;
    private Double income;
    private Instant birthDate;
    private Integer children;

    public ClientDTO(Client client){
        this.id = client.getId();
        this.name = client.getName();
        this.cpf = client.getCpf();
        this.income = client.getIncome();
        this.birthDate = client.getBirthDate();
        this.children = client.getChildren();
    }
}
