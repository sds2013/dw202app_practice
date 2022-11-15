package com.cms.dw202app_all;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Ex16IntentDataSendEx extends AppCompatActivity {
    TextView textView;

    String[] items = {"사과", "오렌지", "딸기"};
    String temp = "";//스피너 선택값 저장변수
    EditText etPrice;
    String data1="사과";
    String data2="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex16_intent_send);

        textView = (TextView) findViewById(R.id.tvSel);
        etPrice = (EditText) findViewById(R.id.etPrice);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, items
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // 스피너에 어댑터 설정
        spinner.setAdapter(adapter);

        // 스피너에서 선택 했을 경우 이벤트 처리
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(items[position]);

                temp = items[position];
                Log.d("스피너테스트", "선택값 저장된 변수 temp : " + temp);
                    //문자열비교로할경우

                //인덱스 position으로 비교할경우 
                if(position == 0){
                    data1=temp;
                    data2=etPrice.getText().toString();
                }
                else if(position == 1){
                    data1=temp;
                    data2=etPrice.getText().toString();
                }
                else if(position == 2){
                    data1=temp;
                    data2=etPrice.getText().toString();
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText("선택 : ");
            }
        });


        findViewById(R.id.btn).setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btn:
                    Intent ex16 = new Intent(Ex16IntentDataSendEx.this, Ex16IntentDataReceiveEx.class);
                    ex16.putExtra("data1",data1);
                    ex16.putExtra("data2",data2);
                    startActivity(ex16);
                    break;
            }

        }
    };
}