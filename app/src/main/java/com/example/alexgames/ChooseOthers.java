package com.example.alexgames;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseOthers extends AppCompatActivity {

    ImageButton btn_back_others;

    @SuppressLint("WrongViewCast")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);
        btn_back_others = findViewById(R.id.btn_back_others);
        btn_back_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseOthers.this, ChooseGame.class);
                startActivity(intent);
            }
        });
    }
}
