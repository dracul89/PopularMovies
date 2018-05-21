package com.example.imnotfunnyeither.popularmovies.utils;

import android.util.Log;

import com.example.imnotfunnyeither.popularmovies.model.PopularMovie;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class NetworkUtils {

    private static final String TAG = NetworkUtils.class.getSimpleName();
    private static final String MOVIE_RESULTS = "results";
    private static final String VOTE_COUNT = "vote_count";
    private static final String MOVIE_ID = "id";
    private static final String VIDEO = "video";
    private static final String VOTE_AVERAGE = "vote_average";
    private static final String TITLE = "title";
    private static final String POPULARITY = "popularity";
    private static final String POSTER_PATH = "poster_path";
    private static final String ORIGINAL_LANGUAGE = "original_language";
    private static final String ORIGINAL_TITLE = "original_title";
    private static final String BACKDROP_PATH = "backdrop_path";
    private static final String OVERVIEW = "overview";
    private static final String ADULT = "adult";
    private static final String RELEASE_DATE = "release_date";
    private static final String GENRE_IDS = "genre_ids";

    private NetworkUtils() {}

    public static List<PopularMovie> getMovies(String jsonResponse) {
        List<PopularMovie> movies = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(jsonResponse);
            JSONArray jsonArray = jsonObject.optJSONArray(MOVIE_RESULTS);
            for (int i=0;i < jsonArray.length();i++) {
                movies.add(getMovie((JSONObject) jsonArray.get(i)));
            }
        } catch (JSONException e) {
            Log.e(TAG,"Popular Get Movies Parse",e);
        }
        return movies;

    }

    private static PopularMovie getMovie(JSONObject jsonObject) throws JSONException {
        PopularMovie.PopularMovieBuilder builder = new PopularMovie.PopularMovieBuilder();
        builder.voteCount(jsonObject.optInt(VOTE_COUNT));
        builder.movieId(jsonObject.optLong(MOVIE_ID));
        builder.isVideo(jsonObject.optBoolean(VIDEO));
        builder.voteAverage(jsonObject.optDouble(VOTE_AVERAGE));
        builder.movieTitle(jsonObject.optString(TITLE));
        builder.popularity(jsonObject.optDouble(POPULARITY));
        builder.posterPath(jsonObject.optString(POSTER_PATH));
        builder.originalLanguage(jsonObject.optString(ORIGINAL_LANGUAGE));
        builder.originalTitle(jsonObject.optString(ORIGINAL_TITLE));
        builder.backDropPath(jsonObject.optString(BACKDROP_PATH));
        builder.overview(jsonObject.optString(OVERVIEW));
        builder.adult(jsonObject.optBoolean(ADULT));
        builder.releaseDate(jsonObject.optString(RELEASE_DATE));
        builder.genreIds(getGenre(jsonObject.optJSONArray(GENRE_IDS)));
        return builder.build();
    }

    private static List getGenre(JSONArray jsonArray) throws JSONException {
        List genres = new ArrayList();
        for (int i = 0;i < jsonArray.length(); i++) {
            genres.add(jsonArray.getInt(i));
        }
        return genres;
    }
}
