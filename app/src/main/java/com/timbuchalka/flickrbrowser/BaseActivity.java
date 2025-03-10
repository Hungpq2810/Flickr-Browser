package com.timbuchalka.flickrbrowser;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;


public class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";
    static final String FLICKR_QUERY = "FLICKR_QUERY";
    static final String PHOTO_TRANSFER = "PHOTO_TRANSFER";

    void activateToolbar(boolean enableHome) {
//        setSupportActionBar(null);  // Explicitly set the ActionBar to null
        ActionBar actionBar = getSupportActionBar();
        Log.d(TAG, "activateToolbar: starts");

        if (actionBar == null) {
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            Log.d(TAG, "activateToolbar: found toolbar: " + toolbar);

            if(toolbar != null) {
                Log.d(TAG, "activateToolbar: setting toolbar");
                setSupportActionBar(toolbar);
                actionBar = getSupportActionBar();
            } else {
                Log.d(TAG, "activateToolbar: failed to find toolbar. Exiting");
            }
        } else {
            Log.d(TAG, "activateToolbar: found action bar");
            actionBar.setDisplayHomeAsUpEnabled(enableHome);
        }
    }
}
