package com.cms.dw202app_all;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Ex2GifActivity extends AppCompatActivity {

    ImageView ivTest,ivTest2,ivTest3,ivTest4,ivTest5,ivTest6,ivTest7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2_gif);

        ivTest = (ImageView)findViewById(R.id.imageView);
        ivTest2 = (ImageView)findViewById(R.id.imageView2);
        ivTest3 = (ImageView)findViewById(R.id.imageView3);
        ivTest4 = (ImageView)findViewById(R.id.imageView4);
        ivTest5 = (ImageView)findViewById(R.id.imageView5);
        ivTest6 = (ImageView)findViewById(R.id.imageView6);
        ivTest7 = (ImageView)findViewById(R.id.imageView7);
        Glide.with(Ex2GifActivity.this).load(R.drawable.son_skill3).into(ivTest);
        Glide.with(Ex2GifActivity.this).load(R.drawable.son_skill4).into(ivTest2);
        Glide.with(Ex2GifActivity.this).load(R.drawable.son_skill3).into(ivTest3);
        Glide.with(Ex2GifActivity.this).load(R.drawable.son_skill4).into(ivTest4);
        Glide.with(Ex2GifActivity.this).load(R.drawable.son_skill3).into(ivTest5);
        Glide.with(Ex2GifActivity.this).load(R.drawable.son_skill6).into(ivTest6);
        Glide.with(Ex2GifActivity.this).load(R.drawable.son_skill7).into(ivTest7);


    }


}