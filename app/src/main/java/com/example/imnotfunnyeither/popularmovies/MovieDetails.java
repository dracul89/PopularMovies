package com.example.imnotfunnyeither.popularmovies;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.imnotfunnyeither.popularmovies.databinding.ActivityMovieDetailsBinding;
import com.example.imnotfunnyeither.popularmovies.model.PopularMovie;
import com.example.imnotfunnyeither.popularmovies.utils.NetworkConstants;
import com.squareup.picasso.Picasso;

public class MovieDetails extends AppCompatActivity {

    public static final String MOVIE = "movie_details";
    public static final String OF_TEN = "/10";
    public static final double RATIO = .4;
    public static final int HALF = 2;
    ActivityMovieDetailsBinding dataBinding;
    private PopularMovie popularMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        Intent intent = getIntent();
        if (intent != null) {
            popularMovie = (PopularMovie) intent.getSerializableExtra(MOVIE);
        }
        populateData();
    }

    private void populateData() {
        if (popularMovie == null) {
            return;
        }
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_movie_details);
        dataBinding.setMovie(popularMovie);
        double pictureWidth =  getResources().getDisplayMetrics().widthPixels* RATIO;
        double pictureHeight = (pictureWidth/ HALF)+pictureWidth;
        Picasso.with(this)
                .load(NetworkConstants.IMAGE_BASE_URL+ NetworkConstants.SCREEN_WIDTH+popularMovie.getPosterPath())
                .resize((int)pictureWidth, (int)pictureHeight)
                .into((ImageView) findViewById(R.id.iv_movie_poster_details));
        TextView yearTextView = findViewById(R.id.tv_year);
        yearTextView.setText(popularMovie.getReleaseDate().substring(0,4));
        TextView votesTextView = findViewById(R.id.tv_votes);
        StringBuilder builder = new StringBuilder();
        builder.append(popularMovie.getVoteAverage())
                .append(OF_TEN);
        votesTextView.setText(builder.toString());
    }
}
