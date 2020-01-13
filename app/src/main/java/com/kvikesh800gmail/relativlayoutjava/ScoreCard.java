package com.kvikesh800gmail.relativlayoutjava;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

public class ScoreCard extends AppCompatActivity {
    TextView a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_card);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        SharedPreferences sharedPreferences = getSharedPreferences("Score", Context.MODE_PRIVATE);
        a1 = (TextView) findViewById(R.id.computer);



        a6 = (TextView) findViewById(R.id.english);

        a8 = (TextView) findViewById(R.id.maths);

        try {
            a1.setText("" + sharedPreferences.getInt("Computer", 0));


            a6.setText("" + sharedPreferences.getInt("English", 0));
            a8.setText("" + sharedPreferences.getInt("Maths", 0));

        } catch (Exception e) {
            Toast.makeText(ScoreCard.this, "" + e, Toast.LENGTH_SHORT).show();
        }
    }

}
