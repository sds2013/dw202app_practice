package com.cms.dw202app_all;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Ex6TelActivity extends AppCompatActivity {

    EditText edit_tel;
    Button btn_tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex6_call);
        btn_tel = findViewById(R.id.btn_tel);
        edit_tel = findViewById(R.id.edit_tel);

        findViewById(R.id.btn_tel).setOnClickListener(mClick);
        //전화번호 표시로 변경해주기
        edit_tel.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
    }

    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btn_tel:
                    String tel_number = "tel:"+edit_tel.getText().toString();

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number));
                    startActivity(intent);
                    break;


            }

        }
    };
}