package com.example.imnotfunnyeither.popularmovies.model;

import java.io.Serializable;
import java.util.List;

public class PopularMovie implements Serializable {

    private int voteCount;
    private long id;
    private boolean video;
    private double voteAverage;
    private String title;
    private double popularity;
    private String posterPath;
    private String originalLanguage;
    private String originalTitle;
    private List genreIds;
    private String backDropPath;
    private boolean adult;
    private String overview;
    private String releaseDate;

    private PopularMovie(PopularMovieBuilder builder) {
        this.voteCount = builder.voteCount;
        this.id = builder.id;
        this.video = builder.video;
        this.voteAverage = builder.voteAverage;
        this.title = builder.title;
        this.popularity = builder.popularity;
        this.posterPath = builder.posterPath;
        this.originalLanguage = builder.originalLanguage;
        this.originalTitle = builder.originalTitle;
        this.genreIds = builder.genreIds;
        this.backDropPath = builder.backDropPath;
        this.adult = builder.adult;
        this.overview = builder.overview;
        this.releaseDate = builder.releaseDate;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public List getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List genreIds) {
        this.genreIds = genreIds;
    }

    public String getBackDropPath() {
        return backDropPath;
    }

    public void setBackDropPath(String backDropPath) {
        this.backDropPath = backDropPath;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public static class PopularMovieBuilder {
        private int voteCount;
        private long id;
        private boolean video;
        private double voteAverage;
        private String title;
        private double popularity;
        private String posterPath;
        private String originalLanguage;
        private String originalTitle;
        private List genreIds;
        private String backDropPath;
        private boolean adult;
        private String overview;
        private String releaseDate;

        public PopularMovieBuilder(){
            //used for builder pattern
        }

        public PopularMovieBuilder voteCount(int voteCount) {
            this.voteCount = voteCount;
            return this;
        }

        public PopularMovieBuilder movieId(long id) {
            this.id = id;
            return this;
        }

        public PopularMovieBuilder isVideo(boolean video) {
            this.video = video;
            return this;
        }

        public PopularMovieBuilder voteAverage(double voteAverage) {
            this.voteAverage = voteAverage;
            return this;
        }

        public PopularMovieBuilder movieTitle(String title) {
            this.title = title;
            return this;
        }

        public PopularMovieBuilder popularity(double popularity) {
            this.popularity = popularity;
            return this;
        }

        public PopularMovieBuilder posterPath(String posterPath) {
            this.posterPath = posterPath;
            return this;
        }

        public PopularMovieBuilder originalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
            return this;
        }

        public PopularMovieBuilder originalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
            return this;
        }

        public PopularMovieBuilder genreIds(List genreIds) {
            this.genreIds = genreIds;
            return this;
        }

        public PopularMovieBuilder backDropPath(String backDropPath) {
            this.backDropPath = backDropPath;
            return this;
        }

        public PopularMovieBuilder adult(boolean adult) {
            this.adult = adult;
            return this;
        }

        public PopularMovieBuilder overview(String overview) {
            this.overview = overview;
            return this;
        }

        public PopularMovieBuilder releaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public PopularMovie build(){
            return new PopularMovie(this);
        }

    }
}
