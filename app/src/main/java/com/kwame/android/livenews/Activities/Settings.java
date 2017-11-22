package com.kwame.android.livenews.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.kwame.android.livenews.R;

/**
 * Created by Kwame on 5/18/2017.
 */
public class Settings extends AppCompatActivity {
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar);

        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        mToolbar.setTitle("Settings");
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        //Display fragment as main content
        getFragmentManager().beginTransaction()
                .replace(R.id.settings_container, new com.kwame.android.livenews.Fragments.Settings())
                .commit();
    }
}
