package br.com.fiap.parquimetroapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document   //anotação para o MongoDB
@Data       //anotação para o Lombok
public class Veiculo {
    @Id
    private String id;
    private String placa;
    private String marca;
    private String modelo;
    private Integer anoModelo;
}
