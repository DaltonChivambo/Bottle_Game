package com.sky.ink.bottlesgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_bottle;
    private  Random random = new Random();
    private  int last_direction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_bottle = findViewById(R.id.iv_bottle);
    }
}