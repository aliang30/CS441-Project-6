package com.example.cs441_project6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HighScore extends AppCompatActivity {

    private Button mainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);

        TextView score = findViewById(R.id.score);

        int score1 = getIntent().getIntExtra("SCORE", 0);

        score.setTextColor(Color.WHITE);
        score.setText("Score : " + score1);

        mainMenu = (Button) findViewById(R.id.button2);
        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }

    //Opens main menu
    public void openActivity2() {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}
