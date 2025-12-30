package com.lucca.biblioteca.repository;

import com.lucca.biblioteca.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
    
    boolean existsByIsbn(String isbn);
}
