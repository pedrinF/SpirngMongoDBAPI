package com.pedrin.projeto.infrastructure.entity;

import lombok.*;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "usuario_entity")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioEntity {

    @Id
    private String id;
    private String nome;
    private String email;
    private String documento;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAtualizacao;
}
