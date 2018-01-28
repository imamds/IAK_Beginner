 package com.example.administrator.iak_beginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 public class LoginActivity extends AppCompatActivity {

    private EditText id_username;
    private EditText id_password;
    private Button btn_cancel;
    private Button btn_login;

    private static final String USERNAME = "imam";
    private static final String PASSWORD = "imam";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        id_username = findViewById(R.id.id_username);
        id_password = findViewById(R.id.id_password);
        btn_cancel = findViewById(R.id.btn_cancel);
        btn_login = findViewById(R.id.btn_login);

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "ga boleh keluar", Toast.LENGTH_SHORT).show();
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = id_username.getText().toString();
                String password = id_password.getText().toString();

                if (TextUtils.isEmpty(username)){
                    id_username.setError("jangan kosong bro");
                }

                if (TextUtils.isEmpty(password)){
                    id_password.setError("kok kosong?");
                }

                if (username.equals(USERNAME) && password.equals(PASSWORD)){
                    Intent intent = new Intent (LoginActivity.this, MainActivity.class);
                    intent.putExtra(MainActivity.USERNAME.username);

                    finish();
                    startActivity(intent);
                }
                else {
                    Toast.makeText(LoginActivity.this, "salah oi", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
