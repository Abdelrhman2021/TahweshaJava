package com.geektech.tahwesha.view;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.geektech.tahwesha.R;

public class Transaction_Sorted_Out extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaction_sorted_out);

        ImageView myImageView = findViewById(R.id.upper_base);
        if (myImageView != null) {
            Drawable drawable = myImageView.getDrawable();
            @SuppressLint("UseCompatLoadingForDrawables") Drawable border = getResources().getDrawable(R.drawable.upper_base_border);
            Drawable[] layers = {border, drawable};
            LayerDrawable layerDrawable = new LayerDrawable(layers);
            myImageView.setBackground(layerDrawable);
        }

        ImageView myImageView1 = findViewById(R.id.lower_base);
        if (myImageView1 != null) {
            Drawable drawable = myImageView1.getDrawable();
            @SuppressLint("UseCompatLoadingForDrawables") Drawable border1 = getResources().getDrawable(R.drawable.lower_base_border);
            Drawable[] layers1 = {border1, drawable};
            LayerDrawable layerDrawable1 = new LayerDrawable(layers1);
            myImageView1.setBackground(layerDrawable1);
        }

        CardView cardView = findViewById(R.id.cv_base);
        if (cardView != null) {
            Drawable drawable = cardView.getBackground();
            @SuppressLint("UseCompatLoadingForDrawables") Drawable border2 = getResources().getDrawable(R.drawable.transaction_cv_border);
            Drawable[] layers2 = {border2, drawable};
            LayerDrawable layerDrawable2 = new LayerDrawable(layers2);
            cardView.setBackground(layerDrawable2);
        }
    }
}
