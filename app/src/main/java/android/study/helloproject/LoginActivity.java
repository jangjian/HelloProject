package android.study.helloproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloproject.R;

public class LoginActivity extends AppCompatActivity {
    Button loginBtn;
    EditText userId, userPw;

    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = findViewById(R.id.login_btn);
        userId = findViewById(R.id.user_id);
        userPw = findViewById(R.id.user_pw);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = userId.getText().toString();
                String pw = userPw.getText().toString();

                Intent intent = new Intent(LoginActivity.this, LoginResultActivity.class);
                intent.putExtra("user_id", id);
                intent.putExtra("user_pw", pw);

                startActivity(intent);
            }
        });
    }
}

/*

androidx.annotation.Nullable: 이 어노테이션은 해당 메서드가 null 값을 받을 수 있음을 나타냅니다.

savedInstanceState는 액티비티의 이전 상태를 저장하고 복원하는 데 사용되는 데이터 묶음(Bundle)입니다.
super.onCreate(savedInstanceState)는 부모 클래스인 AppCompatActivity의 onCreate() 메서드를 호출하여 기본적인 액티비티 초기화 작업을 수행합니다.
*/