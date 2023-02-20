package com.geektech.tahwesha.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.geektech.tahwesha.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        new Handler().postDelayed(()->{
            Intent i = new Intent(Splash.this,OnBoarding_1.class);
            startActivity(i);
         finish();
        },1000);
    }
}