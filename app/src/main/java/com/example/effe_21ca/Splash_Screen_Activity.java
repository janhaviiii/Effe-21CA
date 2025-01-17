package com.example.effe_21ca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class Splash_Screen_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);


        // StatusBarUtil.setTransparent(this);
        Handler handler = new Handler();
        Runnable runnable = () -> {
            Intent intent = new Intent(Splash_Screen_Activity.this, SignUpActivity.class);
            startActivity(intent);
        };
        handler.postDelayed(runnable, 500);

    }
}