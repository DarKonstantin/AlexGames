package com.example.alexgames;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {

    private Switch sw_country;
    Button btnStart;
    TextView tv_what_is_it, tv_who_is_it, tv_sing, tv_collect;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_settings);

        btnStart = findViewById(R.id.btn_start);
        tv_what_is_it = findViewById(R.id.tv_what_is_it);
        tv_who_is_it = findViewById(R.id.tv_who_is_it);
        tv_sing = findViewById(R.id.tv_sing);
        tv_collect = findViewById(R.id.tv_collect);
        sw_country = findViewById(R.id.sw_country);
        sw_country.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                if(isChecked){


                    btnStart.setText("Start");
                }else{

                }
            }
        });

    }
}
