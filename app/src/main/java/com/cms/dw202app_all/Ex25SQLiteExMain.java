package com.cms.dw202app_all;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Ex25SQLiteExMain extends AppCompatActivity {

    LinearLayout frame1, frame2, frame3;

    //회원목록
    TextView tvMemberList;
    //회원수정
    Button btnEditFind, btnEdit;
    EditText etId,  etPw, etName, etHp,etAddr;
    //회원삭제
    Button btnDelFind, btnDel;
    EditText etDelId;
    TextView tvDelList;


    //SQLITE 데이타베이스 관련변수
    SQLiteDatabase db;
    MySQLiteOpenHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ex25_sqlite_main);

        //데이베이스 생성.
        helper = new MySQLiteOpenHelper(
                Ex25SQLiteExMain.this, // 현재 화면의 context
                "member2.db", // 파일명
                null, // 커서 팩토리
                1); // 버전 번호

        //회원목록
        tvMemberList = (TextView)findViewById(R.id.tvMemberList);
        //회원수정
        btnEditFind = (Button)findViewById(R.id.btnEditFind);
        btnEdit = (Button)findViewById(R.id.btnEdit);
        etId = (EditText)findViewById(R.id.etId);
        etPw = (EditText)findViewById(R.id.etPw);
        etName = (EditText)findViewById(R.id.etName);
        etHp = (EditText)findViewById(R.id.etHp);
        etAddr = (EditText)findViewById(R.id.etAddr);
        //회원삭제
        btnDelFind = (Button)findViewById(R.id.btnDelFind);
        btnDel = (Button)findViewById(R.id.btnDel);
        etDelId = (EditText)findViewById(R.id.etDelId);
        tvDelList = (TextView)findViewById(R.id.tvDelList);


        frame1 = (LinearLayout) findViewById(R.id.frame1);
        frame2 = (LinearLayout) findViewById(R.id.frame2);
        frame3 = (LinearLayout) findViewById(R.id.frame3);

        findViewById(R.id.btnAct1).setOnClickListener(mClick);
        findViewById(R.id.btnAct2).setOnClickListener(mClick);
        findViewById(R.id.btnAct3).setOnClickListener(mClick);
        findViewById(R.id.btnEdit).setOnClickListener(mClick);
        findViewById(R.id.btnEditFind).setOnClickListener(mClick);
        findViewById(R.id.btnDel).setOnClickListener(mClick);
        findViewById(R.id.btnDelFind).setOnClickListener(mClick);


        //첫화면이라서 회원목록 전체 리스트 보이도록..호출
        selectAll();

    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {

            frame1.setVisibility(View.INVISIBLE);
            frame2.setVisibility(View.INVISIBLE);
            frame3.setVisibility(View.INVISIBLE);
            switch(v.getId())
            {
                case R.id.btnAct1:
                    frame1.setVisibility(View.VISIBLE);
                    selectAll();//테이블 전체조회
                    break;
                case R.id.btnAct2:
                    frame2.setVisibility(View.VISIBLE);
                    break;
                case R.id.btnAct3:
                    frame3.setVisibility(View.VISIBLE);
                    break;

                case R.id.btnEdit:
                    frame2.setVisibility(View.VISIBLE);
                    if(etId.getText().toString().equals(""))  {
                        Toast.makeText(getApplicationContext(), "수정할 아이디를 입력해주세요!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    String editId = etId.getText().toString();

                    if(etPw.getText().toString().equals(""))  {
                        Toast.makeText(getApplicationContext(), "수정할 비밀번호를 입력해주세요!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    String pw = etPw.getText().toString();

                    if(etName.getText().toString().equals(""))  {
                        Toast.makeText(getApplicationContext(), "수정할 이름을 입력해주세요!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    String name = etName.getText().toString();

                    if(etHp.getText().toString().equals(""))  {
                        Toast.makeText(getApplicationContext(), "수정할 연락처를 입력해주세요!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    String hp = etHp.getText().toString();

                    if(etAddr.getText().toString().equals(""))  {
                        Toast.makeText(getApplicationContext(), "수정할 주소를 입력해주세요!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    String addr = etAddr.getText().toString();

                    update(editId,pw,name,hp,addr);
                    break;
                case R.id.btnEditFind:
                    frame2.setVisibility(View.VISIBLE);

                    if(etId.getText().toString().equals(""))
                    {
                        Toast.makeText(getApplicationContext(), "수정할 아이디를 입력해주세요!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    String findId = etId.getText().toString();
                    selectEdit(findId);


                    break;
                case R.id.btnDelFind:
                    frame3.setVisibility(View.VISIBLE);
                    if(etDelId.getText().toString().equals(""))
                    {
                        Toast.makeText(getApplicationContext(), "수정할 아이디를 입력해주세요!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    String delFindId = etDelId.getText().toString();
                    selectDel(delFindId);
                    break;
                case R.id.btnDel:
                    frame3.setVisibility(View.VISIBLE);

                    if(etDelId.getText().toString().equals(""))
                    {
                        Toast.makeText(getApplicationContext(), "수정할 아이디를 입력해주세요!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    String delId = etDelId.getText().toString();
                    delete(delId);
                    break;
            }

        }
    };

    ////////
    //SQlite 메서드 처리 구간


    // delete
    public void delete(String delId) {
        db = helper.getWritableDatabase();
        db.delete("member", "id='"+delId+"'", null);
        Log.i("db", delId + "가 정상적으로 삭제 되었습니다.");
        Toast.makeText(getApplicationContext(), delId+"의 정보가 삭제되었습니다.", Toast.LENGTH_SHORT).show();
        db.close();

        //삭제후처리
        etDelId.setText("");
        tvDelList.setText("[ 대상이 삭제되었습니다. ]");

    }
    // 삭제 아이디 찾기
    public void selectDel(String delId) {

        // 1) db의 데이터를 읽어와서, 2) 결과 저장, 3)해당 데이터를 꺼내 사용
        db = helper.getReadableDatabase(); // db객체를 얻어온다. 읽기 전용
        Cursor c = db.rawQuery("SELECT * FROM member where id='"+delId+"'", null);

        String Result = "";
        boolean check=false;
        while (c.moveToNext()) {
            int idx = c.getInt(0);
            String id = c.getString(1);
            String pw = c.getString(2);
            String name = c.getString(3);
            String hp = c.getString(4);
            String addr = c.getString(5);
            Result="[ 대상을찾았습니다. ]\n";
            Result+= "아이디  :  "+id+"\n"+"이름  :  "+name+"\n"+"연락처  :  "+hp+"\n"+"주소  :  "+addr;
            check=true;
        }
        if(check==false)
        {
            tvDelList.setText("[ 찾는대상이없습니다. ]");
        }else {
            tvDelList.setText(Result);
        }
        c.close();
        db.close();
    }

    // update
    public void update(String editId,String pw,String name, String hp, String addr) {
        db = helper.getWritableDatabase(); //db 객체를 얻어온다. 쓰기가능

        ContentValues values = new ContentValues();
        values.put("pw", pw);
        values.put("name", name);
        values.put("hp", hp);
        values.put("addr", addr);
        db.update("member", values, "id='"+editId+"'", null);

        db.close();
        Toast.makeText(getApplicationContext(), editId+"의 정보가 수정되었습니다.", Toast.LENGTH_SHORT).show();
        //수정완료후 초기화
        etId.setText("");
        etPw.setText("");
        etName.setText("");
        etHp.setText("");
        etAddr.setText("");
    }

    // 수정 아이디 찾기
    public void selectEdit(String editId) {

        // 1) db의 데이터를 읽어와서, 2) 결과 저장, 3)해당 데이터를 꺼내 사용
        db = helper.getReadableDatabase(); // db객체를 얻어온다. 읽기 전용
        Cursor c = db.rawQuery("SELECT * FROM member where id='"+editId+"'", null);

        String Result = "";
        boolean check=false;
        while (c.moveToNext()) {
            int idx = c.getInt(0);
            String id = c.getString(1);
            String pw = c.getString(2);
            String name = c.getString(3);
            String hp = c.getString(4);
            String addr = c.getString(5);

            etPw.setText(pw);
            etName.setText(name);
            etHp.setText(hp);
            etAddr.setText(addr);
            check=true;
        }
        if(check==false)
        {
            etPw.setText("");
            etName.setText("");
            etHp.setText("");
            etAddr.setText("");
            Toast.makeText(getApplicationContext(), "찾는 대상이없습니다!", Toast.LENGTH_SHORT).show();
        }
        c.close();
        db.close();
    }
    // 회원목록전체조회
    public void selectAll() {

        // 1) db의 데이터를 읽어와서, 2) 결과 저장, 3)해당 데이터를 꺼내 사용
        db = helper.getReadableDatabase(); // db객체를 얻어온다. 읽기 전용
        Cursor c = db.rawQuery("SELECT * FROM member", null);

        String Result = "";
        while (c.moveToNext()) {
            int idx = c.getInt(0);
            String id = c.getString(1);
            String pw = c.getString(2);
            String name = c.getString(3);
            String hp = c.getString(4);
            String addr = c.getString(5);



            Result += "   "+id+" | "+name+" | "+hp+" | "+addr+"\n";
        }
        tvMemberList.setText(Result);
        c.close();
        db.close();
    }


}