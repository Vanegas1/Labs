package com.Vanegas1.Laboratorio6aV

import android.app.Application
import com.Vanegas1.Laboratorio6aV.data.movies
import com.Vanegas1.Laboratorio6aV.repositories.MovieRepository

class MovieReviewerApplication : Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}