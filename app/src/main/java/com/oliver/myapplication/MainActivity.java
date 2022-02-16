package com.oliver.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_phoneemail,edt_password;
    TextView txt_forgotpass;
    Button btn_login, btn_signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_phoneemail = findViewById(R.id.edt_login_emailphone);
        edt_password = findViewById(R.id.edt_login_password);
        txt_forgotpass = findViewById(R.id.txt_forgot_password);
        btn_login = findViewById(R.id.btn_login);
        btn_signup = findViewById(R.id.btn_login_signup);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(i);
            }
        });
    }
}