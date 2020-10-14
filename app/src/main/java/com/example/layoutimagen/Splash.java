package com.example.layoutimagen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Splash extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        findViewById(R.id.btnInicio).setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
            Intent ir=new Intent(this,MainActivity.class);

            startActivity(ir);
            finish();
    }
}