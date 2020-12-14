package com.example.eva2_9_transiciones;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    ImageView imgViewA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgViewA = findViewById(R.id.imgViewA);

        intent = new Intent(this,MainActivity2.class);

    }

    public void onClick(View v){
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this,imgViewA,"miTransicion");

        startActivity(intent,options.toBundle());

    }

}