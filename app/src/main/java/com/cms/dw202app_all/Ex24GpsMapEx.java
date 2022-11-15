package com.cms.dw202app_all;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Ex24GpsMapEx extends AppCompatActivity {

    Intent intent;
    EditText etKeyword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex24_gps);

        etKeyword = (EditText)findViewById(R.id.etKeyword);
        findViewById(R.id.btnStart).setOnClickListener(mClick);



        //player = MediaPlayer.create(Ex15ServiceEx.this, R.raw.so);



    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btnStart:

                    String keyword = etKeyword.getText().toString();
                    Intent intent = new Intent (Ex24GpsMapEx.this, GoogleMapSearchActivity.class);
                    intent.putExtra("keyword",keyword);
                    startActivity(intent);
                    break;

            }

        }
    };
}