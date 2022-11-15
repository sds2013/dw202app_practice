package com.cms.dw202app_all;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Ex14SwitchEx extends AppCompatActivity {
    Switch switchView;
    TextView today;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex14_switch);


        today = findViewById(R.id.today);
        switchView = findViewById(R.id.switchView);

        switchView.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    today.setText("ON");
                } else {
                    today.setText("OFF");
                }
            }
        });
    }
}