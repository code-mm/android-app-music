package com.my.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    protected Button buttonPlay0_5;
    protected Button buttonPlay1;
    protected Button buttonPlay1_5;
    protected Button buttonPlay2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPlay0_5 = findViewById(R.id.buttonPlay0_5);
        buttonPlay1 = findViewById(R.id.buttonPlay1);
        buttonPlay1_5 = findViewById(R.id.buttonPlay1_5);
        buttonPlay2 = findViewById(R.id.buttonPlay2);

        buttonPlay0_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundUtils.getInstance().newClick(0.5f);
            }
        });

        buttonPlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundUtils.getInstance().newClick(1.0f);
            }
        });

        buttonPlay1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundUtils.getInstance().newClick(1.5f);
            }
        });

        buttonPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundUtils.getInstance().newClick(2.0f);
            }
        });
    }
}