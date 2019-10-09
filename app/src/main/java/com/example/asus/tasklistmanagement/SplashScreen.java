package com.example.asus.tasklistmanagement;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.tasklistmanagement.login.Login;

public class SplashScreen extends AppCompatActivity {

    TextView textView;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        textView = findViewById(R.id.taks_list_txt);
        imageView = findViewById(R.id.logo_img);

        Animation  animate = AnimationUtils.loadAnimation(SplashScreen.this,R.anim.animation);
        imageView.startAnimation(animate);
        textView.startAnimation(animate);
        Handler handler =  new Handler ();
        handler.postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, Login.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}
