package com.cms.dw202app_all;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Ex23CalcActivity extends AppCompatActivity {

    int number  = 10000;

    EditText etResult;

    //누적되서 보여주는 스트링변수
    String number1="", number2="";
    //계산해야할 변수
    int su1, su2;
    //연산자선택시 저장
    String yon="";
    boolean first=true;//첫번째수냐 두번째수냐

    boolean btnUse=false;//버튼사용중?
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex23_layout_calc);

        etResult = (EditText) findViewById(R.id.etResult);

        findViewById(R.id.btn1).setOnClickListener(mClick);
        findViewById(R.id.btn2).setOnClickListener(mClick);
        findViewById(R.id.btn3).setOnClickListener(mClick);
        findViewById(R.id.btn4).setOnClickListener(mClick);
        findViewById(R.id.btn5).setOnClickListener(mClick);
        findViewById(R.id.btn6).setOnClickListener(mClick);
        findViewById(R.id.btn7).setOnClickListener(mClick);
        findViewById(R.id.btn8).setOnClickListener(mClick);
        findViewById(R.id.btn9).setOnClickListener(mClick);
        findViewById(R.id.btn0).setOnClickListener(mClick);
        findViewById(R.id.btnClear).setOnClickListener(mClick);
        findViewById(R.id.btnPlus).setOnClickListener(mClick);
        findViewById(R.id.btnMin).setOnClickListener(mClick);
        findViewById(R.id.btnMul).setOnClickListener(mClick);
        findViewById(R.id.btnDiv).setOnClickListener(mClick);
        findViewById(R.id.btnResult).setOnClickListener(mClick);



    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId()) {
                case R.id.btn1:btnUse=true;
                    if(first==true){ firstNumber("1");}
                    else {secondNumber("1");}
                    break;
                case R.id.btn2:btnUse=true;
                    if(first==true){ firstNumber("2");}
                    else {secondNumber("2");}
                    break;
                case R.id.btn3:btnUse=true;
                    if(first==true){ firstNumber("3");}
                    else {secondNumber("3");}
                    break;
                case R.id.btn4:btnUse=true;
                    if(first==true){ firstNumber("4");}
                    else {secondNumber("4");}
                    break;
                case R.id.btn5:btnUse=true;
                    if(first==true){ firstNumber("5");}
                    else {secondNumber("5");}
                    break;
                case R.id.btn6:btnUse=true;
                    if(first==true){ firstNumber("6");}
                    else {secondNumber("6");}
                    break;
                case R.id.btn7:btnUse=true;
                    if(first==true){ firstNumber("7");}
                    else {secondNumber("7");}
                    break;
                case R.id.btn8:btnUse=true;
                    if(first==true){ firstNumber("8");}
                    else {secondNumber("8");}
                    break;
                case R.id.btn9:btnUse=true;
                    if(first==true){ firstNumber("9");}
                    else {secondNumber("9");}
                    break;
                case R.id.btn0:btnUse=true;
                    if(first==true){ firstNumber("0");}
                    else {secondNumber("0");}
                    break;
                case R.id.btnPlus:if(btnUse==false) su1 = Integer.parseInt(etResult.getText().toString());
                    first=false;//두번째수입력으로 바뀌기위해서..
                    yon="+";
                    etResult.setText("");
                    break;
                case R.id.btnMin:if(btnUse==false) su1 = Integer.parseInt(etResult.getText().toString());
                    first=false;//두번째수입력으로 바뀌기위해서..
                    yon="-";
                    etResult.setText("");
                    break;
                case R.id.btnMul:if(btnUse==false) su1 = Integer.parseInt(etResult.getText().toString());
                    first=false;//두번째수입력으로 바뀌기위해서..
                    yon="*";
                    etResult.setText("");
                    break;
                case R.id.btnDiv:if(btnUse==false) su1 = Integer.parseInt(etResult.getText().toString());
                    first=false;//두번째수입력으로 바뀌기위해서..
                    yon="/";
                    etResult.setText("");
                    break;
                case R.id.btnResult:
                    etResult.setText("");
                    result();
                    break;
                case R.id.btnClear:
                    //초기화
                    //실제수계산하는거, 표여주는수,첫번째체크변수
                    su1=0;
                    su2=0;
                    number1="";
                    number2="";
                    first=true;
                    btnUse=false;
                    etResult.setText("");
                    break;
            }

        }
    };

    void firstNumber(String number1)
    {
        etResult.setText("");

        this.number1 += number1;
        su1 = Integer.parseInt(this.number1);
        etResult.setText(this.number1);
    }
    void secondNumber(String number2)
    {
        etResult.setText("");
        this.number2 += number2;
        su2 = Integer.parseInt(this.number2);
        etResult.setText(this.number2);
    }
    void result()
    {
        if(btnUse==false) {su2 = Integer.parseInt(etResult.getText().toString());}

        if(yon.equals("+"))
        {
            int result = su1+su2;
            etResult.setText(result+"");
        }
        else if(yon.equals("-"))
        {
            int result = su1-su2;
            etResult.setText(result+"");
        }
        else if(yon.equals("*"))
        {
            int result = su1*su2;
            etResult.setText(result+"");
        }
        else if(yon.equals("/"))
        {
            int result = su1/su2;
            etResult.setText(result+"");
        }
        //초기화
        //실제수계산하는거, 표여주는수,첫번째체크변수
        su1=0;
        su2=0;
        number1="";
        number2="";
        first=true;
    }
}
