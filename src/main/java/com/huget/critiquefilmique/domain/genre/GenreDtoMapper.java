package com.huget.critiquefilmique.domain.genre;

import com.huget.critiquefilmique.domain.genre.dto.GenreDto;

class GenreDtoMapper {
    static GenreDto map(Genre genre) {
        return new GenreDto(
                genre.getId(),
                genre.getName(),
                genre.getDescription()
        );
    }
}
