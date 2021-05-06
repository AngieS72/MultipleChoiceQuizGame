package edu.ranken.ashelton.multiplechoicequizgame;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class SplashScreenActivity extends AppCompatActivity {

    Thread thread;
    Animation anim_logo, anim_text;
    ImageView imgLogo, imgText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        imgLogo = findViewById(R.id.imgLogo);
        imgText = findViewById(R.id.imgText);

        anim_logo = AnimationUtils.loadAnimation(SplashScreenActivity.this, R.anim.anim_logo);
        anim_text = AnimationUtils.loadAnimation(SplashScreenActivity.this, R.anim.anim_text);

        thread = new Thread() {
            @Override
            public void run() {
                try {
                    imgLogo.startAnimation(anim_logo);
                    imgText.startAnimation(anim_text);
                    sleep(5000);
                    //after 5 seconds redirect to another intent

                    Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                    startActivity(i);

                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}