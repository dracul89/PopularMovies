package com.example.imnotfunnyeither.popularmovies.view;


import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import com.example.imnotfunnyeither.popularmovies.R;

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.app_preferences);
    }
}
