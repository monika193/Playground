package com.example.sanjoth.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreate", "onCreate: onCreate is Started ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart", "onStart: onStart is Started ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume", "onResume: onResume is Started ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause", "onPause: onPause is Started ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop", "onStop: onStop is Started ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy", "onDestroy: onDestroy is Started ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestart", "onRestart: onRestart is Started ");
    }
}
