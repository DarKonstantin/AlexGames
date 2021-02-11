package com.example.alexgames;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.alexgames.Function.AnimImgBtn;

public class ChooseAnimals extends AppCompatActivity {

    private ImageButton btn_back_animals, btn_bear, btn_bull, btn_camel, btn_cat, btn_dog, btn_duck,
            btn_frog, btn_pantera, btn_woodpecker;
    private String st_bear, st_bull, st_camel, st_cat, st_dog, st_duck,
            st_frog, st_pantera, st_woodpecker;
    private MediaPlayer mp_bear, mp_bull, mp_camel, mp_cat, mp_dog, mp_duck,
            mp_frog, mp_pantera, mp_woodpecker;
    private Integer index_1 = 1, index_2 = 1, index_3 = 1, index_4 = 1, index_5 = 1, index_6 = 1, index_7 = 1, index_8 = 1, index_9 = 1;

    @SuppressLint({"WrongViewCast", "ClickableViewAccessibility"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animals);
        btn_bear = findViewById(R.id.bear);
        btn_bear.setTag("bear");
        st_bear = (String) btn_bear.getTag();
        btn_bear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index_1 == 1){
                    if(st_bear.equals("bear")){
                        mp_bear = MediaPlayer.create(ChooseAnimals.this, R.raw.bear);
                        soundPlay(mp_bear);
                    } else {

                    }
                    index_1 = 0;
                } else if(index_1 == 0){
                    if(st_bear.equals("bear")){
                        mp_bear = MediaPlayer.create(ChooseAnimals.this, R.raw.bear);
                        soundStop(mp_bear);
                    } else {

                    }
                    index_1 = 1;
                }
            }
        });
        AnimImgBtn(btn_bear);
        btn_bull = findViewById(R.id.bull);
        btn_bull.setTag("bull");
        st_bull = (String) btn_bull.getTag();
        btn_bull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index_2 == 1){
                    if(st_bull.equals("bull")){
                        mp_bull = MediaPlayer.create(ChooseAnimals.this, R.raw.bull);
                        soundPlay(mp_bull);
                    } else {

                    }
                    index_2 = 0;
                } else if(index_2 == 0){
                    if(st_bull.equals("bull")){
                        mp_bull = MediaPlayer.create(ChooseAnimals.this, R.raw.bull);
                        soundStop(mp_bull);
                    } else {

                    }
                    index_2 = 1;
                }
            }
        });
        AnimImgBtn(btn_bull);
        btn_camel = findViewById(R.id.camel);
        btn_camel.setTag("camel");
        st_camel = (String) btn_camel.getTag();
        btn_camel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index_3 == 1){
                    if(st_camel.equals("camel")){
                        mp_camel = MediaPlayer.create(ChooseAnimals.this, R.raw.camel);
                        soundPlay(mp_camel);
                    } else {

                    }
                    index_3 = 0;
                } else if(index_3 == 0){
                    if(st_camel.equals("camel")){
                        mp_camel = MediaPlayer.create(ChooseAnimals.this, R.raw.camel);
                        soundStop(mp_camel);
                    } else {

                    }
                    index_3 = 1;
                }
            }
        });
        AnimImgBtn(btn_camel);
        btn_cat = findViewById(R.id.cat);
        btn_cat.setTag("cat");
        st_cat = (String) btn_cat.getTag();
        btn_cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index_4 == 1){
                    if(st_cat.equals("cat")){
                        mp_cat = MediaPlayer.create(ChooseAnimals.this, R.raw.cat);
                        soundPlay(mp_cat);
                    } else {

                    }
                    index_4 = 0;
                } else if(index_4 == 0){
                    if(st_cat.equals("cat")){
                        mp_cat = MediaPlayer.create(ChooseAnimals.this, R.raw.cat);
                        soundStop(mp_cat);
                    } else {

                    }
                    index_4 = 1;
                }
            }
        });
        AnimImgBtn(btn_cat);
        btn_dog = findViewById(R.id.dog);
        btn_dog.setTag("dog");
        st_dog = (String) btn_dog.getTag();
        btn_dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index_5 == 1){
                    if(st_dog.equals("dog")){
                        mp_dog = MediaPlayer.create(ChooseAnimals.this, R.raw.dog);
                        soundPlay(mp_dog);
                    } else {

                    }
                    index_5 = 0;
                } else if(index_5 == 0){
                    if(st_dog.equals("dog")){
                        mp_dog = MediaPlayer.create(ChooseAnimals.this, R.raw.dog);
                        soundStop(mp_dog);
                    } else {

                    }
                    index_5 = 1;
                }
            }
        });
        AnimImgBtn(btn_dog);
        btn_duck = findViewById(R.id.duck);
        btn_duck.setTag("duck");
        st_duck = (String) btn_duck.getTag();
        btn_duck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index_6 == 1){
                    if(st_duck.equals("duck")){
                        mp_duck = MediaPlayer.create(ChooseAnimals.this, R.raw.duck);
                        soundPlay(mp_duck);
                    } else {

                    }
                    index_6 = 0;
                } else if(index_6 == 0){
                    if(st_duck.equals("duck")){
                        mp_duck = MediaPlayer.create(ChooseAnimals.this, R.raw.duck);
                        soundStop(mp_duck);
                    } else {

                    }
                    index_6 = 1;
                }
            }
        });
        AnimImgBtn(btn_duck);
        btn_frog = findViewById(R.id.frog);
        btn_frog.setTag("frog");
        st_frog = (String) btn_frog.getTag();
        btn_frog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index_7 == 1){
                    if(st_frog.equals("frog")){
                        mp_frog = MediaPlayer.create(ChooseAnimals.this, R.raw.frog);
                        soundPlay(mp_frog);
                    } else {

                    }
                    index_7 = 0;
                } else if(index_7 == 0){
                    if(st_frog.equals("frog")){
                        mp_frog = MediaPlayer.create(ChooseAnimals.this, R.raw.frog);
                        soundStop(mp_frog);
                    } else {

                    }
                    index_7 = 1;
                }
            }
        });
        AnimImgBtn(btn_frog);
        btn_pantera = findViewById(R.id.pantera);
        btn_pantera.setTag("pantera");
        st_pantera = (String) btn_pantera.getTag();
        btn_pantera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index_8 == 1){
                    if(st_pantera.equals("pantera")){
                        mp_pantera = MediaPlayer.create(ChooseAnimals.this, R.raw.pantera);
                        soundPlay(mp_pantera);
                    } else {

                    }
                    index_8 = 0;
                } else if(index_8 == 0){
                    if(st_pantera.equals("pantera")){
                        mp_pantera = MediaPlayer.create(ChooseAnimals.this, R.raw.pantera);
                        soundStop(mp_pantera);
                    } else {

                    }
                    index_8 = 1;
                }
            }
        });
        AnimImgBtn(btn_pantera);
        btn_woodpecker = findViewById(R.id.woodpecker);
        btn_woodpecker.setTag("woodpecker");
        st_woodpecker = (String) btn_woodpecker.getTag();
        btn_woodpecker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index_9 == 1){
                    if(st_woodpecker.equals("woodpecker")){
                        mp_woodpecker = MediaPlayer.create(ChooseAnimals.this, R.raw.woodpecker);
                        soundPlay(mp_woodpecker);
                    } else {

                    }
                    index_9 = 0;
                } else if(index_9 == 0){
                    if(st_woodpecker.equals("woodpecker")){
                        mp_woodpecker = MediaPlayer.create(ChooseAnimals.this, R.raw.woodpecker);
                        soundStop(mp_woodpecker);
                    } else {

                    }
                    index_9 = 1;
                }
            }
        });
        AnimImgBtn(btn_woodpecker);
        btn_back_animals = findViewById(R.id.btn_back_animals);
        btn_back_animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseAnimals.this, ChooseGame.class);
                startActivity(intent);
            }
        });
        AnimImgBtn(btn_back_animals);

    }

    public void soundPlay(MediaPlayer sound){
        sound.start();
    }
    public void soundStop(MediaPlayer sound){
        sound.stop();
    }
}
