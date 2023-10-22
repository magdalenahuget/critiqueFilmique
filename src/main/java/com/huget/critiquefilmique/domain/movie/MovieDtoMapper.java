package com.huget.critiquefilmique.domain.movie;

import com.huget.critiquefilmique.domain.movie.dto.MovieDto;

public class MovieDtoMapper {
    static MovieDto map(Movie movie){
        return new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getOriginalTitle(),
                movie.getReleaseYear(),
                movie.getGenre().getName(),
                movie.isPromoted()
        );
    }
}