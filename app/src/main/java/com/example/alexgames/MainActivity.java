package com.example.alexgames;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.alexgames.Function.AnimBtn;

public class MainActivity extends AppCompatActivity {

    public static Button btnStart;
    private MediaPlayer click, bck_sound;
    private ImageButton btn_exit;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        bck_sound = MediaPlayer.create(MainActivity.this, R.raw.background_sound);
        bck_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if (bck_sound != null){
                    bck_sound.stop();
                    bck_sound.release();
                }
            }
        });
        bck_sound.setVolume(0.1f, 0.1f);
        bck_sound.setLooping(true);
        bck_sound.start();

        btn_exit = findViewById(R.id.btn_exit);
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bck_sound.stop();
                bck_sound.release();
                finish();
                System.exit(0);
            }
        });

        ImageView img_logo = findViewById(R.id.logo);
        btnStart = findViewById(R.id.btn_start);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click = MediaPlayer.create(MainActivity.this, R.raw.click);
                soundPlay(click);
                Intent intent = new Intent(MainActivity.this, ChooseGame.class);
                startActivity(intent);
            }
        });
        AnimBtn(btnStart);
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
        sound.setVolume(0.2f, 0.2f);
        sound.start();
    }
    public void soundStop(MediaPlayer sound){
        if(sound != null){
            sound.stop();
            sound.release();
        }
    }


}