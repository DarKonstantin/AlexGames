package com.example.alexgames;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.alexgames.Function.AnimImgBtn;

public class ChooseAnimals extends AppCompatActivity {

    private ImageButton btn_back_animals, btn_other_1, btn_other_2, btn_other_3, btn_other_4, btn_other_5, btn_other_6,
            btn_other_7, btn_other_8, btn_other_9;
    private String btn_other_1_name, btn_other_2_name, btn_other_3_name, btn_other_4_name, btn_other_5_name, btn_other_6_name,
            btn_other_7_name, btn_other_8_name, btn_other_9_name;
    private MediaPlayer bear, bull, camel, cat, dog, duck,
            frog, pantera, woodpecker, crab, elephant, fox, lion, orca, panda, rattlesnake, seagull, seal, click, shuh;
    private Integer index1 = 1, index2 = 1, index3 = 1, index4 = 1, index5 = 1, index6 = 1, index7 = 1, index8 = 1, index9 = 1;

    @SuppressLint({"WrongViewCast", "ClickableViewAccessibility"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animals);
        btn_other_1 = findViewById(R.id.bear);
        btn_other_1.setTag("bear");
        btn_other_1_name = (String) btn_other_1.getTag();
        btn_other_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (index1){
                    case 0:{
                        if(btn_other_1_name.equals("bear")){
                            bear = MediaPlayer.create(ChooseAnimals.this, R.raw.bear);
                            soundStop(bear);
                        } else if(btn_other_1_name.equals("crab")) {
                            crab = MediaPlayer.create(ChooseAnimals.this, R.raw.car);
                            soundStop(crab);
                        }
                        index1 = 1;
                        break;
                    }
                    case 1: {
                        if (btn_other_1_name.equals("bear")) {
                            bear = MediaPlayer.create(ChooseAnimals.this, R.raw.bear);
                            soundPlay(bear);
                        } else if(btn_other_1_name.equals("crab")){
                            crab = MediaPlayer.create(ChooseAnimals.this, R.raw.crab);
                            soundPlay(crab);
                        }
                        index1 = 0;
                        break;
                    }
                }
            }
        });
        AnimImgBtn(btn_other_1);
        btn_other_2 = findViewById(R.id.bull);
        btn_other_2.setTag("bull");
        btn_other_2_name = (String) btn_other_2.getTag();
        btn_other_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (index2){
                    case 0:{
                        if(btn_other_2_name.equals("bull")){
                            bull = MediaPlayer.create(ChooseAnimals.this, R.raw.bull);
                            soundStop(bull);
                        } else if(btn_other_2_name.equals("elephant")) {
                            elephant = MediaPlayer.create(ChooseAnimals.this, R.raw.elephant);
                            soundStop(elephant);
                        }
                        index2 = 1;
                        break;
                    }
                    case 1: {
                        if (btn_other_2_name.equals("bull")) {
                            bull = MediaPlayer.create(ChooseAnimals.this, R.raw.bull);
                            soundPlay(bull);
                        } else if(btn_other_2_name.equals("elephant")){
                            elephant = MediaPlayer.create(ChooseAnimals.this, R.raw.elephant);
                            soundPlay(elephant);
                        }
                        index2 = 0;
                        break;
                    }
                }
            }
        });
        AnimImgBtn(btn_other_2);
        btn_other_3 = findViewById(R.id.camel);
        btn_other_3.setTag("camel");
        btn_other_3_name = (String) btn_other_3.getTag();
        btn_other_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (index3){
                    case 0:{
                        if(btn_other_3_name.equals("camel")){
                            camel = MediaPlayer.create(ChooseAnimals.this, R.raw.camel);
                            soundStop(camel);
                        } else if(btn_other_3_name.equals("fox")) {
                            fox = MediaPlayer.create(ChooseAnimals.this, R.raw.fox);
                            soundStop(fox);
                        }
                        index3 = 1;
                        break;
                    }
                    case 1: {
                        if (btn_other_3_name.equals("camel")) {
                            camel = MediaPlayer.create(ChooseAnimals.this, R.raw.camel);
                            soundPlay(camel);
                        } else if(btn_other_3_name.equals("fox")){
                            fox = MediaPlayer.create(ChooseAnimals.this, R.raw.fox);
                            soundPlay(fox);
                        }
                        index3 = 0;
                        break;
                    }
                }
            }
        });
        AnimImgBtn(btn_other_3);
        btn_other_4 = findViewById(R.id.cat);
        btn_other_4.setTag("cat");
        btn_other_4_name = (String) btn_other_4.getTag();
        btn_other_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (index4){
                    case 0:{
                        if(btn_other_4_name.equals("cat")){
                            cat = MediaPlayer.create(ChooseAnimals.this, R.raw.cat);
                            soundStop(cat);
                        } else if(btn_other_4_name.equals("lion")) {
                            lion = MediaPlayer.create(ChooseAnimals.this, R.raw.lion);
                            soundStop(lion);
                        }
                        index4 = 1;
                        break;
                    }
                    case 1: {
                        if (btn_other_4_name.equals("cat")) {
                            cat = MediaPlayer.create(ChooseAnimals.this, R.raw.cat);
                            soundPlay(cat);
                        } else if(btn_other_4_name.equals("lion")){
                            lion = MediaPlayer.create(ChooseAnimals.this, R.raw.lion);
                            soundPlay(lion);
                        }
                        index4 = 0;
                        break;
                    }
                }
            }
        });
        AnimImgBtn(btn_other_4);
        btn_other_5 = findViewById(R.id.dog);
        btn_other_5.setTag("dog");
        btn_other_5_name = (String) btn_other_5.getTag();
        btn_other_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (index5){
                    case 0:{
                        if(btn_other_5_name.equals("dog")){
                            dog = MediaPlayer.create(ChooseAnimals.this, R.raw.dog);
                            soundStop(dog);
                        } else if(btn_other_5_name.equals("orca")) {
                            orca = MediaPlayer.create(ChooseAnimals.this, R.raw.orca);
                            soundStop(orca);
                        }
                        index5 = 1;
                        break;
                    }
                    case 1: {
                        if (btn_other_5_name.equals("dog")) {
                            dog = MediaPlayer.create(ChooseAnimals.this, R.raw.dog);
                            soundPlay(dog);
                        } else if(btn_other_5_name.equals("orca")){
                            orca = MediaPlayer.create(ChooseAnimals.this, R.raw.orca);
                            soundPlay(orca);
                        }
                        index5 = 0;
                        break;
                    }
                }
            }
        });
        AnimImgBtn(btn_other_5);
        btn_other_6 = findViewById(R.id.duck);
        btn_other_6.setTag("duck");
        btn_other_6_name = (String) btn_other_6.getTag();
        btn_other_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (index6){
                    case 0:{
                        if(btn_other_6_name.equals("duck")){
                            duck = MediaPlayer.create(ChooseAnimals.this, R.raw.duck);
                            soundStop(duck);
                        } else if(btn_other_6_name.equals("panda")) {
                            panda = MediaPlayer.create(ChooseAnimals.this, R.raw.panda);
                            soundStop(panda);
                        }
                        index6 = 1;
                        break;
                    }
                    case 1: {
                        if (btn_other_6_name.equals("duck")) {
                            duck = MediaPlayer.create(ChooseAnimals.this, R.raw.duck);
                            soundPlay(duck);
                        } else if(btn_other_6_name.equals("panda")){
                            panda = MediaPlayer.create(ChooseAnimals.this, R.raw.panda);
                            soundPlay(panda);
                        }
                        index6 = 0;
                        break;
                    }
                }
            }
        });
        AnimImgBtn(btn_other_6);
        btn_other_7 = findViewById(R.id.frog);
        btn_other_7.setTag("frog");
        btn_other_7_name = (String) btn_other_7.getTag();
        btn_other_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (index7){
                    case 0:{
                        if(btn_other_7_name.equals("frog")){
                            frog = MediaPlayer.create(ChooseAnimals.this, R.raw.frog);
                            soundStop(frog);
                        } else if(btn_other_7_name.equals("rattlesnake")) {
                            rattlesnake = MediaPlayer.create(ChooseAnimals.this, R.raw.rattlesnake);
                            soundStop(rattlesnake);
                        }
                        index7 = 1;
                        break;
                    }
                    case 1: {
                        if (btn_other_7_name.equals("frog")) {
                            frog = MediaPlayer.create(ChooseAnimals.this, R.raw.frog);
                            soundPlay(frog);
                        } else if(btn_other_7_name.equals("rattlesnake")){
                            rattlesnake = MediaPlayer.create(ChooseAnimals.this, R.raw.rattlesnake);
                            soundPlay(rattlesnake);
                        }
                        index7 = 0;
                        break;
                    }
                }
            }
        });
        AnimImgBtn(btn_other_7);
        btn_other_8 = findViewById(R.id.pantera);
        btn_other_8.setTag("pantera");
        btn_other_8_name = (String) btn_other_8.getTag();
        btn_other_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (index8){
                    case 0:{
                        if(btn_other_8_name.equals("pantera")){
                            pantera = MediaPlayer.create(ChooseAnimals.this, R.raw.pantera);
                            soundStop(pantera);
                        } else if(btn_other_8_name.equals("seagull")) {
                            seagull = MediaPlayer.create(ChooseAnimals.this, R.raw.seagull);
                            soundStop(seagull);
                        }
                        index8 = 1;
                        break;
                    }
                    case 1: {
                        if (btn_other_8_name.equals("pantera")) {
                            pantera = MediaPlayer.create(ChooseAnimals.this, R.raw.pantera);
                            soundPlay(pantera);
                        } else if(btn_other_8_name.equals("seagull")){
                            seagull = MediaPlayer.create(ChooseAnimals.this, R.raw.seagull);
                            soundPlay(seagull);
                        }
                        index8 = 0;
                        break;
                    }
                }
            }
        });
        AnimImgBtn(btn_other_8);
        btn_other_9 = findViewById(R.id.woodpecker);
        btn_other_9.setTag("woodpecker");
        btn_other_9_name = (String) btn_other_9.getTag();
        btn_other_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (index9){
                    case 0:{
                        if(btn_other_9_name.equals("woodpecker")){
                            woodpecker = MediaPlayer.create(ChooseAnimals.this, R.raw.woodpecker);
                            soundStop(woodpecker);
                        } else if(btn_other_9_name.equals("seal")) {
                            seal = MediaPlayer.create(ChooseAnimals.this, R.raw.seal);
                            soundStop(seal);
                        }
                        index9 = 1;
                        break;
                    }
                    case 1: {
                        if (btn_other_9_name.equals("woodpecker")) {
                            woodpecker = MediaPlayer.create(ChooseAnimals.this, R.raw.woodpecker);
                            soundPlay(woodpecker);
                        } else if(btn_other_9_name.equals("seal")){
                            seal = MediaPlayer.create(ChooseAnimals.this, R.raw.seal);
                            soundPlay(seal);
                        }
                        index9 = 0;
                        break;
                    }
                }
            }
        });
        AnimImgBtn(btn_other_9);
        btn_back_animals = findViewById(R.id.btn_back_animals);
        btn_back_animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click = MediaPlayer.create(ChooseAnimals.this, R.raw.click);
                soundPlay(click);
                Intent intent = new Intent(ChooseAnimals.this, ChooseGame.class);
                startActivity(intent);
            }
        });
        AnimImgBtn(btn_back_animals);

        RelativeLayout rel_animals = findViewById(R.id.rel_animals);
        rel_animals.setOnTouchListener(new OnSwipeTouchListener(ChooseAnimals.this){
            public void onSwipeLeft(){
                super.onSwipeLeft();
                shuh = MediaPlayer.create(ChooseAnimals.this, R.raw.shuh);
                soundPlay(shuh);
                switch (btn_other_1_name){
                    case "bear":{
                        btn_other_1.setImageResource(R.drawable.crab);
                        btn_other_1.setTag("crab");
                        btn_other_1_name = (String) btn_other_1.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.bear);
                        layers[1] = getResources().getDrawable(R.drawable.crab);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_1.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "crab":{
                        btn_other_1.setImageResource(R.drawable.bear);
                        btn_other_1.setTag("bear");
                        btn_other_1_name = (String) btn_other_1.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.crab);
                        layers[1] = getResources().getDrawable(R.drawable.bear);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_1.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_2_name){
                    case "bull":{
                        btn_other_2.setImageResource(R.drawable.elephant);
                        btn_other_2.setTag("elephant");
                        btn_other_2_name = (String) btn_other_2.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.bull);
                        layers[1] = getResources().getDrawable(R.drawable.elephant);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_2.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "elephant":{
                        btn_other_2.setImageResource(R.drawable.bull);
                        btn_other_2.setTag("bull");
                        btn_other_2_name = (String) btn_other_2.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.elephant);
                        layers[1] = getResources().getDrawable(R.drawable.bull);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_2.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_3_name){
                    case "camel":{
                        btn_other_3.setImageResource(R.drawable.fox);
                        btn_other_3.setTag("fox");
                        btn_other_3_name = (String) btn_other_3.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.camel);
                        layers[1] = getResources().getDrawable(R.drawable.fox);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_3.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "fox":{
                        btn_other_3.setImageResource(R.drawable.camel);
                        btn_other_3.setTag("camel");
                        btn_other_3_name = (String) btn_other_3.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.fox);
                        layers[1] = getResources().getDrawable(R.drawable.camel);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_3.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_4_name){
                    case "cat":{
                        btn_other_4.setImageResource(R.drawable.lion);
                        btn_other_4.setTag("lion");
                        btn_other_4_name = (String) btn_other_4.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.cat);
                        layers[1] = getResources().getDrawable(R.drawable.lion);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_4.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "lion":{
                        btn_other_4.setImageResource(R.drawable.cat);
                        btn_other_4.setTag("cat");
                        btn_other_4_name = (String) btn_other_4.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.lion);
                        layers[1] = getResources().getDrawable(R.drawable.cat);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_4.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_5_name){
                    case "dog":{
                        btn_other_5.setImageResource(R.drawable.orca);
                        btn_other_5.setTag("orca");
                        btn_other_5_name = (String) btn_other_5.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.dog);
                        layers[1] = getResources().getDrawable(R.drawable.orca);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_5.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "orca":{
                        btn_other_5.setImageResource(R.drawable.dog);
                        btn_other_5.setTag("dog");
                        btn_other_5_name = (String) btn_other_5.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.orca);
                        layers[1] = getResources().getDrawable(R.drawable.dog);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_5.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_6_name){
                    case "duck":{
                        btn_other_6.setImageResource(R.drawable.panda);
                        btn_other_6.setTag("panda");
                        btn_other_6_name = (String) btn_other_6.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.duck);
                        layers[1] = getResources().getDrawable(R.drawable.panda);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_6.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "panda":{
                        btn_other_6.setImageResource(R.drawable.duck);
                        btn_other_6.setTag("duck");
                        btn_other_6_name = (String) btn_other_6.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.panda);
                        layers[1] = getResources().getDrawable(R.drawable.duck);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_6.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_7_name){
                    case "frog":{
                        btn_other_7.setImageResource(R.drawable.rattlesnake);
                        btn_other_7.setTag("rattlesnake");
                        btn_other_7_name = (String) btn_other_7.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.frog);
                        layers[1] = getResources().getDrawable(R.drawable.rattlesnake);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_7.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "rattlesnake":{
                        btn_other_7.setImageResource(R.drawable.frog);
                        btn_other_7.setTag("frog");
                        btn_other_7_name = (String) btn_other_7.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.rattlesnake);
                        layers[1] = getResources().getDrawable(R.drawable.frog);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_7.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_8_name){
                    case "pantera":{
                        btn_other_8.setImageResource(R.drawable.seagull);
                        btn_other_8.setTag("seagull");
                        btn_other_8_name = (String) btn_other_8.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.pantera);
                        layers[1] = getResources().getDrawable(R.drawable.seagull);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_8.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "seagull":{
                        btn_other_8.setImageResource(R.drawable.pantera);
                        btn_other_8.setTag("pantera");
                        btn_other_8_name = (String) btn_other_8.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.seagull);
                        layers[1] = getResources().getDrawable(R.drawable.pantera);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_8.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_9_name){
                    case "woodpecker":{
                        btn_other_9.setImageResource(R.drawable.seal);
                        btn_other_9.setTag("seal");
                        btn_other_9_name = (String) btn_other_9.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.woodpecker);
                        layers[1] = getResources().getDrawable(R.drawable.seal);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_9.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "seal":{
                        btn_other_9.setImageResource(R.drawable.woodpecker);
                        btn_other_9.setTag("woodpecker");
                        btn_other_9_name = (String) btn_other_9.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.seal);
                        layers[1] = getResources().getDrawable(R.drawable.woodpecker);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_9.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
            }
            public void onSwipeRight(){
                super.onSwipeRight();
                shuh = MediaPlayer.create(ChooseAnimals.this, R.raw.shuh);
                soundPlay(shuh);
                switch (btn_other_1_name){
                    case "bear":{
                        btn_other_1.setImageResource(R.drawable.crab);
                        btn_other_1.setTag("crab");
                        btn_other_1_name = (String) btn_other_1.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.bear);
                        layers[1] = getResources().getDrawable(R.drawable.crab);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_1.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "crab":{
                        btn_other_1.setImageResource(R.drawable.bear);
                        btn_other_1.setTag("bear");
                        btn_other_1_name = (String) btn_other_1.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.crab);
                        layers[1] = getResources().getDrawable(R.drawable.bear);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_1.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_2_name){
                    case "bull":{
                        btn_other_2.setImageResource(R.drawable.elephant);
                        btn_other_2.setTag("elephant");
                        btn_other_2_name = (String) btn_other_2.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.bull);
                        layers[1] = getResources().getDrawable(R.drawable.elephant);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_2.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "elephant":{
                        btn_other_2.setImageResource(R.drawable.bull);
                        btn_other_2.setTag("bull");
                        btn_other_2_name = (String) btn_other_2.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.elephant);
                        layers[1] = getResources().getDrawable(R.drawable.bull);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_2.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_3_name){
                    case "camel":{
                        btn_other_3.setImageResource(R.drawable.fox);
                        btn_other_3.setTag("fox");
                        btn_other_3_name = (String) btn_other_3.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.camel);
                        layers[1] = getResources().getDrawable(R.drawable.fox);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_3.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "fox":{
                        btn_other_3.setImageResource(R.drawable.camel);
                        btn_other_3.setTag("camel");
                        btn_other_3_name = (String) btn_other_3.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.fox);
                        layers[1] = getResources().getDrawable(R.drawable.camel);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_3.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_4_name){
                    case "cat":{
                        btn_other_4.setImageResource(R.drawable.lion);
                        btn_other_4.setTag("lion");
                        btn_other_4_name = (String) btn_other_4.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.cat);
                        layers[1] = getResources().getDrawable(R.drawable.lion);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_4.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "lion":{
                        btn_other_4.setImageResource(R.drawable.cat);
                        btn_other_4.setTag("cat");
                        btn_other_4_name = (String) btn_other_4.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.lion);
                        layers[1] = getResources().getDrawable(R.drawable.cat);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_4.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_5_name){
                    case "dog":{
                        btn_other_5.setImageResource(R.drawable.orca);
                        btn_other_5.setTag("orca");
                        btn_other_5_name = (String) btn_other_5.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.dog);
                        layers[1] = getResources().getDrawable(R.drawable.orca);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_5.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "orca":{
                        btn_other_5.setImageResource(R.drawable.dog);
                        btn_other_5.setTag("dog");
                        btn_other_5_name = (String) btn_other_5.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.orca);
                        layers[1] = getResources().getDrawable(R.drawable.dog);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_5.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_6_name){
                    case "duck":{
                        btn_other_6.setImageResource(R.drawable.panda);
                        btn_other_6.setTag("panda");
                        btn_other_6_name = (String) btn_other_6.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.duck);
                        layers[1] = getResources().getDrawable(R.drawable.panda);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_6.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "panda":{
                        btn_other_6.setImageResource(R.drawable.duck);
                        btn_other_6.setTag("duck");
                        btn_other_6_name = (String) btn_other_6.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.panda);
                        layers[1] = getResources().getDrawable(R.drawable.duck);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_6.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_7_name){
                    case "frog":{
                        btn_other_7.setImageResource(R.drawable.rattlesnake);
                        btn_other_7.setTag("rattlesnake");
                        btn_other_7_name = (String) btn_other_7.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.frog);
                        layers[1] = getResources().getDrawable(R.drawable.rattlesnake);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_7.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "rattlesnake":{
                        btn_other_7.setImageResource(R.drawable.frog);
                        btn_other_7.setTag("frog");
                        btn_other_7_name = (String) btn_other_7.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.rattlesnake);
                        layers[1] = getResources().getDrawable(R.drawable.frog);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_7.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_8_name){
                    case "pantera":{
                        btn_other_8.setImageResource(R.drawable.seagull);
                        btn_other_8.setTag("seagull");
                        btn_other_8_name = (String) btn_other_8.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.pantera);
                        layers[1] = getResources().getDrawable(R.drawable.seagull);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_8.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "seagull":{
                        btn_other_8.setImageResource(R.drawable.pantera);
                        btn_other_8.setTag("pantera");
                        btn_other_8_name = (String) btn_other_8.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.seagull);
                        layers[1] = getResources().getDrawable(R.drawable.pantera);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_8.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_9_name){
                    case "woodpecker":{
                        btn_other_9.setImageResource(R.drawable.seal);
                        btn_other_9.setTag("seal");
                        btn_other_9_name = (String) btn_other_9.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.woodpecker);
                        layers[1] = getResources().getDrawable(R.drawable.seal);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_9.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "seal":{
                        btn_other_9.setImageResource(R.drawable.woodpecker);
                        btn_other_9.setTag("woodpecker");
                        btn_other_9_name = (String) btn_other_9.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.seal);
                        layers[1] = getResources().getDrawable(R.drawable.woodpecker);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_9.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
            }
        });

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
