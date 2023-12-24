package br.com.fiap.parquimetroapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document   //anotação para o MongoDB
@Data       //anotação para o Lombok
public class Cliente {
    @Id
    private String id;
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Integer codTipoPagamentoPreferencial;

    @DBRef
    private Veiculo veiculo;
}
