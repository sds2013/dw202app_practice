package com.cms.dw202app_all;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Ex22FragmentEx extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private Ex22AFragment fragmentA;
    private Ex22BFragment fragmentB;
    private FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ex22_fragment);

        fragmentManager = getSupportFragmentManager();

        fragmentA = new Ex22AFragment();
        fragmentB = new Ex22BFragment();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();

        findViewById(R.id.btn_fragmentA).setOnClickListener(mClick);
        findViewById(R.id.btn_fragmentB).setOnClickListener(mClick);
    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            transaction = fragmentManager.beginTransaction();

            switch(v.getId())
            {
                case R.id.btn_fragmentA:
                    transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();
                    break;
                case R.id.btn_fragmentB:
                    transaction.replace(R.id.frameLayout, fragmentB).commitAllowingStateLoss();
                    break;
            }

        }
    };


}