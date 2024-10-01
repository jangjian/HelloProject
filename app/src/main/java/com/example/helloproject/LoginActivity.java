package com.example.helloproject;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
/*

androidx.annotation.Nullable: 이 어노테이션은 해당 메서드가 null 값을 받을 수 있음을 나타냅니다.

savedInstanceState는 액티비티의 이전 상태를 저장하고 복원하는 데 사용되는 데이터 묶음(Bundle)입니다.
super.onCreate(savedInstanceState)는 부모 클래스인 AppCompatActivity의 onCreate() 메서드를 호출하여 기본적인 액티비티 초기화 작업을 수행합니다.
*/