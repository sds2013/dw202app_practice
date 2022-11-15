package com.cms.dw202app_all;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Ex16IntentDataReceiveEx extends AppCompatActivity {
    TextView tvName, tvPrice;

    String data1, data2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex16_intent_receive);

        tvName = (TextView) findViewById(R.id.tvName);
        tvPrice = (TextView) findViewById(R.id.tvPrice);
        Intent getIntent = getIntent();
        data1= getIntent.getStringExtra("data1");
        data2= getIntent.getStringExtra("data2");

        tvName.setText(data1);
        tvPrice.setText(data2+"원");



    }
}