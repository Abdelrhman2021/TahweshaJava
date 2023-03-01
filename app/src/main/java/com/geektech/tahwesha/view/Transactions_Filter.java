package com.geektech.tahwesha.view;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.WindowManager;
import android.widget.ListPopupWindow;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.geektech.tahwesha.R;

public class Transactions_Filter extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transactions_filter);

        RelativeLayout layoutGet = findViewById(R.id.card_filter);
        ViewGroup.LayoutParams layoutParams = layoutGet.getLayoutParams();
        int width = layoutParams.width;

        getWindow().setLayout(width, ListPopupWindow.WRAP_CONTENT);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        getWindow().setAttributes(params);

        ViewGroup root = (ViewGroup) getWindow().getDecorView().getRootView();
        applydim(root);
    }
    private static void applydim(ViewGroup parent) {
        Drawable dim = new ColorDrawable(Color.TRANSPARENT);
        dim.setBounds(0, 0, parent.getWidth(), parent.getHeight());
        dim.setAlpha(200);
        ViewGroupOverlay overlay = parent.getOverlay();
        overlay.add(dim);
    }
}
