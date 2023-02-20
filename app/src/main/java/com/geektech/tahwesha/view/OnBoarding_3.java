package com.geektech.tahwesha.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.geektech.tahwesha.R;

public class OnBoarding_3 extends AppCompatActivity {

    Button skip, getStarted;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_3);
        skip=findViewById(R.id.skip);
        getStarted=findViewById(R.id.get_started);
        skip.setOnClickListener(view -> {
            Intent intent = new Intent(OnBoarding_3.this,SignUp.class);
            startActivity(intent);
        });
        getStarted.setOnClickListener(view -> {
            Intent intent = new Intent(OnBoarding_3.this,SignUp.class);
            startActivity(intent);
        });
    }
}
