package com.kwame.android.livenews.Fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.kwame.android.livenews.R;

/**
 * Created by Kwame on 5/18/2017.
 */
public class Settings extends PreferenceFragment {
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        //load preference from xml resource
        addPreferencesFromResource(R.xml.settings);
    }
}
