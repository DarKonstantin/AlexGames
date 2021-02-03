package com.example.alexgames;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseGame extends AppCompatActivity {

    ImageButton btn_animals, btn_others;

    @SuppressLint("WrongViewCast")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_choose_game);

        btn_animals = findViewById(R.id.btn_animals);
        btn_others = findViewById(R.id.btn_others);

        btn_animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animals = new Intent(ChooseGame.this, ChooseAnimals.class);
                startActivity(animals);
            }
        });

        btn_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent others = new Intent(ChooseGame.this, ChooseOthers.class);
                startActivity(others);
            }
        });

    }
}
