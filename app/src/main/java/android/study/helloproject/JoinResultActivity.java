package android.study.helloproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class JoinResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_result);

        Intent intent = getIntent();
        String joinId = intent.getStringExtra("join_id");
        String joinPw = intent.getStringExtra("join_pw");
        String joinName = intent.getStringExtra("join_name");
        String joinMail = intent.getStringExtra("join_mail");

        TextView idTextView = findViewById(R.id.id_text_view);
        TextView pwTextView = findViewById(R.id.pw_text_view);
        TextView nameTextView = findViewById(R.id.name_text_view);
        TextView mailTextView = findViewById(R.id.mail_text_view);

        idTextView.setText("ID: " + joinId);
        pwTextView.setText("PW: " + joinPw);
        nameTextView.setText("Name: " + joinName);
        mailTextView.setText("Mail: " + joinMail);
    }
}
