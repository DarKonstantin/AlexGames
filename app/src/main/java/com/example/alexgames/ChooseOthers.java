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
            micro, pacifier, spade, star, support, telephone, train, watch, apple, attach, banana, bell, cherry,
            citrus, cut, dental, drum, football, french_fries, ghost, hair_dryer, hat, icecream, katana_sword, light, truck, click, shuh;
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
                switch (index1){
                    case 0:{
                        if(btn_other_1_name.equals("airplane")){
                        airplane = MediaPlayer.create(ChooseOthers.this, R.raw.airplane);
                        soundStop(airplane);
                        } else if(btn_other_1_name.equals("car")){
                            car = MediaPlayer.create(ChooseOthers.this, R.raw.car);
                            soundStop(car);
                        }else if(btn_other_1_name.equals("apple")){
                            apple = MediaPlayer.create(ChooseOthers.this, R.raw.apple);
                            soundStop(apple);
                        }else if(btn_other_1_name.equals("football")){
                            football = MediaPlayer.create(ChooseOthers.this, R.raw.football);
                            soundStop(football);
                        }
                        index1 = 1;
                        break;
                    }
                    case 1: {
                        if (btn_other_1_name.equals("airplane")) {
                            airplane = MediaPlayer.create(ChooseOthers.this, R.raw.airplane);
                            soundPlay(airplane);
                        } else if(btn_other_1_name.equals("car")){
                            car = MediaPlayer.create(ChooseOthers.this, R.raw.car);
                            soundPlay(car);
                        }else if(btn_other_1_name.equals("apple")){
                            apple = MediaPlayer.create(ChooseOthers.this, R.raw.apple);
                            soundPlay(apple);
                        }else if(btn_other_1_name.equals("football")){
                            football = MediaPlayer.create(ChooseOthers.this, R.raw.football);
                            soundPlay(football);
                        }
                        index1 = 0;
                        break;
                    }
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
                switch (index2){
                    case 0:{
                        if(btn_other_2_name.equals("birthday")){
                            birthday = MediaPlayer.create(ChooseOthers.this, R.raw.birthday);
                            soundStop(birthday);
                        } else if(btn_other_2_name.equals("house")){
                            house = MediaPlayer.create(ChooseOthers.this, R.raw.house);
                            soundStop(house);
                        }else if(btn_other_2_name.equals("attach")){
                            attach = MediaPlayer.create(ChooseOthers.this, R.raw.attach);
                            soundStop(attach);
                        }else if(btn_other_2_name.equals("french_fries")){
                            french_fries = MediaPlayer.create(ChooseOthers.this, R.raw.french_fries);
                            soundStop(french_fries);
                        }
                        index2 = 1;
                        break;
                    }
                    case 1:{
                        if(btn_other_2_name.equals("birthday")){
                            birthday = MediaPlayer.create(ChooseOthers.this, R.raw.birthday);
                            soundPlay(birthday);
                        } else if(btn_other_2_name.equals("house")){
                            house = MediaPlayer.create(ChooseOthers.this, R.raw.house);
                            soundPlay(house);
                        }else if(btn_other_2_name.equals("attach")){
                            attach = MediaPlayer.create(ChooseOthers.this, R.raw.attach);
                            soundPlay(attach);
                        }else if(btn_other_2_name.equals("french_fries")){
                            french_fries = MediaPlayer.create(ChooseOthers.this, R.raw.french_fries);
                            soundPlay(french_fries);
                        }
                        index2 = 0;
                        break;
                    }
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
                switch (index3){
                    case 0:{
                        if(btn_other_3_name.equals("bus")){
                            bus = MediaPlayer.create(ChooseOthers.this, R.raw.bus);
                            soundStop(bus);
                        } else if(btn_other_3_name.equals("pacifier")){
                            pacifier = MediaPlayer.create(ChooseOthers.this, R.raw.pacifier);
                            soundStop(pacifier);
                        } else if(btn_other_3_name.equals("banana")){
                            banana = MediaPlayer.create(ChooseOthers.this, R.raw.banana);
                            soundStop(banana);
                        } else if(btn_other_3_name.equals("ghost")){
                            ghost = MediaPlayer.create(ChooseOthers.this, R.raw.ghost);
                            soundStop(ghost);
                        }
                        index3 = 1;
                        break;
                    }
                    case 1:{
                        if(btn_other_3_name.equals("bus")){
                            bus = MediaPlayer.create(ChooseOthers.this, R.raw.bus);
                            soundPlay(bus);
                        } else if(btn_other_3_name.equals("pacifier")){
                            pacifier = MediaPlayer.create(ChooseOthers.this, R.raw.pacifier);
                            soundPlay(pacifier);
                        } else if(btn_other_3_name.equals("banana")){
                            banana = MediaPlayer.create(ChooseOthers.this, R.raw.banana);
                            soundPlay(banana);
                        } else if(btn_other_3_name.equals("ghost")){
                            ghost = MediaPlayer.create(ChooseOthers.this, R.raw.ghost);
                            soundPlay(ghost);
                        }
                        index3 = 0;
                        break;
                    }
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
                switch (index4){
                    case 0:{
                        if(btn_other_4_name.equals("electric_toothbrush")){
                            electric_toothbrush = MediaPlayer.create(ChooseOthers.this, R.raw.electric_toothbrush);
                            soundStop(electric_toothbrush);
                        } else if(btn_other_4_name.equals("spade")){
                            spade = MediaPlayer.create(ChooseOthers.this, R.raw.spade);
                            soundStop(spade);
                        } else if(btn_other_4_name.equals("bell")){
                            bell = MediaPlayer.create(ChooseOthers.this, R.raw.bell);
                            soundStop(bell);
                        } else if(btn_other_4_name.equals("hair_dryer")){
                            hair_dryer = MediaPlayer.create(ChooseOthers.this, R.raw.hair_dryer);
                            soundStop(hair_dryer);
                        }
                        index4 = 1;
                        break;
                    }
                    case 1:{
                        if(btn_other_4_name.equals("electric_toothbrush")){
                            electric_toothbrush = MediaPlayer.create(ChooseOthers.this, R.raw.electric_toothbrush);
                            soundPlay(electric_toothbrush);
                        } else if(btn_other_4_name.equals("spade")){
                            spade = MediaPlayer.create(ChooseOthers.this, R.raw.spade);
                            soundPlay(spade);
                        } else if(btn_other_4_name.equals("bell")){
                            bell = MediaPlayer.create(ChooseOthers.this, R.raw.bell);
                            soundPlay(bell);
                        } else if(btn_other_4_name.equals("hair_dryer")){
                            hair_dryer = MediaPlayer.create(ChooseOthers.this, R.raw.hair_dryer);
                            soundPlay(hair_dryer);
                        }
                        index4 = 0;
                        break;
                    }
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
                switch (index5){
                    case 0:{
                        if(btn_other_5_name.equals("hammer")){
                            hammer = MediaPlayer.create(ChooseOthers.this, R.raw.hammer);
                            soundStop(hammer);
                        } else if(btn_other_5_name.equals("star")){
                            star = MediaPlayer.create(ChooseOthers.this, R.raw.star);
                            soundStop(star);
                        } else if(btn_other_5_name.equals("cherry")){
                            cherry = MediaPlayer.create(ChooseOthers.this, R.raw.cherry);
                            soundStop(cherry);
                        } else if(btn_other_5_name.equals("hat")){
                            hat = MediaPlayer.create(ChooseOthers.this, R.raw.hat);
                            soundStop(hat);
                        }
                        index5 = 1;
                        break;
                    }
                    case 1:{
                        if(btn_other_5_name.equals("hammer")){
                            hammer = MediaPlayer.create(ChooseOthers.this, R.raw.hammer);
                            soundPlay(hammer);
                        } else if(btn_other_5_name.equals("star")){
                            star = MediaPlayer.create(ChooseOthers.this, R.raw.star);
                            soundPlay(star);
                        } else if(btn_other_5_name.equals("cherry")){
                            cherry = MediaPlayer.create(ChooseOthers.this, R.raw.cherry);
                            soundPlay(cherry);
                        } else if(btn_other_5_name.equals("hat")){
                            hat = MediaPlayer.create(ChooseOthers.this, R.raw.hat);
                            soundPlay(hat);
                        }
                        index5 = 0;
                        break;
                    }
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
                switch (index6){
                    case 0:{
                        if(btn_other_6_name.equals("horn")){
                            horn = MediaPlayer.create(ChooseOthers.this, R.raw.horn);
                            soundStop(horn);
                        } else if(btn_other_6_name.equals("support")){
                            support = MediaPlayer.create(ChooseOthers.this, R.raw.support);
                            soundStop(support);
                        } else if(btn_other_6_name.equals("citrus")){
                            citrus = MediaPlayer.create(ChooseOthers.this, R.raw.citrus);
                            soundStop(citrus);
                        } else if(btn_other_6_name.equals("icecream")){
                            icecream = MediaPlayer.create(ChooseOthers.this, R.raw.icecream);
                            soundStop(icecream);
                        }
                        index6 = 1;
                        break;
                    }
                    case 1:{
                        if(btn_other_6_name.equals("horn")){
                            horn = MediaPlayer.create(ChooseOthers.this, R.raw.horn);
                            soundPlay(horn);
                        } else if(btn_other_6_name.equals("support")){
                            support = MediaPlayer.create(ChooseOthers.this, R.raw.support);
                            soundPlay(support);
                        } else if(btn_other_6_name.equals("citrus")){
                            citrus = MediaPlayer.create(ChooseOthers.this, R.raw.citrus);
                            soundPlay(citrus);
                        } else if(btn_other_6_name.equals("icecream")){
                            icecream = MediaPlayer.create(ChooseOthers.this, R.raw.icecream);
                            soundPlay(icecream);
                        }
                        index6 = 0;
                        break;
                    }
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
                switch (index7){
                    case 0:{
                        if(btn_other_7_name.equals("jumper")){
                            jumper = MediaPlayer.create(ChooseOthers.this, R.raw.jumper);
                            soundStop(jumper);
                        } else if(btn_other_7_name.equals("telephone")){
                            telephone = MediaPlayer.create(ChooseOthers.this, R.raw.telephone);
                            soundStop(telephone);
                        } else if(btn_other_7_name.equals("cut")){
                            cut = MediaPlayer.create(ChooseOthers.this, R.raw.cut);
                            soundStop(cut);
                        } else if(btn_other_7_name.equals("katana_sword")){
                        katana_sword = MediaPlayer.create(ChooseOthers.this, R.raw.katana_sword);
                        soundStop(katana_sword);
                        }
                        index7 = 1;
                        break;
                    }
                    case 1:{
                        if(btn_other_7_name.equals("jumper")){
                            jumper = MediaPlayer.create(ChooseOthers.this, R.raw.jumper);
                            soundPlay(jumper);
                        } else if(btn_other_7_name.equals("telephone")){
                            telephone = MediaPlayer.create(ChooseOthers.this, R.raw.telephone);
                            soundPlay(telephone);
                        } else if(btn_other_7_name.equals("cut")){
                            cut = MediaPlayer.create(ChooseOthers.this, R.raw.cut);
                            soundPlay(cut);
                        } else if(btn_other_7_name.equals("katana_sword")){
                            katana_sword = MediaPlayer.create(ChooseOthers.this, R.raw.katana_sword);
                            soundPlay(katana_sword);
                        }
                        index7 = 0;
                        break;
                    }
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
                switch (index8){
                    case 0:{
                        if(btn_other_8_name.equals("march")){
                            march = MediaPlayer.create(ChooseOthers.this, R.raw.march);
                            soundStop(march);
                        } else if(btn_other_8_name.equals("train")){
                            train = MediaPlayer.create(ChooseOthers.this, R.raw.train);
                            soundStop(train);
                        } else if(btn_other_8_name.equals("dental")){
                            dental = MediaPlayer.create(ChooseOthers.this, R.raw.dental);
                            soundStop(dental);
                        } else if(btn_other_8_name.equals("light")){
                            light = MediaPlayer.create(ChooseOthers.this, R.raw.light);
                            soundStop(light);
                        }
                        index8 = 1;
                        break;
                    }
                    case 1:{
                        if(btn_other_8_name.equals("march")){
                            march = MediaPlayer.create(ChooseOthers.this, R.raw.march);
                            soundPlay(march);
                        } else if(btn_other_8_name.equals("train")){
                            train = MediaPlayer.create(ChooseOthers.this, R.raw.train);
                            soundPlay(train);
                        } else if(btn_other_8_name.equals("dental")){
                            dental = MediaPlayer.create(ChooseOthers.this, R.raw.dental);
                            soundPlay(dental);
                        } else if(btn_other_8_name.equals("light")){
                            light = MediaPlayer.create(ChooseOthers.this, R.raw.light);
                            soundPlay(light);
                        }
                        index8 = 0;
                        break;
                    }
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
                switch (index9){
                    case 0:{
                        if(btn_other_9_name.equals("micro")){
//                            micro = MediaPlayer.create(ChooseOthers.this, R.raw.micro);
                            soundStop(micro);
                        } else if(btn_other_9_name.equals("watch")){
                            watch = MediaPlayer.create(ChooseOthers.this, R.raw.watch);
                            soundStop(watch);
                        } else if(btn_other_9_name.equals("drum")){
                            drum = MediaPlayer.create(ChooseOthers.this, R.raw.drum);
                            soundStop(drum);
                        } else if(btn_other_9_name.equals("truck")){
                            truck = MediaPlayer.create(ChooseOthers.this, R.raw.truck);
                            soundStop(truck);
                        }
                        index9 = 1;
                        break;
                    }
                    case 1:{
                        if(btn_other_9_name.equals("micro")){
                            micro = MediaPlayer.create(ChooseOthers.this, R.raw.micro);
                            soundPlay(micro);
                        } else if(btn_other_9_name.equals("watch")){
                            watch = MediaPlayer.create(ChooseOthers.this, R.raw.watch);
                            soundPlay(watch);
                        } else if(btn_other_9_name.equals("drum")){
                            drum = MediaPlayer.create(ChooseOthers.this, R.raw.drum);
                            soundPlay(drum);
                        } else if(btn_other_9_name.equals("truck")){
                            truck = MediaPlayer.create(ChooseOthers.this, R.raw.truck);
                            soundPlay(truck);
                        }
                        index9 = 0;
                        break;
                    }
                }
            }
        });
        AnimImgBtn(btn_other_9);
        btn_back_others = findViewById(R.id.btn_back_others);
        btn_back_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click = MediaPlayer.create(ChooseOthers.this, R.raw.click);
                soundPlay(click);
                Intent intent = new Intent(ChooseOthers.this, ChooseGame.class);
                startActivity(intent);
            }
        });
        AnimImgBtn(btn_back_others);
        RelativeLayout rel_others = findViewById(R.id.rel_others);
        rel_others.setOnTouchListener(new OnSwipeTouchListener(ChooseOthers.this){
            public void onSwipeLeft(){
                super.onSwipeLeft();
                shuh = MediaPlayer.create(ChooseOthers.this, R.raw.shuh);
                soundPlay(shuh);
                switch (btn_other_1_name){
                    case "airplane":{
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
                        break;
                    }
                    case "car":{
                        btn_other_1.setImageResource(R.drawable.apple);
                        btn_other_1.setTag("apple");
                        btn_other_1_name = (String) btn_other_1.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.car);
                        layers[1] = getResources().getDrawable(R.drawable.apple);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_1.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "apple":{
                        btn_other_1.setImageResource(R.drawable.football);
                        btn_other_1.setTag("football");
                        btn_other_1_name = (String) btn_other_1.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.apple);
                        layers[1] = getResources().getDrawable(R.drawable.football);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_1.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "football":{
                        btn_other_1.setImageResource(R.drawable.airplane);
                        btn_other_1.setTag("airplane");
                        btn_other_1_name = (String) btn_other_1.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.football);
                        layers[1] = getResources().getDrawable(R.drawable.airplane);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_1.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_2_name){
                    case "birthday":{
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
                        break;
                    }
                    case "house":{
                        btn_other_2.setImageResource(R.drawable.attach);
                        btn_other_2.setTag("attach");
                        btn_other_2_name = (String) btn_other_2.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.house);
                        layers[1] = getResources().getDrawable(R.drawable.attach);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_2.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "attach":{
                        btn_other_2.setImageResource(R.drawable.french_fries);
                        btn_other_2.setTag("french_fries");
                        btn_other_2_name = (String) btn_other_2.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.attach);
                        layers[1] = getResources().getDrawable(R.drawable.french_fries);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_2.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "french_fries":{
                        btn_other_2.setImageResource(R.drawable.birthday);
                        btn_other_2.setTag("birthday");
                        btn_other_2_name = (String) btn_other_2.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.french_fries);
                        layers[1] = getResources().getDrawable(R.drawable.birthday);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_2.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_3_name){
                    case "bus":{
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
                        break;
                    }
                    case "pacifier":{
                        btn_other_3.setImageResource(R.drawable.banana);
                        btn_other_3.setTag("banana");
                        btn_other_3_name = (String) btn_other_3.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.pacifier);
                        layers[1] = getResources().getDrawable(R.drawable.banana);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_3.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "banana":{
                        btn_other_3.setImageResource(R.drawable.ghost);
                        btn_other_3.setTag("ghost");
                        btn_other_3_name = (String) btn_other_3.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.banana);
                        layers[1] = getResources().getDrawable(R.drawable.ghost);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_3.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "ghost":{
                        btn_other_3.setImageResource(R.drawable.bus);
                        btn_other_3.setTag("bus");
                        btn_other_3_name = (String) btn_other_3.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.ghost);
                        layers[1] = getResources().getDrawable(R.drawable.bus);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_3.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_4_name){
                    case "electric_toothbrush":{
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
                        break;
                    }
                    case "spade":{
                        btn_other_4.setImageResource(R.drawable.bell);
                        btn_other_4.setTag("bell");
                        btn_other_4_name = (String) btn_other_4.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.spade);
                        layers[1] = getResources().getDrawable(R.drawable.bell);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_4.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "bell":{
                        btn_other_4.setImageResource(R.drawable.hair_dryer);
                        btn_other_4.setTag("hair_dryer");
                        btn_other_4_name = (String) btn_other_4.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.bell);
                        layers[1] = getResources().getDrawable(R.drawable.hair_dryer);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_4.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "hair_dryer":{
                        btn_other_4.setImageResource(R.drawable.electric_toothbrush);
                        btn_other_4.setTag("electric_toothbrush");
                        btn_other_4_name = (String) btn_other_4.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.hair_dryer);
                        layers[1] = getResources().getDrawable(R.drawable.electric_toothbrush);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_4.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_5_name){
                    case "hammer":{
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
                        break;
                    }
                    case "star":{
                        btn_other_5.setImageResource(R.drawable.cherry);
                        btn_other_5.setTag("cherry");
                        btn_other_5_name = (String) btn_other_5.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.star);
                        layers[1] = getResources().getDrawable(R.drawable.cherry);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_5.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "cherry":{
                        btn_other_5.setImageResource(R.drawable.hat);
                        btn_other_5.setTag("hat");
                        btn_other_5_name = (String) btn_other_5.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.cherry);
                        layers[1] = getResources().getDrawable(R.drawable.hat);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_5.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "hat":{
                        btn_other_5.setImageResource(R.drawable.hammer);
                        btn_other_5.setTag("hammer");
                        btn_other_5_name = (String) btn_other_5.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.hat);
                        layers[1] = getResources().getDrawable(R.drawable.hammer);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_5.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_6_name){
                    case "horn":{
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
                        break;
                    }
                    case "support":{
                        btn_other_6.setImageResource(R.drawable.citrus);
                        btn_other_6.setTag("citrus");
                        btn_other_6_name = (String) btn_other_6.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.support);
                        layers[1] = getResources().getDrawable(R.drawable.citrus);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_6.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "citrus":{
                        btn_other_6.setImageResource(R.drawable.icecream);
                        btn_other_6.setTag("icecream");
                        btn_other_6_name = (String) btn_other_6.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.citrus);
                        layers[1] = getResources().getDrawable(R.drawable.icecream);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_6.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "icecream":{
                        btn_other_6.setImageResource(R.drawable.horn);
                        btn_other_6.setTag("horn");
                        btn_other_6_name = (String) btn_other_6.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.icecream);
                        layers[1] = getResources().getDrawable(R.drawable.horn);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_6.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_7_name){
                    case "jumper":{
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
                        break;
                    }
                    case "telephone":{
                        btn_other_7.setImageResource(R.drawable.cut);
                        btn_other_7.setTag("cut");
                        btn_other_7_name = (String) btn_other_7.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.telephone);
                        layers[1] = getResources().getDrawable(R.drawable.cut);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_7.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "cut":{
                        btn_other_7.setImageResource(R.drawable.katana_sword);
                        btn_other_7.setTag("katana_sword");
                        btn_other_7_name = (String) btn_other_7.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.cut);
                        layers[1] = getResources().getDrawable(R.drawable.katana_sword);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_7.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "katana_sword":{
                        btn_other_7.setImageResource(R.drawable.jumper);
                        btn_other_7.setTag("jumper");
                        btn_other_7_name = (String) btn_other_7.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.katana_sword);
                        layers[1] = getResources().getDrawable(R.drawable.jumper);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_7.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_8_name){
                    case "march":{
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
                        break;
                    }
                    case "train":{
                        btn_other_8.setImageResource(R.drawable.dental);
                        btn_other_8.setTag("dental");
                        btn_other_8_name = (String) btn_other_8.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.train);
                        layers[1] = getResources().getDrawable(R.drawable.dental);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_8.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "dental":{
                        btn_other_8.setImageResource(R.drawable.light);
                        btn_other_8.setTag("light");
                        btn_other_8_name = (String) btn_other_8.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.dental);
                        layers[1] = getResources().getDrawable(R.drawable.light);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_8.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "light":{
                        btn_other_8.setImageResource(R.drawable.march);
                        btn_other_8.setTag("march");
                        btn_other_8_name = (String) btn_other_8.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.light);
                        layers[1] = getResources().getDrawable(R.drawable.march);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_8.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_9_name){
                    case "micro":{
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
                        break;
                    }
                    case "watch":{
                        btn_other_9.setImageResource(R.drawable.drum);
                        btn_other_9.setTag("drum");
                        btn_other_9_name = (String) btn_other_9.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.watch);
                        layers[1] = getResources().getDrawable(R.drawable.drum);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_9.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "drum":{
                        btn_other_9.setImageResource(R.drawable.truck);
                        btn_other_9.setTag("truck");
                        btn_other_9_name = (String) btn_other_9.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.drum);
                        layers[1] = getResources().getDrawable(R.drawable.truck);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_9.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "truck":{
                        btn_other_9.setImageResource(R.drawable.micro);
                        btn_other_9.setTag("micro");
                        btn_other_9_name = (String) btn_other_9.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.truck);
                        layers[1] = getResources().getDrawable(R.drawable.micro);
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
                shuh = MediaPlayer.create(ChooseOthers.this, R.raw.shuh);
                soundPlay(shuh);
                switch (btn_other_1_name){
                    case "airplane":{
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
                        break;
                    }
                    case "car":{
                        btn_other_1.setImageResource(R.drawable.apple);
                        btn_other_1.setTag("apple");
                        btn_other_1_name = (String) btn_other_1.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.car);
                        layers[1] = getResources().getDrawable(R.drawable.apple);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_1.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "apple":{
                        btn_other_1.setImageResource(R.drawable.football);
                        btn_other_1.setTag("football");
                        btn_other_1_name = (String) btn_other_1.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.apple);
                        layers[1] = getResources().getDrawable(R.drawable.football);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_1.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "football":{
                        btn_other_1.setImageResource(R.drawable.airplane);
                        btn_other_1.setTag("airplane");
                        btn_other_1_name = (String) btn_other_1.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.football);
                        layers[1] = getResources().getDrawable(R.drawable.airplane);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_1.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_2_name){
                    case "birthday":{
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
                        break;
                    }
                    case "house":{
                        btn_other_2.setImageResource(R.drawable.attach);
                        btn_other_2.setTag("attach");
                        btn_other_2_name = (String) btn_other_2.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.house);
                        layers[1] = getResources().getDrawable(R.drawable.attach);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_2.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "attach":{
                        btn_other_2.setImageResource(R.drawable.french_fries);
                        btn_other_2.setTag("french_fries");
                        btn_other_2_name = (String) btn_other_2.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.attach);
                        layers[1] = getResources().getDrawable(R.drawable.french_fries);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_2.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "french_fries":{
                        btn_other_2.setImageResource(R.drawable.birthday);
                        btn_other_2.setTag("birthday");
                        btn_other_2_name = (String) btn_other_2.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.french_fries);
                        layers[1] = getResources().getDrawable(R.drawable.birthday);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_2.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_3_name){
                    case "bus":{
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
                        break;
                    }
                    case "pacifier":{
                        btn_other_3.setImageResource(R.drawable.banana);
                        btn_other_3.setTag("banana");
                        btn_other_3_name = (String) btn_other_3.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.pacifier);
                        layers[1] = getResources().getDrawable(R.drawable.banana);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_3.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "banana":{
                        btn_other_3.setImageResource(R.drawable.ghost);
                        btn_other_3.setTag("ghost");
                        btn_other_3_name = (String) btn_other_3.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.banana);
                        layers[1] = getResources().getDrawable(R.drawable.ghost);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_3.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "ghost":{
                        btn_other_3.setImageResource(R.drawable.bus);
                        btn_other_3.setTag("bus");
                        btn_other_3_name = (String) btn_other_3.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.ghost);
                        layers[1] = getResources().getDrawable(R.drawable.bus);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_3.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_4_name){
                    case "electric_toothbrush":{
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
                        break;
                    }
                    case "spade":{
                        btn_other_4.setImageResource(R.drawable.bell);
                        btn_other_4.setTag("bell");
                        btn_other_4_name = (String) btn_other_4.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.spade);
                        layers[1] = getResources().getDrawable(R.drawable.bell);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_4.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "bell":{
                        btn_other_4.setImageResource(R.drawable.hair_dryer);
                        btn_other_4.setTag("hair_dryer");
                        btn_other_4_name = (String) btn_other_4.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.bell);
                        layers[1] = getResources().getDrawable(R.drawable.hair_dryer);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_4.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "hair_dryer":{
                        btn_other_4.setImageResource(R.drawable.electric_toothbrush);
                        btn_other_4.setTag("electric_toothbrush");
                        btn_other_4_name = (String) btn_other_4.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.hair_dryer);
                        layers[1] = getResources().getDrawable(R.drawable.electric_toothbrush);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_4.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_5_name){
                    case "hammer":{
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
                        break;
                    }
                    case "star":{
                        btn_other_5.setImageResource(R.drawable.cherry);
                        btn_other_5.setTag("cherry");
                        btn_other_5_name = (String) btn_other_5.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.star);
                        layers[1] = getResources().getDrawable(R.drawable.cherry);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_5.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "cherry":{
                        btn_other_5.setImageResource(R.drawable.hat);
                        btn_other_5.setTag("hat");
                        btn_other_5_name = (String) btn_other_5.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.cherry);
                        layers[1] = getResources().getDrawable(R.drawable.hat);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_5.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "hat":{
                        btn_other_5.setImageResource(R.drawable.hammer);
                        btn_other_5.setTag("hammer");
                        btn_other_5_name = (String) btn_other_5.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.hat);
                        layers[1] = getResources().getDrawable(R.drawable.hammer);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_5.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_6_name){
                    case "horn":{
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
                        break;
                    }
                    case "support":{
                        btn_other_6.setImageResource(R.drawable.citrus);
                        btn_other_6.setTag("citrus");
                        btn_other_6_name = (String) btn_other_6.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.support);
                        layers[1] = getResources().getDrawable(R.drawable.citrus);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_6.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "citrus":{
                        btn_other_6.setImageResource(R.drawable.icecream);
                        btn_other_6.setTag("icecream");
                        btn_other_6_name = (String) btn_other_6.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.citrus);
                        layers[1] = getResources().getDrawable(R.drawable.icecream);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_6.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "icecream":{
                        btn_other_6.setImageResource(R.drawable.horn);
                        btn_other_6.setTag("horn");
                        btn_other_6_name = (String) btn_other_6.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.icecream);
                        layers[1] = getResources().getDrawable(R.drawable.horn);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_6.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_7_name){
                    case "jumper":{
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
                        break;
                    }
                    case "telephone":{
                        btn_other_7.setImageResource(R.drawable.cut);
                        btn_other_7.setTag("cut");
                        btn_other_7_name = (String) btn_other_7.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.telephone);
                        layers[1] = getResources().getDrawable(R.drawable.cut);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_7.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "cut":{
                        btn_other_7.setImageResource(R.drawable.katana_sword);
                        btn_other_7.setTag("katana_sword");
                        btn_other_7_name = (String) btn_other_7.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.cut);
                        layers[1] = getResources().getDrawable(R.drawable.katana_sword);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_7.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "katana_sword":{
                        btn_other_7.setImageResource(R.drawable.jumper);
                        btn_other_7.setTag("jumper");
                        btn_other_7_name = (String) btn_other_7.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.katana_sword);
                        layers[1] = getResources().getDrawable(R.drawable.jumper);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_7.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_8_name){
                    case "march":{
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
                        break;
                    }
                    case "train":{
                        btn_other_8.setImageResource(R.drawable.dental);
                        btn_other_8.setTag("dental");
                        btn_other_8_name = (String) btn_other_8.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.train);
                        layers[1] = getResources().getDrawable(R.drawable.dental);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_8.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "dental":{
                        btn_other_8.setImageResource(R.drawable.light);
                        btn_other_8.setTag("light");
                        btn_other_8_name = (String) btn_other_8.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.dental);
                        layers[1] = getResources().getDrawable(R.drawable.light);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_8.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "light":{
                        btn_other_8.setImageResource(R.drawable.march);
                        btn_other_8.setTag("march");
                        btn_other_8_name = (String) btn_other_8.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.light);
                        layers[1] = getResources().getDrawable(R.drawable.march);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_8.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                }
                switch (btn_other_9_name){
                    case "micro":{
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
                        break;
                    }
                    case "watch":{
                        btn_other_9.setImageResource(R.drawable.drum);
                        btn_other_9.setTag("drum");
                        btn_other_9_name = (String) btn_other_9.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.watch);
                        layers[1] = getResources().getDrawable(R.drawable.drum);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_9.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "drum":{
                        btn_other_9.setImageResource(R.drawable.truck);
                        btn_other_9.setTag("truck");
                        btn_other_9_name = (String) btn_other_9.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.drum);
                        layers[1] = getResources().getDrawable(R.drawable.truck);
                        TransitionDrawable transition = new TransitionDrawable(layers);
                        transition.setCrossFadeEnabled(true);
                        btn_other_9.setImageDrawable(transition);
                        transition.startTransition(500 /*animation duration*/);
                        break;
                    }
                    case "truck":{
                        btn_other_9.setImageResource(R.drawable.micro);
                        btn_other_9.setTag("micro");
                        btn_other_9_name = (String) btn_other_9.getTag();
                        Drawable[] layers = new Drawable[2];
                        layers[0] = getResources().getDrawable(R.drawable.truck);
                        layers[1] = getResources().getDrawable(R.drawable.micro);
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
