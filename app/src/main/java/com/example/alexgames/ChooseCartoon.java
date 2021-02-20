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

public class ChooseCartoon extends AppCompatActivity {
    private ImageButton btn_back_cartoon, btn_geroivmaskah, btn_schenyachiypatrul, btn_skazachniipatrul;
    private MediaPlayer mp_geroivmaskah, mp_schenyachiypatrul, mp_skazachniipatrul, click;
    private Integer index_1 = 1, index_2 = 1, index_3 = 1;

    @SuppressLint({"WrongViewCast", "ClickableViewAccessibility"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cartoon);
        btn_geroivmaskah = findViewById(R.id.btn_geroivmaskah);
        btn_geroivmaskah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index_1 == 1) {
                    mp_geroivmaskah = MediaPlayer.create(ChooseCartoon.this, R.raw.geroivmaskah);
                    soundPlay(mp_geroivmaskah);
                    index_1 = 0;
                } else if (index_1 == 0) {
                    soundStop(mp_geroivmaskah);
                    index_1 = 1;
                }
            }
        });
        AnimImgBtn(btn_geroivmaskah);
        btn_schenyachiypatrul = findViewById(R.id.btn_schenyachiypatrul);
        btn_schenyachiypatrul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index_2 == 1) {
                    mp_schenyachiypatrul = MediaPlayer.create(ChooseCartoon.this, R.raw.schenyachiypatrul);
                    soundPlay(mp_schenyachiypatrul);
                    index_2 = 0;
                } else if (index_2 == 0) {
                    soundStop(mp_schenyachiypatrul);
                    index_2 = 1;
                }
            }
        });
        AnimImgBtn(btn_schenyachiypatrul);
        btn_skazachniipatrul = findViewById(R.id.btn_skazachniipatrul);
        btn_skazachniipatrul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index_3 == 1) {
                    mp_skazachniipatrul = MediaPlayer.create(ChooseCartoon.this, R.raw.skazachniipatrul);
                    soundPlay(mp_skazachniipatrul);
                    index_3 = 0;
                } else if (index_3 == 0) {
                    soundStop(mp_skazachniipatrul);
                    index_3 = 1;
                }
            }
        });
        AnimImgBtn(btn_skazachniipatrul);
        btn_back_cartoon = findViewById(R.id.btn_back_cartoon);
        btn_back_cartoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundStop(mp_geroivmaskah);
                soundStop(mp_schenyachiypatrul);
                soundStop(mp_skazachniipatrul);
                click = MediaPlayer.create(ChooseCartoon.this, R.raw.click);
                soundPlay(click);
                Intent intent = new Intent(ChooseCartoon.this, ChooseGame.class);
                startActivity(intent);
            }
        });
        AnimImgBtn(btn_back_cartoon);
    }

    public void soundPlay(MediaPlayer sound) {
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

    public void soundStop(MediaPlayer sound) {
        if(sound != null){
            sound.stop();
            sound.release();
        }
    }

    public void soundPause(MediaPlayer sound) {
        sound.pause();
    }
}