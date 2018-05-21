package com.example.imnotfunnyeither.popularmovies.presenter;


import com.example.imnotfunnyeither.popularmovies.contracts.PopularMoviesContract;

public class PopularMoviesPresenter implements PopularMoviesContract.Presenter {


    private PopularMoviesContract.View view;

    public PopularMoviesPresenter(PopularMoviesContract.View view) {
        this.view = view;

    }

    @Override
    public void getMovies() {
        new NetworkAsyncTask().execute(view);
    }
}
