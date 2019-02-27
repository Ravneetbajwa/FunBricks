package com.example.funbricks;



import android.app.Activity;
import android.os.Bundle;

public class GameActivity extends Activity {

    BreakOutView breakoutView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        breakoutView = new BreakOutView(this);

        setContentView(breakoutView);


    }

    @Override
    protected void onResume() {
        super.onResume();
        breakoutView.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        breakoutView.pause();
    }
}


