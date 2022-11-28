package com.example.machumbub;

import androidx.appcompat.app.AppCompatActivity;

//툴바 임포트
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.view.MenuItem;

import android.os.Bundle;

public class RealSignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_signup);

        //툴바 생성
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기버튼
        getSupportActionBar().setTitle("로그인"); //툴바 제목
    }

    //툴바 설정
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home: { //백 키 눌렀을 때 동작

                //액티비티 이동
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}