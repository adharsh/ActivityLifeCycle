package com.adharshbabu.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;

public class FlowActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Flow Info.", "onCreate() was called");

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Flow Info.", "onStart() was called");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Flow Info.", "onResume() was called");
    }



    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Flow Info.", "onPause() was called");

    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Flow Info.", "onStop() was called");
    }


}
