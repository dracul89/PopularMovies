package com.example.imnotfunnyeither.popularmovies.contracts;

import com.example.imnotfunnyeither.popularmovies.adapter.PopularMoviesAdapter;

public interface PopularMoviesContract {
    public interface View {
        PopularMoviesAdapter getPoplarMoviesAdapter();
        boolean isPopularSorted();

        void makeErrorToast(String error);
    }
    public interface Presenter<T> {
        void getMovies();
    }
}
