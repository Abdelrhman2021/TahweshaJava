package com.geektech.tahwesha.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.geektech.tahwesha.R;


public class OnBoarding_1 extends AppCompatActivity {

    Button next, skip;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_1);
        skip=findViewById(R.id.skip);
        next=findViewById(R.id.next);
        skip.setOnClickListener(view -> {
            Intent intent = new Intent(OnBoarding_1.this,SignUp.class);
            startActivity(intent);
        });
        next.setOnClickListener(view -> {
            Intent intent = new Intent(OnBoarding_1.this,OnBoarding_2.class);
            startActivity(intent);
        });
    }
}
