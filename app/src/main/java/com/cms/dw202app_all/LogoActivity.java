package com.cms.dw202app_all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class LogoActivity extends AppCompatActivity {
    Animation ani1,ani2;
    ImageView ivTest;
    TextView tvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        ivTest = (ImageView)findViewById(R.id.imageView);
        tvTitle = (TextView)findViewById(R.id.tvTitle);
        ani1 = AnimationUtils.loadAnimation(LogoActivity.this, R.anim.rotate);
        ani2 = AnimationUtils.loadAnimation(LogoActivity.this, R.anim.scale);

        ivTest.startAnimation(ani1);
        tvTitle.startAnimation(ani2);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent (LogoActivity.this, MainActivity.class);
                startActivity(intent); //인트로 실행 후 바로 MainActivity로 넘어감.
                finish();
            }
        },4000); //1초 후 인트로 실행
    }
}