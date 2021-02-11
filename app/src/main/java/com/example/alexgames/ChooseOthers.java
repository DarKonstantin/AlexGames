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

public class ChooseOthers extends AppCompatActivity {

    private ImageButton btn_back_others, btn_other_1, btn_other_2, btn_other_3, btn_other_4, btn_other_5, btn_other_6,
            btn_other_7, btn_other_8, btn_other_9;
    private String btn_other_1_name, btn_other_2_name, btn_other_3_name, btn_other_4_name, btn_other_5_name, btn_other_6_name,
            btn_other_7_name, btn_other_8_name, btn_other_9_name;
    private MediaPlayer airplane, birthday, bus, car, electric_toothbrush, hammer, horn, house, jumper, march,
            micro, pacifier, spade, star, support, telephone, train, watch;
    private Integer index1 = 1, index2 = 1, index3 = 1, index4 = 1, index5 = 1, index6 = 1, index7 = 1, index8 = 1, index9 = 1;



    @SuppressLint({"WrongViewCast", "ClickableViewAccessibility"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_others);
        btn_other_1 = findViewById(R.id.btn_other_1);
        btn_other_1.setTag("airplane");
        btn_other_1_name = (String) btn_other_1.getTag();
        btn_other_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index1 == 1){
                    if(btn_other_1_name.equals("airplane")){
                        airplane = MediaPlayer.create(ChooseOthers.this, R.raw.airplane);
                        soundPlay(airplane);
                    } else {
                        car = MediaPlayer.create(ChooseOthers.this, R.raw.car);
                        soundPlay(car);
                    }
                    index1 = 0;
                } else if(index1 == 0){
                    if(btn_other_1_name.equals("airplane")){
                        airplane = MediaPlayer.create(ChooseOthers.this, R.raw.airplane);
                        soundStop(airplane);
                    } else {
                        car = MediaPlayer.create(ChooseOthers.this, R.raw.car);
                        soundStop(car);
                    }
                    index1 = 1;
                }

            }
        });
        AnimImgBtn(btn_other_1);
        btn_other_2 = findViewById(R.id.btn_other_2);
        btn_other_2.setTag("birthday");
        btn_other_2_name = (String) btn_other_2.getTag();
        btn_other_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index2 == 1){
                    if(btn_other_2_name.equals("birthday")){
                        birthday = MediaPlayer.create(ChooseOthers.this, R.raw.birthday);
                        soundPlay(birthday);
                    } else {
                        house = MediaPlayer.create(ChooseOthers.this, R.raw.house);
                        soundPlay(house);
                    }
                    index2 = 0;
                } else if(index2 == 0){
                    if(btn_other_2_name.equals("birthday")){
                        birthday = MediaPlayer.create(ChooseOthers.this, R.raw.birthday);
                        soundStop(birthday);
                    } else {
                        house = MediaPlayer.create(ChooseOthers.this, R.raw.house);
                        soundStop(house);
                    }
                    index2 = 1;
                }
            }
        });
        AnimImgBtn(btn_other_2);
        btn_other_3 = findViewById(R.id.btn_other_3);
        btn_other_3.setTag("bus");
        btn_other_3_name = (String) btn_other_3.getTag();
        btn_other_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index3 == 1){
                    if(btn_other_3_name.equals("bus")){
                        bus = MediaPlayer.create(ChooseOthers.this, R.raw.bus);
                        soundPlay(bus);
                    } else {
                        pacifier = MediaPlayer.create(ChooseOthers.this, R.raw.pacifier);
                        soundPlay(pacifier);
                    }
                    index3 = 0;
                } else if(index3 == 0){
                    if(btn_other_3_name.equals("bus")){
                        bus = MediaPlayer.create(ChooseOthers.this, R.raw.bus);
                        soundStop(bus);
                    } else {
                        pacifier = MediaPlayer.create(ChooseOthers.this, R.raw.pacifier);
                        soundStop(pacifier);
                    }
                    index3 = 1;
                }
            }
        });
        AnimImgBtn(btn_other_3);
        btn_other_4 = findViewById(R.id.btn_other_4);
        btn_other_4.setTag("electric_toothbrush");
        btn_other_4_name = (String) btn_other_4.getTag();
        btn_other_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index4 == 1){
                    if(btn_other_4_name.equals("electric_toothbrush")){
                        electric_toothbrush = MediaPlayer.create(ChooseOthers.this, R.raw.electric_toothbrush);
                        soundPlay(electric_toothbrush);
                    } else {
                        spade = MediaPlayer.create(ChooseOthers.this, R.raw.spade);
                        soundPlay(spade);
                    }
                    index4 = 0;
                } else if(index4 == 0){
                    if(btn_other_4_name.equals("electric_toothbrush")){
                        electric_toothbrush = MediaPlayer.create(ChooseOthers.this, R.raw.electric_toothbrush);
                        soundStop(electric_toothbrush);
                    } else {
                        spade = MediaPlayer.create(ChooseOthers.this, R.raw.spade);
                        soundStop(spade);
                    }
                    index4 = 1;
                }
            }
        });
        AnimImgBtn(btn_other_4);
        btn_other_5 = findViewById(R.id.btn_other_5);
        btn_other_5.setTag("hammer");
        btn_other_5_name = (String) btn_other_5.getTag();
        btn_other_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index5 == 1){
                    if(btn_other_5_name.equals("hammer")){
                        hammer = MediaPlayer.create(ChooseOthers.this, R.raw.hammer);
                        soundPlay(hammer);
                    } else {
                        star = MediaPlayer.create(ChooseOthers.this, R.raw.star);
                        soundPlay(star);
                    }
                    index5 = 0;
                } else if(index5 == 0){
                    if(btn_other_5_name.equals("hammer")){
                        hammer = MediaPlayer.create(ChooseOthers.this, R.raw.hammer);
                        soundStop(hammer);
                    } else {
                        star = MediaPlayer.create(ChooseOthers.this, R.raw.star);
                        soundStop(star);
                    }
                    index5 = 1;
                }
            }
        });
        AnimImgBtn(btn_other_5);
        btn_other_6 = findViewById(R.id.btn_other_6);
        btn_other_6.setTag("horn");
        btn_other_6_name = (String) btn_other_6.getTag();
        btn_other_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index6 == 1){
                    if(btn_other_6_name.equals("horn")){
                        horn = MediaPlayer.create(ChooseOthers.this, R.raw.horn);
                        soundPlay(horn);
                    } else {
                        support = MediaPlayer.create(ChooseOthers.this, R.raw.support);
                        soundPlay(support);
                    }
                    index6 = 0;
                } else if(index6 == 0){
                    if(btn_other_6_name.equals("horn")){
                        horn = MediaPlayer.create(ChooseOthers.this, R.raw.horn);
                        soundStop(horn);
                    } else {
                        support = MediaPlayer.create(ChooseOthers.this, R.raw.support);
                        soundStop(support);
                    }
                    index6 = 1;
                }
            }
        });
        AnimImgBtn(btn_other_6);
        btn_other_7 = findViewById(R.id.btn_other_7);
        btn_other_7.setTag("jumper");
        btn_other_7_name = (String) btn_other_7.getTag();
        btn_other_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index7 == 1){
                    if(btn_other_7_name.equals("jumper")){
                        jumper = MediaPlayer.create(ChooseOthers.this, R.raw.jumper);
                        soundPlay(jumper);
                    } else {
                        telephone = MediaPlayer.create(ChooseOthers.this, R.raw.telephone);
                        soundPlay(telephone);
                    }
                    index7 = 0;
                } else if(index7 == 0){
                    if(btn_other_7_name.equals("jumper")){
                        jumper = MediaPlayer.create(ChooseOthers.this, R.raw.jumper);
                        soundStop(jumper);
                    } else {
                        telephone = MediaPlayer.create(ChooseOthers.this, R.raw.telephone);
                        soundStop(telephone);
                    }
                    index7 = 1;
                }
            }
        });
        AnimImgBtn(btn_other_7);
        btn_other_8 = findViewById(R.id.btn_other_8);
        btn_other_8.setTag("march");
        btn_other_8_name = (String) btn_other_8.getTag();
        btn_other_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index8 == 1){
                    if(btn_other_8_name.equals("march")){
                        march = MediaPlayer.create(ChooseOthers.this, R.raw.march);
                        soundPlay(march);
                    } else {
                        train = MediaPlayer.create(ChooseOthers.this, R.raw.train);
                        soundPlay(train);
                    }
                    index8 = 0;
                } else if(index8 == 0){
                    if(btn_other_8_name.equals("march")){
                        march = MediaPlayer.create(ChooseOthers.this, R.raw.march);
                        soundStop(march);
                    } else {
                        train = MediaPlayer.create(ChooseOthers.this, R.raw.train);
                        soundStop(train);
                    }
                    index8 = 1;
                }
            }
        });
        AnimImgBtn(btn_other_8);
        btn_other_9 = findViewById(R.id.btn_other_9);
        btn_other_9.setTag("micro");
        btn_other_9_name = (String) btn_other_9.getTag();
        btn_other_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index9 == 1){
                    if(btn_other_9_name.equals("micro")){
                        micro = MediaPlayer.create(ChooseOthers.this, R.raw.micro);
                        soundPlay(micro);
                    } else {
                        watch = MediaPlayer.create(ChooseOthers.this, R.raw.watch);
                        soundPlay(watch);
                    }
                    index9 = 0;
                } else if(index9 == 0){
                    if(btn_other_9_name.equals("micro")){
                        micro = MediaPlayer.create(ChooseOthers.this, R.raw.micro);
                        soundStop(micro);
                    } else {
                        watch = MediaPlayer.create(ChooseOthers.this, R.raw.watch);
                        soundStop(watch);
                    }
                    index9 = 1;
                }
            }
        });
        AnimImgBtn(btn_other_9);
        btn_back_others = findViewById(R.id.btn_back_others);
        btn_back_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseOthers.this, ChooseGame.class);
                startActivity(intent);
            }
        });
        AnimImgBtn(btn_back_others);
        RelativeLayout rel_others = findViewById(R.id.rel_others);
        rel_others.setOnTouchListener(new OnSwipeTouchListener(ChooseOthers.this){
            public void onSwipeLeft(){
                super.onSwipeLeft();
                if(btn_other_1_name.equals("airplane")){
                    btn_other_1.setImageResource(R.drawable.car);
                    btn_other_1.setTag("car");
                    btn_other_1_name = (String) btn_other_1.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.airplane);
                    layers[1] = getResources().getDrawable(R.drawable.car);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_1.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_1.setImageResource(R.drawable.airplane);
                    btn_other_1.setTag("airplane");
                    btn_other_1_name = (String) btn_other_1.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.car);
                    layers[1] = getResources().getDrawable(R.drawable.airplane);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_1.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_2_name.equals("birthday")){
                    btn_other_2.setImageResource(R.drawable.house);
                    btn_other_2.setTag("house");
                    btn_other_2_name = (String) btn_other_2.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.birthday);
                    layers[1] = getResources().getDrawable(R.drawable.house);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_2.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_2.setImageResource(R.drawable.birthday);
                    btn_other_2.setTag("birthday");
                    btn_other_2_name = (String) btn_other_2.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.house);
                    layers[1] = getResources().getDrawable(R.drawable.birthday);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_2.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_3_name.equals("bus")){
                    btn_other_3.setImageResource(R.drawable.pacifier);
                    btn_other_3.setTag("pacifier");
                    btn_other_3_name = (String) btn_other_3.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.bus);
                    layers[1] = getResources().getDrawable(R.drawable.pacifier);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_3.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_3.setImageResource(R.drawable.bus);
                    btn_other_3.setTag("bus");
                    btn_other_3_name = (String) btn_other_3.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.pacifier);
                    layers[1] = getResources().getDrawable(R.drawable.bus);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_3.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_4_name.equals("electric_toothbrush")){
                    btn_other_4.setImageResource(R.drawable.spade);
                    btn_other_4.setTag("spade");
                    btn_other_4_name = (String) btn_other_4.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.electric_toothbrush);
                    layers[1] = getResources().getDrawable(R.drawable.spade);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_4.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_4.setImageResource(R.drawable.electric_toothbrush);
                    btn_other_4.setTag("electric_toothbrush");
                    btn_other_4_name = (String) btn_other_4.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.spade);
                    layers[1] = getResources().getDrawable(R.drawable.electric_toothbrush);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_4.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_5_name.equals("hammer")){
                    btn_other_5.setImageResource(R.drawable.star);
                    btn_other_5.setTag("star");
                    btn_other_5_name = (String) btn_other_5.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.hammer);
                    layers[1] = getResources().getDrawable(R.drawable.star);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_5.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_5.setImageResource(R.drawable.hammer);
                    btn_other_5.setTag("hammer");
                    btn_other_5_name = (String) btn_other_5.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.star);
                    layers[1] = getResources().getDrawable(R.drawable.hammer);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_5.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_6_name.equals("horn")){
                    btn_other_6.setImageResource(R.drawable.support);
                    btn_other_6.setTag("support");
                    btn_other_6_name = (String) btn_other_6.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.horn);
                    layers[1] = getResources().getDrawable(R.drawable.support);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_6.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_6.setImageResource(R.drawable.horn);
                    btn_other_6.setTag("horn");
                    btn_other_6_name = (String) btn_other_6.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.support);
                    layers[1] = getResources().getDrawable(R.drawable.horn);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_6.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_7_name.equals("jumper")){
                    btn_other_7.setImageResource(R.drawable.telephone);
                    btn_other_7.setTag("telephone");
                    btn_other_7_name = (String) btn_other_7.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.jumper);
                    layers[1] = getResources().getDrawable(R.drawable.telephone);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_7.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_7.setImageResource(R.drawable.jumper);
                    btn_other_7.setTag("jumper");
                    btn_other_7_name = (String) btn_other_7.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.telephone);
                    layers[1] = getResources().getDrawable(R.drawable.jumper);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_7.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_8_name.equals("march")){
                    btn_other_8.setImageResource(R.drawable.train);
                    btn_other_8.setTag("train");
                    btn_other_8_name = (String) btn_other_8.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.march);
                    layers[1] = getResources().getDrawable(R.drawable.train);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_8.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_8.setImageResource(R.drawable.march);
                    btn_other_8.setTag("march");
                    btn_other_8_name = (String) btn_other_8.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.train);
                    layers[1] = getResources().getDrawable(R.drawable.march);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_8.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_9_name.equals("micro")){
                    btn_other_9.setImageResource(R.drawable.watch);
                    btn_other_9.setTag("watch");
                    btn_other_9_name = (String) btn_other_9.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.micro);
                    layers[1] = getResources().getDrawable(R.drawable.watch);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_9.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_9.setImageResource(R.drawable.micro);
                    btn_other_9.setTag("micro");
                    btn_other_9_name = (String) btn_other_9.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.watch);
                    layers[1] = getResources().getDrawable(R.drawable.micro);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_9.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
            }
            public void onSwipeRight(){
                super.onSwipeRight();
                if(btn_other_1_name.equals("airplane")){
                    btn_other_1.setImageResource(R.drawable.car);
                    btn_other_1.setTag("car");
                    btn_other_1_name = (String) btn_other_1.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.airplane);
                    layers[1] = getResources().getDrawable(R.drawable.car);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_1.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_1.setImageResource(R.drawable.airplane);
                    btn_other_1.setTag("airplane");
                    btn_other_1_name = (String) btn_other_1.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.car);
                    layers[1] = getResources().getDrawable(R.drawable.airplane);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_1.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_2_name.equals("birthday")){
                    btn_other_2.setImageResource(R.drawable.house);
                    btn_other_2.setTag("house");
                    btn_other_2_name = (String) btn_other_2.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.birthday);
                    layers[1] = getResources().getDrawable(R.drawable.house);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_2.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_2.setImageResource(R.drawable.birthday);
                    btn_other_2.setTag("birthday");
                    btn_other_2_name = (String) btn_other_2.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.house);
                    layers[1] = getResources().getDrawable(R.drawable.birthday);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_2.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_3_name.equals("bus")){
                    btn_other_3.setImageResource(R.drawable.pacifier);
                    btn_other_3.setTag("pacifier");
                    btn_other_3_name = (String) btn_other_3.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.bus);
                    layers[1] = getResources().getDrawable(R.drawable.pacifier);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_3.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_3.setImageResource(R.drawable.bus);
                    btn_other_3.setTag("bus");
                    btn_other_3_name = (String) btn_other_3.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.pacifier);
                    layers[1] = getResources().getDrawable(R.drawable.bus);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_3.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_4_name.equals("electric_toothbrush")){
                    btn_other_4.setImageResource(R.drawable.spade);
                    btn_other_4.setTag("spade");
                    btn_other_4_name = (String) btn_other_4.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.electric_toothbrush);
                    layers[1] = getResources().getDrawable(R.drawable.spade);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_4.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_4.setImageResource(R.drawable.electric_toothbrush);
                    btn_other_4.setTag("electric_toothbrush");
                    btn_other_4_name = (String) btn_other_4.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.spade);
                    layers[1] = getResources().getDrawable(R.drawable.electric_toothbrush);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_4.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_5_name.equals("hammer")){
                    btn_other_5.setImageResource(R.drawable.star);
                    btn_other_5.setTag("star");
                    btn_other_5_name = (String) btn_other_5.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.hammer);
                    layers[1] = getResources().getDrawable(R.drawable.star);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_5.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_5.setImageResource(R.drawable.hammer);
                    btn_other_5.setTag("hammer");
                    btn_other_5_name = (String) btn_other_5.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.star);
                    layers[1] = getResources().getDrawable(R.drawable.hammer);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_5.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_6_name.equals("horn")){
                    btn_other_6.setImageResource(R.drawable.support);
                    btn_other_6.setTag("support");
                    btn_other_6_name = (String) btn_other_6.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.horn);
                    layers[1] = getResources().getDrawable(R.drawable.support);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_6.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_6.setImageResource(R.drawable.horn);
                    btn_other_6.setTag("horn");
                    btn_other_6_name = (String) btn_other_6.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.support);
                    layers[1] = getResources().getDrawable(R.drawable.horn);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_6.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_7_name.equals("jumper")){
                    btn_other_7.setImageResource(R.drawable.telephone);
                    btn_other_7.setTag("telephone");
                    btn_other_7_name = (String) btn_other_7.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.jumper);
                    layers[1] = getResources().getDrawable(R.drawable.telephone);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_7.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_7.setImageResource(R.drawable.jumper);
                    btn_other_7.setTag("jumper");
                    btn_other_7_name = (String) btn_other_7.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.telephone);
                    layers[1] = getResources().getDrawable(R.drawable.jumper);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_7.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_8_name.equals("march")){
                    btn_other_8.setImageResource(R.drawable.train);
                    btn_other_8.setTag("train");
                    btn_other_8_name = (String) btn_other_8.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.march);
                    layers[1] = getResources().getDrawable(R.drawable.train);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_8.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_8.setImageResource(R.drawable.march);
                    btn_other_8.setTag("march");
                    btn_other_8_name = (String) btn_other_8.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.train);
                    layers[1] = getResources().getDrawable(R.drawable.march);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_8.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
                if(btn_other_9_name.equals("micro")){
                    btn_other_9.setImageResource(R.drawable.watch);
                    btn_other_9.setTag("watch");
                    btn_other_9_name = (String) btn_other_9.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.micro);
                    layers[1] = getResources().getDrawable(R.drawable.watch);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_9.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }else{
                    btn_other_9.setImageResource(R.drawable.micro);
                    btn_other_9.setTag("micro");
                    btn_other_9_name = (String) btn_other_9.getTag();
                    Drawable[] layers = new Drawable[2];
                    layers[0] = getResources().getDrawable(R.drawable.watch);
                    layers[1] = getResources().getDrawable(R.drawable.micro);
                    TransitionDrawable transition = new TransitionDrawable(layers);
                    transition.setCrossFadeEnabled(true);
                    btn_other_9.setImageDrawable(transition);
                    transition.startTransition(500 /*animation duration*/);
                }
            }
        });
    }

    public void soundPlay(MediaPlayer sound){
        sound.start();
    }
    public void soundStop(MediaPlayer sound){
        sound.stop();
    }



}
