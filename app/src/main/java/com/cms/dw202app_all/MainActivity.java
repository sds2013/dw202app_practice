package com.cms.dw202app_all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnEx1).setOnClickListener(mClick);
        findViewById(R.id.btnEx2).setOnClickListener(mClick);
        findViewById(R.id.btnEx3).setOnClickListener(mClick);
        findViewById(R.id.btnEx4).setOnClickListener(mClick);
        findViewById(R.id.btnEx5).setOnClickListener(mClick);
        findViewById(R.id.btnEx6).setOnClickListener(mClick);
        findViewById(R.id.btnEx7).setOnClickListener(mClick);
        findViewById(R.id.btnEx8).setOnClickListener(mClick);
        findViewById(R.id.btnEx9).setOnClickListener(mClick);
        findViewById(R.id.btnEx10).setOnClickListener(mClick);
        findViewById(R.id.btnEx11).setOnClickListener(mClick);
        findViewById(R.id.btnEx12).setOnClickListener(mClick);
        findViewById(R.id.btnEx13).setOnClickListener(mClick);
        findViewById(R.id.btnEx14).setOnClickListener(mClick);
        findViewById(R.id.btnEx15).setOnClickListener(mClick);
        findViewById(R.id.btnEx16).setOnClickListener(mClick);
        findViewById(R.id.btnEx17).setOnClickListener(mClick);
        findViewById(R.id.btnEx18).setOnClickListener(mClick);
        findViewById(R.id.btnEx19).setOnClickListener(mClick);
        findViewById(R.id.btnEx20).setOnClickListener(mClick);
        findViewById(R.id.btnEx21).setOnClickListener(mClick);
        findViewById(R.id.btnEx22).setOnClickListener(mClick);
        findViewById(R.id.btnEx23).setOnClickListener(mClick);
        findViewById(R.id.btnEx24).setOnClickListener(mClick);
        findViewById(R.id.btnEx25).setOnClickListener(mClick);

    }

    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btnEx1:
                    Intent ex1 = new Intent(MainActivity.this, Ex1AnimationActivity.class);
                    startActivity(ex1);
                    break;
                case R.id.btnEx2:
                    Intent ex2 = new Intent(MainActivity.this, Ex2GifActivity.class);
                    startActivity(ex2);
                    break;
                case R.id.btnEx3:
                    Intent ex3 = new Intent(MainActivity.this, Ex3VideoActivity.class);
                    startActivity(ex3);
                    break;
                case R.id.btnEx4:
                    Intent ex4 = new Intent(MainActivity.this, Ex4MediaActivity.class);
                    startActivity(ex4);
                    break;
                case R.id.btnEx5:
                    Intent ex5 = new Intent(MainActivity.this, Ex5WebViewActivity.class);
                    startActivity(ex5);
                    break;
                case R.id.btnEx6:
                    Intent ex6 = new Intent(MainActivity.this, Ex6TelActivity.class);
                    startActivity(ex6);
                    break;
                case R.id.btnEx7:
                    Intent ex7 = new Intent(MainActivity.this, Ex7SmsActivity.class);
                    startActivity(ex7);
                    break;
                case R.id.btnEx8:
                    Intent ex8 = new Intent(MainActivity.this, Ex8GalleryViewEx.class);
                    startActivity(ex8);
                    break;
                case R.id.btnEx9:
                    Intent ex9 = new Intent(MainActivity.this, Ex9ImageViewEx.class);
                    startActivity(ex9);
                    break;
                case R.id.btnEx10:
                    Intent ex10 = new Intent(MainActivity.this, Ex10PhoneCreate1Ex.class);
                    startActivity(ex10);
                    break;
                case R.id.btnEx11:
                    Intent ex11 = new Intent(MainActivity.this, Ex11ListViewEx.class);
                    startActivity(ex11);
                    break;
                case R.id.btnEx12:
                    Intent ex12 = new Intent(MainActivity.this, Ex12PhoneCreate2Ex.class);
                    startActivity(ex12);
                    break;
                case R.id.btnEx13:
                    Intent ex13 = new Intent(MainActivity.this, Ex13SpinnerEx.class);
                    startActivity(ex13);
                    break;
                case R.id.btnEx14:
                    Intent ex14 = new Intent(MainActivity.this, Ex14SwitchEx.class);
                    startActivity(ex14);
                    break;
                case R.id.btnEx15:
                    Intent ex15 = new Intent(MainActivity.this, Ex15SpinnerEx.class);
                    startActivity(ex15);
                    break;
                case R.id.btnEx16:
                    Intent ex16 = new Intent(MainActivity.this, Ex16IntentDataSendEx.class);
                    startActivity(ex16);
                    break;
                case R.id.btnEx17:
                    Intent ex17 = new Intent(MainActivity.this, Ex17IntentDataSend2Ex.class);
                    startActivity(ex17);
                    break;
                case R.id.btnEx18:
                    Intent ex18 = new Intent(MainActivity.this, Ex18SharedPreferencesEx.class);
                    startActivity(ex18);
                    break;
                case R.id.btnEx19:
                    Intent ex19 = new Intent(MainActivity.this, Ex19SharedPreferences2Ex.class);
                    startActivity(ex19);
                    break;
                case R.id.btnEx20:
                    Intent ex20 = new Intent(MainActivity.this, Ex20Viewpager2Ex.class);
                    startActivity(ex20);
                    break;
                case R.id.btnEx21:
                    Intent ex21 = new Intent(MainActivity.this, Ex21HadlerEx.class);
                    startActivity(ex21);
                    break;
                case R.id.btnEx22:
                    Intent ex22 = new Intent(MainActivity.this, Ex22FragmentEx.class);
                    startActivity(ex22);
                    break;
                case R.id.btnEx23:
                    Intent ex23 = new Intent(MainActivity.this, Ex23CalcActivity.class);
                    startActivity(ex23);
                    break;
                case R.id.btnEx24:
                    Intent ex24 = new Intent(MainActivity.this, Ex24GpsMapEx.class);
                    startActivity(ex24);
                    break;
                case R.id.btnEx25:
                    Intent ex25 = new Intent(MainActivity.this, Ex25SQLiteExLogin.class);
                    startActivity(ex25);
                    break;
            }

        }
    };
}