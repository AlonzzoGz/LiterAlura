package com.LiterAlura.AluraCursos.repository;

import com.LiterAlura.AluraCursos.model.Idioma;
import com.LiterAlura.AluraCursos.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    Libro findLibroByTitulo(String nombre);
    List<Libro> findLibroByIdioma(Idioma idioma);
}
