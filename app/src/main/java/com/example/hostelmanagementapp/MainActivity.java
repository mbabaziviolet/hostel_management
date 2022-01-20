package com.example.hostelmanagementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_2;
    EditText username, password,registration;
    String user,pass,no;
    Intent intent, intent_2;
    TextView tv_register;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btn_2 = (Button) findViewById(R.id.btn_login);
        username = (EditText) findViewById(R.id.user1);
        password = (EditText) findViewById(R.id.password1);
        registration = (EditText) findViewById(R.id.number);
        tv_register = (TextView) findViewById(R.id.btn_log);


        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_2 = new Intent(getApplicationContext(), SignUpForm.class);
                startActivity(intent_2);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = username.getText().toString();
                pass = password.getText().toString();
                no = registration.getText().toString();

                if (user.isEmpty()) {
                    username.setError("Please enter your username");
                }
                if (pass.isEmpty()) {
                    password.setError("wrong password");
                }
                    if (no.isEmpty()) {
                        registration.setError("Please enter your registration number");

                } else {
                    intent = new Intent(getApplicationContext(), StudentDashBoard.class);
                    startActivity(intent);
                }
            }
        });

    }}




