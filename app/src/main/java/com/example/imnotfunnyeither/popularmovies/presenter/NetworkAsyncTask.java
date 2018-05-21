package com.example.imnotfunnyeither.popularmovies.presenter;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

import com.example.imnotfunnyeither.popularmovies.BuildConfig;
import com.example.imnotfunnyeither.popularmovies.contracts.PopularMoviesContract;
import com.example.imnotfunnyeither.popularmovies.utils.NetworkUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkAsyncTask extends AsyncTask<PopularMoviesContract.View,Void,String> {
    private static final String TAG = PopularMoviesPresenter.class.getSimpleName();
    private static final String BASE_URL = "http://api.themoviedb.org";
    private static final String API_KEY = "api_key";
    private static final String POPULAR_MOVIE = "/3/movie/popular";
    private static final String METHOD_GET = "GET";
    private static final String TOP_RATED = "/3/movie/top_rated";
    private PopularMoviesContract.View view;

    @Override
    protected String doInBackground(PopularMoviesContract.View... params) {
        if(params.length <= 0) {
            return null;
        }
        view = params[0];
        HttpURLConnection httpURLConnection = null;
        BufferedReader bufferedReader = null;
        try {
            Uri uri = Uri.parse(BASE_URL)
                    .buildUpon()
                    .encodedPath(view.isPopularSorted() ? POPULAR_MOVIE : TOP_RATED)
                    .appendQueryParameter(API_KEY, BuildConfig.API_KEY).build();
            URL url = new URL(uri.toString());
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(METHOD_GET);
            httpURLConnection.connect();

            InputStream inputStream = httpURLConnection.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            StringBuilder stringBuilder = new StringBuilder();

            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line+System.lineSeparator());
            }
            return stringBuilder.toString();

        } catch (IOException e) {
            Log.e(TAG,"IO Exception",e);
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    Log.e(TAG,"Buffered Reader close error",e);
                }
            }
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        if (s != null) {
            Log.d("Test",s);
        }
        view.getPoplarMoviesAdapter().setMovies(NetworkUtils.getMovies(s));
    }
}
