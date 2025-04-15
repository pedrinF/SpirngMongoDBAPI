package com.pedrin.projeto.business;

import com.pedrin.projeto.api.converter.UsuarioConverter;
import com.pedrin.projeto.api.converter.UsuarioMapper;
import com.pedrin.projeto.api.request.UsuarioRequestDTO;
import com.pedrin.projeto.api.response.UsuarioResponseDTO;
import com.pedrin.projeto.infrastructure.entity.EnderecoEntity;
import com.pedrin.projeto.infrastructure.entity.UsuarioEntity;
import com.pedrin.projeto.infrastructure.exceptions.BusinessException;
import com.pedrin.projeto.infrastructure.repository.EnderecoRepository;
import com.pedrin.projeto.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static org.springframework.util.Assert.notNull;

@Service
@RequiredArgsConstructor
public class EnderecoService {
    private final EnderecoRepository enderecoRepository;


    public EnderecoEntity salvaEndereco(EnderecoEntity enderecoEntity) {
        return enderecoRepository.save(enderecoEntity);
    }

    public EnderecoEntity findByUsuarioId(String usuarioId) {
        return enderecoRepository.findByUsuarioId(usuarioId);
    }

    public void deleteByUsuarioId(String usuarioId) {
        enderecoRepository.deleteByUsuarioId(usuarioId);
    }
}
