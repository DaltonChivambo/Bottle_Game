package com.sky.ink.bottlesgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_bottle;
    private final Random random = new Random();
    private  int last_direction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_bottle = findViewById(R.id.iv_bottle);

        iv_bottle.setOnClickListener(view -> {
            int new_direction = random.nextInt(1800);

            // creating axis
            float axis_x = iv_bottle.getWidth() / 2f;
            float axis_y = iv_bottle.getHeight() / 2f;

            //Creating animation (1800 for 360 is based in 5 spin)
            Animation spin = new RotateAnimation(last_direction,new_direction,axis_x,axis_y);
            spin.setDuration(3000);
            // for non return to original position
            spin.setFillAfter(true);

            last_direction = new_direction;
            iv_bottle.startAnimation(spin);
        });
    }
}