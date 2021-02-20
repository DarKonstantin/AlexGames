package com.example.alexgames;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.alexgames.Function.AnimImgBtn;

public class ChooseGame extends AppCompatActivity {

    ImageButton btn_animals, btn_others, btn_cartoon, btn_puzzle, btn_back_main;
    public static TextView tv_what_is_it, tv_who_is_it, tv_sing, tv_collect;
    private MediaPlayer click;

    @SuppressLint({"WrongViewCast", "ClickableViewAccessibility"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_choose_game);

        btn_animals = findViewById(R.id.btn_animals);
        btn_others = findViewById(R.id.btn_others);
        btn_cartoon = findViewById(R.id.btn_cartoon);
        btn_puzzle = findViewById(R.id.btn_puzzle);
        btn_back_main = findViewById(R.id.btn_back_main);

        tv_what_is_it = findViewById(R.id.tv_what_is_it);
        tv_who_is_it = findViewById(R.id.tv_who_is_it);
        tv_sing = findViewById(R.id.tv_sing);
        tv_collect = findViewById(R.id.tv_collect);

        btn_animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click = MediaPlayer.create(ChooseGame.this, R.raw.click);
                soundPlay(click);
                Intent animals = new Intent(ChooseGame.this, ChooseAnimals.class);
                startActivity(animals);
            }
        });
        AnimImgBtn(btn_animals);
        btn_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click = MediaPlayer.create(ChooseGame.this, R.raw.click);
                soundPlay(click);
                Intent others = new Intent(ChooseGame.this, ChooseOthers.class);
                startActivity(others);
            }
        });
        AnimImgBtn(btn_others);
        btn_cartoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click = MediaPlayer.create(ChooseGame.this, R.raw.click);
                soundPlay(click);
                Intent cartoon = new Intent(ChooseGame.this, ChooseCartoon.class);
                startActivity(cartoon);
            }
        });
        AnimImgBtn(btn_cartoon);
        btn_puzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click = MediaPlayer.create(ChooseGame.this, R.raw.click);
                soundPlay(click);
                Intent puzzle = new Intent(ChooseGame.this, MainPuzzle.class);
                startActivity(puzzle);
            }
        });
        AnimImgBtn(btn_puzzle);
        btn_back_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click = MediaPlayer.create(ChooseGame.this, R.raw.click);
                soundPlay(click);
                Intent puzzle = new Intent(ChooseGame.this, MainActivity.class);
                startActivity(puzzle);
            }
        });
        AnimImgBtn(btn_back_main);
    }

    public void soundPlay(MediaPlayer sound){
        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if (sound != null){
                    sound.stop();
                    sound.release();
                }
            }
        });
        sound.start();
    }
    public void soundStop(MediaPlayer sound){
        if(sound != null){
            sound.stop();
            sound.release();
        }
    }
}
