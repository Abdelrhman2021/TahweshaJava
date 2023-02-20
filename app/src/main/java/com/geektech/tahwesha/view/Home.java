package com.geektech.tahwesha.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.geektech.tahwesha.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemBackgroundResource(android.R.color.transparent);


    }
}