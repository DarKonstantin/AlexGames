package com.example.alexgames;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseAnimals extends AppCompatActivity {

    ImageButton btn_back_animals;

    @SuppressLint("WrongViewCast")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        btn_back_animals = findViewById(R.id.btn_back_animals);
        btn_back_animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseAnimals.this, ChooseGame.class);
                startActivity(intent);
            }
        });
    }
}
