package com.pedrin.projeto.infrastructure.repository;

import com.pedrin.projeto.infrastructure.entity.EnderecoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

public interface EnderecoRepository extends MongoRepository<EnderecoEntity, String> {
    EnderecoEntity findByUsuarioId(String usuarioId);

    @Transactional
    void deleteByUsuarioId(String usuarioId);
}
