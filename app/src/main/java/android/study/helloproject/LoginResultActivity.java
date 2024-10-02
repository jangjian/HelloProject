package android.study.helloproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloproject.R;

public class LoginResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_result);

        // 전달된 데이터 받기
        Intent intent = getIntent();
        String userId = intent.getStringExtra("user_id");
        String userPw = intent.getStringExtra("user_pw");

        // 화면에 띄울 TextView
        TextView idTextView = findViewById(R.id.id_text_view);
        TextView pwTextView = findViewById(R.id.pw_text_view);

        // TextView에 ID와 PW 값을 설정
        idTextView.setText("ID: " + userId);
        pwTextView.setText("PW: " + userPw);
    }
}
