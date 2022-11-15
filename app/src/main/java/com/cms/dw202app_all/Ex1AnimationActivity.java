package com.cms.dw202app_all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Ex1AnimationActivity extends AppCompatActivity {

    Animation ani1,ani2,ani3,ani4,ani5,ani6;
    ImageView ivTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1_animation);

        ivTest = (ImageView)findViewById(R.id.imageView);
        findViewById(R.id.btnAni1).setOnClickListener(mClick);
        findViewById(R.id.btnAni2).setOnClickListener(mClick);
        findViewById(R.id.btnAni3).setOnClickListener(mClick);
        findViewById(R.id.btnAni4).setOnClickListener(mClick);
        findViewById(R.id.btnAni5).setOnClickListener(mClick);
        findViewById(R.id.btnAni6).setOnClickListener(mClick);

        ani1 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.set);
        ani2 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.set2);
        ani3 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.rotate2);
        ani4 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.translate2);
        ani5 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.scale2);
        ani6 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.set3);

    }

    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btnAni1:
                    ivTest.startAnimation(ani1);
                    break;
                case R.id.btnAni2:
                    ivTest.startAnimation(ani2);
                    break;
                case R.id.btnAni3:
                    ivTest.startAnimation(ani3);
                    break;
                case R.id.btnAni4:
                    ivTest.startAnimation(ani4);
                    break;
                case R.id.btnAni5:
                    ivTest.startAnimation(ani5);
                    break;
                case R.id.btnAni6:
                    ivTest.startAnimation(ani6);
                    break;
            }

        }
    };
}