package android.study.helloproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloproject.R;

public class MainActivity extends AppCompatActivity {
    private Button loginButton;
    private Button joinButton;
    private int counter = 0;
    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);         // 액티비티가 생성될 때 호출되는 메서드로, 앱의 초기 설정을 담당합니다
        setContentView(R.layout.activity_main);     // 사용자 인터페이스 레이아웃을 설정합니다.

        loginButton = (Button) findViewById(R.id.loginBtn);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {    // onClick 메서드
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);   // 다른 액티비티나 앱 컨포넌트를 시작하는 데 사용
                startActivity(intent);
            }
        });

        joinButton = (Button) findViewById(R.id.joinBtn);
        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JoinActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        // 네트워크 통신을 통해 데이터를 받아오는 작업이나, 서비스 또는 리스너 등록 등의 작업을 한다.
        //
    }

    @Override
    protected void onResume() {
        super.onResume();
        counter ++;
        Log.d(TAG, "onResume(): " + counter);
        // 액티비티가 사용자와 상호작용하기 바로 전에 호출된다.
        // 다른 액티비티로 이동하면 생명주기 메서드인 onPause()가 호출된다.
        // 다른 액티비티에서 다시 MainActivity로 돌아오면 onResume()이 호출되면서 counter값이 증가한다.
    }

    @Override
    protected void onPause() {
        super.onPause();
        // 화면에서 액티비티가 일부분 가려질 때 호출(팝업 알람)
        // 다른 액티비티로 완전 전환할 경우 호출됨
    }

    @Override
    protected void onStop() {
        super.onStop();
        // 액티비티가 더 이상 사용자에게 보이지 않을 때 호출
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Activity가 완전히 종료되기 직전에 호출되는 메서드
        // 리소스를 정리하거나, 메모리 누수를 방지하기 위해 사용됨.
        // 데이터베이스 연결, 스레드, 리스너 등을 해제할 수 있다.
    }
}