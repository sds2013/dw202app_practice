package com.cms.dw202app_all;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Ex15SpinnerEx extends AppCompatActivity {
    TextView textView;

    String[] items = {"사과", "오렌지", "딸기"};

    String temp = "";//스피너 선택값 저장변수

    ImageView ivImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex15_spinner);

        textView = (TextView) findViewById(R.id.tvSel);
        ivImg = (ImageView) findViewById(R.id.ivImg);
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
//                if(items[position].equals("사과"))
//                {
//                    ivImg.setImageResource(R.drawable.apple);
//                }
//                else if(items[position].equals("오렌지"))
//                {
//                    ivImg.setImageResource(R.drawable.orange);
//                }else if(items[position].equals("딸기"))
//                {
//                    ivImg.setImageResource(R.drawable.berry);
//                }
                //인덱스 position으로 비교할경우 
                if(position == 0){ivImg.setImageResource(R.drawable.apple);  }
                else if(position == 1){ivImg.setImageResource(R.drawable.orange);  }
                else if(position == 2){ivImg.setImageResource(R.drawable.berry);  }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText("선택 : ");
            }
        });

    }
}