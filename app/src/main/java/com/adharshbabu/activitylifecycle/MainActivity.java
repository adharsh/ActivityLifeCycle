package com.adharshbabu.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    public Button button;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //important line
        setContentView(R.layout.activity_main);

        //initializing counter
        counter = 0;

        //setting button to button in xml
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                Log.i("Button Info: ", "Clicked " + counter + " Times!");
            }
        });

    }

}