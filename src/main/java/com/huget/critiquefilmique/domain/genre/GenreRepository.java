package com.huget.critiquefilmique.domain.genre;

import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

interface GenreRepository extends CrudRepository<Genre, Long> {
    Optional<Genre> findByNameIgnoreCase(String name);
}
