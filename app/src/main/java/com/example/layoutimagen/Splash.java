package com.example.layoutimagen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    TextView txtSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //txtSplash.findViewById(R.id.txtSplash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this,MainActivity.class));

                finish();
            }
        }, 3000);

        //TIMER
        //new CountDownTimer(3000, 1000)
        //{
        //  @Override
        //public void onTick(long millisUntilFinished) {
        //  txtSplash.setText("Restan:"+millisUntilFinished/1000+" Segundos");
        //}
        //@Override
        //public void onFinish() {
        //  startActivity(new Intent(Splash.this,MainActivity.class));
        //finish();
        //txtSplash.setText("Listo");
        //}
        //}.start();


    }
}