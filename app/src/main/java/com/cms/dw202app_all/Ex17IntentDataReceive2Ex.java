package com.cms.dw202app_all;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Ex17IntentDataReceive2Ex extends AppCompatActivity {
    TextView tvName, tvAge, tvTel, tvAddr;

    String dataName, dataAge,dataTel,dataAddr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex17_intent_receive);

        tvName = (TextView) findViewById(R.id.tvName);
        tvAge = (TextView) findViewById(R.id.tvAge);
        tvTel = (TextView) findViewById(R.id.tvTel);
        tvAddr = (TextView) findViewById(R.id.tvAddr);

        Intent getIntent = getIntent();
        dataName= getIntent.getStringExtra("dataName");
        dataAge= getIntent.getStringExtra("dataAge");
        dataTel= getIntent.getStringExtra("dataTel");
        dataAddr= getIntent.getStringExtra("dataAddr");

        tvName.setText(dataName);
        tvAge.setText(dataAge+"세");
        tvTel.setText(dataTel);
        tvAddr.setText(dataAddr);



    }
}