package com.pedrin.projeto.api.converter;

import com.pedrin.projeto.api.request.EnderecoRequestDTO;
import com.pedrin.projeto.api.request.UsuarioRequestDTO;
import com.pedrin.projeto.infrastructure.entity.EnderecoEntity;
import com.pedrin.projeto.infrastructure.entity.UsuarioEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class UsuarioConverter {



    public UsuarioEntity paraUsuarioEntity(UsuarioRequestDTO usuarioDTO) {
        return UsuarioEntity.builder()
                .id(UUID.randomUUID().toString())
                .nome(usuarioDTO.getNome())
                .documento(usuarioDTO.getDocumento())
                .email(usuarioDTO.getEmail())
                .dataCadastro(LocalDateTime.now())
                .build();

    }


    public EnderecoEntity paraEnderecoEntity(EnderecoRequestDTO enderecoDTO, String usuarioId) {
        return EnderecoEntity.builder()
                .rua(enderecoDTO.getRua())
                .bairro(enderecoDTO.getBairro())
                .usuarioId(usuarioId)
                .cep(enderecoDTO.getCep())
                .cidade(enderecoDTO.getCidade())
                .numero(enderecoDTO.getNumero())
                .complemento(enderecoDTO.getComplemento())
                .build();
    }

}