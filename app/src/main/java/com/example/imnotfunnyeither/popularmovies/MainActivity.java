package com.example.imnotfunnyeither.popularmovies;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.imnotfunnyeither.popularmovies.adapter.PopularMoviesAdapter;
import com.example.imnotfunnyeither.popularmovies.contracts.PopularMoviesContract;
import com.example.imnotfunnyeither.popularmovies.presenter.PopularMoviesPresenter;

public class MainActivity extends AppCompatActivity implements PopularMoviesContract.View, SharedPreferences.OnSharedPreferenceChangeListener {

    private PopularMoviesAdapter popularMoviesAdapter;
    private SharedPreferences sharedPreferences;
    private PopularMoviesPresenter popularMoviesPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        popularMoviesAdapter = new PopularMoviesAdapter();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_movies);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(popularMoviesAdapter);
        popularMoviesPresenter = new PopularMoviesPresenter(this);
        popularMoviesPresenter.getMovies();
        if (getActionBar() != null) {
            getActionBar().show();
        }
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    public PopularMoviesAdapter getPoplarMoviesAdapter() {
        return popularMoviesAdapter;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.setting_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.sortSettings) {
            Intent intent = new Intent(this,SettingsActivity.class);
            startActivity(intent);
        }
        return true;
    }



    @Override
    public boolean isPopularSorted() {
        if (sharedPreferences == null) {
            return true;
        }
        return !sharedPreferences.getBoolean(getString(R.string.settings_sort_by),false);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        popularMoviesPresenter.getMovies();
    }


}
