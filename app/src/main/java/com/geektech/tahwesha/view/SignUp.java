package com.geektech.tahwesha.view;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import com.geektech.tahwesha.R;

public class SignUp extends AppCompatActivity {

    TextView terms;
    CardView back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        terms=findViewById(R.id.terms);
        String text = "By signing up, you agree to the Terms of Service and Privacy Policy";
        Spannable spannable = new SpannableString(text);
        int color = ContextCompat.getColor(this,R.color.terms);
        spannable.setSpan(new ForegroundColorSpan(color),33,67,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        terms.setText(spannable);
        back=findViewById(R.id.back_button);
        back.setOnClickListener(view -> {
            Intent intent = new Intent(SignUp.this,OnBoarding_3.class);
            startActivity(intent);
        });
    }
}
