package com.example.imnotfunnyeither.popularmovies.adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.imnotfunnyeither.popularmovies.MovieDetails;
import com.example.imnotfunnyeither.popularmovies.R;
import com.example.imnotfunnyeither.popularmovies.model.PopularMovie;

import java.util.ArrayList;
import java.util.List;

public class PopularMoviesAdapter extends RecyclerView.Adapter<PopularMoviesViewHolder> implements View.OnClickListener {

    List<PopularMovie> movies = new ArrayList<>();

    @NonNull
    @Override
    public PopularMoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_card, parent, false);
        view.setOnClickListener(this);
        return new PopularMoviesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularMoviesViewHolder holder, int position) {
        PopularMovie movie = movies.get(position);
        holder.itemView.setTag(position);
        holder.setMoviePoster(movie.getPosterPath());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public void setMovies(List<PopularMovie> movies) {
        this.movies = movies;
        notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        int position = Integer.valueOf(String.valueOf(v.getTag()));
        PopularMovie movie = movies.get(position);
        Intent intent = new Intent(v.getContext(), MovieDetails.class);
        intent.putExtra(MovieDetails.MOVIE,movie);
        v.getContext().startActivity(intent);
    }
}
