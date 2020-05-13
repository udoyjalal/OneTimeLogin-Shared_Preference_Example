package com.example.user.sharedtest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameET, passwordEt;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameET = findViewById(R.id.etusername);
     //   passwordEt = findViewById(R.id.etpassword);
        loginBtn = findViewById(R.id.btn_login);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usernameET.getText().toString().equals("abc"))
                {
                    Intent intent = new Intent(LoginActivity.this,
                            MainActivity.class);
                    startActivity(intent);
                    finish();

                    Shared shared = new Shared(getApplicationContext());
                    shared.secondtime();
                }
            }
        });

    }

 /*
    private void saveInfo() {

        data = Boolean.valueOf(valueET.getText().toString());
        User user = new User(data);

        msg = Boolean.valueOf(shared.saveUserInfo(user));
       // Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
      //  valueET.setText("");

    } */
}
