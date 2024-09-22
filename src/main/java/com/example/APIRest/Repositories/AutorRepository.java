package com.example.APIRest.Repositories;

import com.example.APIRest.Entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}