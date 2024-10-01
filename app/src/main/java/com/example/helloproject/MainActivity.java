package com.example.helloproject;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);         // 액티비티가 생성될 때 호출되는 메서드로, 앱의 초기 설정을 담당합니다
        setContentView(R.layout.activity_main);

        Button loginButton = (Button) findViewById(R.id.loginBtn);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {    // onClick 메서드
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);   // 다른 액티비티나 앱 컨포넌트를 시작하는 데 사용
                startActivity(intent);
            }
        });

        Button joinButton = (Button) findViewById(R.id.joinBtn);
        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JoinActivity.class);
                startActivity(intent);
            }
        });
    }
}