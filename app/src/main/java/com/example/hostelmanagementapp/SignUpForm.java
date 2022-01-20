package com.example.hostelmanagementapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpForm extends Activity {



    Button btn_reg;
    TextView t_login;
    EditText txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8;
    String fname,lname,username,e_mail,dat,contacts,passwords,confirm_pass;
    Intent intent,intent_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_form);

        btn_reg = (Button) findViewById(R.id.btn_register);
        t_login = (TextView) findViewById(R.id.text_login);
        txt1 = (EditText) findViewById(R.id.first);
        txt2 = (EditText) findViewById(R.id.last);
        txt3 = (EditText) findViewById(R.id.user);
        txt4 = (EditText) findViewById(R.id.email);
        txt5 = (EditText) findViewById(R.id.date);
        txt6 = (EditText) findViewById(R.id.contact);
        txt7 = (EditText) findViewById(R.id.password);
        txt8 = (EditText) findViewById(R.id.confirm);

        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//get user entered text and converting text into a string
                fname = txt1.getText().toString();
                lname = txt2.getText().toString();
                username = txt3.getText().toString();
                e_mail = txt4.getText().toString();
                dat = txt5.getText().toString();
                contacts = txt6.getText().toString();
                passwords = txt7.getText().toString();
                confirm_pass = txt8.getText().toString();


                //validation
                if (fname.isEmpty()) {
                    txt1.setError("Please First name required");
                }
                if (lname.isEmpty()) {
                    txt2.setError("Please Last name required");
                }
                if (username.isEmpty()) {
                    txt3.setError("Please Username required");
                }

                if (e_mail.isEmpty()) {
                    txt4.setError("Please Email required");
                }


                if (dat.isEmpty()) {
                    txt5.setError("Please DOB is required");
                }

                if (contacts.isEmpty()) {
                    txt6.setError("Please Parents Contact required");
                }

                if (passwords.isEmpty()) {
                    txt7.setError("Please Password required");
                }

                if (confirm_pass.isEmpty()) {
                    txt8.setError("Please Confirm password required");
                }

                if (passwords != confirm_pass) {
                    txt7.setError("Password Don't match");

                } else{
                    intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);

                }


            }
        });
        t_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_1 = new Intent(getApplicationContext(),SignUpForm.class);
                startActivity(intent_1);
            }
        });

    }
}




