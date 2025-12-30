package com.lucca.biblioteca.repository;

import com.lucca.biblioteca.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Exemplo de método customizado (vamos usar depois)
    Usuario findByEmail(String email);
}
