package com.example.imnotfunnyeither.popularmovies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.imnotfunnyeither.popularmovies.R;
import com.example.imnotfunnyeither.popularmovies.utils.NetworkConstants;
import com.squareup.picasso.Picasso;

public class PopularMoviesViewHolder extends RecyclerView.ViewHolder {
    private final Context context;
    private ImageView moviePoster;

    public PopularMoviesViewHolder(View itemView) {
        super(itemView);
        moviePoster = itemView.findViewById(R.id.iv_movie_poster);
        context = itemView.getContext();
    }

    public void setMoviePoster(String path) {
        int height = itemView.getContext().getResources().getDisplayMetrics().heightPixels/2;
        int width = itemView.getContext().getResources().getDisplayMetrics().widthPixels/2;
        Picasso.with(context).load(NetworkConstants.IMAGE_BASE_URL+ NetworkConstants.SCREEN_WIDTH+path).resize(width,height).into(moviePoster);
    }
}
