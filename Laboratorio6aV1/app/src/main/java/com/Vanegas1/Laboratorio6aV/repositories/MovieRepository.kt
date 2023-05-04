package com.Vanegas1.Laboratorio6aV.repositories

import com.Vanegas1.Laboratorio6aV.data.model.MovieModel

class MovieRepository(private val movies: MutableList<MovieModel>) {

    fun getMovies() = movies
    fun addMovies(movie: MovieModel) = movies.add(movie)
}