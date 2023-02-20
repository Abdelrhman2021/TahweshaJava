package com.geektech.tahwesha.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.geektech.tahwesha.R;

public class OnBoarding_2 extends AppCompatActivity {

    Button next, skip;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_2);
        skip=findViewById(R.id.skip);
        next=findViewById(R.id.next);
        skip.setOnClickListener(view -> {
            Intent intent = new Intent(OnBoarding_2.this,SignUp.class);
            startActivity(intent);
        });
        next.setOnClickListener(view -> {
            Intent intent = new Intent(OnBoarding_2.this,OnBoarding_3.class);
            startActivity(intent);
        });
    }
}
