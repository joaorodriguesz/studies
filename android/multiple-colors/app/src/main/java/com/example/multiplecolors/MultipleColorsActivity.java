package com.example.multiplecolors;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import android.widget.ImageView;

public class MultipleColorsActivity extends AppCompatActivity {
    private Button btnPinkColor;
    private Button btnBlueColor;
    private Button btnPurpleColor;
    private Button btnBlackColor;
    private ImageView logo;

    private Animation animation;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_colors);
        logo = findViewById(R.id.imageInit);

        animation = AnimationUtils.loadAnimation(this, R.anim.fade);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
//                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        logo.setAnimation(animation);
        animation.start();

        Button btnResetColors = findViewById(R.id.reset);

        btnPinkColor = findViewById(R.id.buttonPink);
        btnBlueColor = findViewById(R.id.buttonBlue);
        btnPurpleColor = findViewById(R.id.buttonPurple);
        btnBlackColor = findViewById(R.id.buttonBlack);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(MultipleColorsActivity.this);
        SharedPreferences.Editor edit = preferences.edit();

        String color = preferences.getString("SELECTED_COLOR", "");

        switch (color) {
            case "PINK": setColor(R.color.pink); break;
            case "BLUE": setColor(R.color.blue); break;
            case "BLACK": setColor(R.color.black); break;
            case "PURPLE": setColor(R.color.purple); break;
            default: resetColors();
        }

        btnPinkColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setColor(R.color.pink);

                edit.putString("SELECTED_COLOR", "PINK");
                edit.apply();
            }
        });

        btnBlueColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setColor(R.color.blue);

                edit.putString("SELECTED_COLOR", "BLUE");
                edit.apply();
            }
        });

        btnPurpleColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setColor(R.color.purple);

                edit.putString("SELECTED_COLOR", "PURPLE");
                edit.apply();
            }
        });

        btnBlackColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setColor(R.color.black);

                edit.putString("SELECTED_COLOR", "BLACK");
                edit.apply();
            }
        });

        btnResetColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetColors();

                edit.putString("SELECTED_COLOR", "");
                edit.apply();
            }
        });
    }

    private void setColor(int color){
        btnBlueColor.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), color));
        btnPurpleColor.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), color));
        btnBlackColor.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), color));
        btnPinkColor.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), color));
    }

    private void resetColors() {
        btnBlueColor.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.blue));
        btnPurpleColor.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.purple));
        btnBlackColor.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.black));
        btnPinkColor.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.pink));
    }
}
