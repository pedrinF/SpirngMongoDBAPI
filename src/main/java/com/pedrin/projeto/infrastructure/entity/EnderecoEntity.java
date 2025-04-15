package com.pedrin.projeto.infrastructure.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "endereco_entity")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnderecoEntity {
    @Id
    private String id;
    private String usuarioId;
    private String rua;
    private Long numero;
    private String bairro;
    private String cidade;
    private String cep;
    private String complemento;
}
