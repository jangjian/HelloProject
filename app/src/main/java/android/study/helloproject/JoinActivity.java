package android.study.helloproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.study.helloproject.R;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class JoinActivity extends AppCompatActivity {
    Button joinBtn;
    EditText joinId, joinPw, joinName, joinMail;

    protected void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_join);

        joinBtn = findViewById(R.id.join_btn);
        joinId = findViewById(R.id.join_id);
        joinPw = findViewById(R.id.join_pw);
        joinName = findViewById(R.id.join_name);
        joinMail = findViewById(R.id.join_mail);

        joinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String join_ID = joinId.getText().toString();
                String join_PW = joinPw.getText().toString();
                String join_NAME = joinName.getText().toString();
                String join_MAIL = joinMail.getText().toString();

                Intent intent = new Intent(JoinActivity.this, JoinResultActivity.class);
                intent.putExtra("join_id", join_ID);
                intent.putExtra("join_pw", join_PW);
                intent.putExtra("join_name", join_NAME);
                intent.putExtra("join_mail", join_MAIL);

                startActivity(intent);
            }
        });



    }
}
