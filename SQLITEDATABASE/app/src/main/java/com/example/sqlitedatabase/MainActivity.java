package com.example.sqlitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText txt_email, txt_password;
    Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHelper(this);

        txt_email =(EditText)   findViewById(R.id.txt_email);
        txt_password = (EditText) findViewById(R.id.txt_password);

        btnLogin = (Button) findViewById(R.id.btnRegister);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = txt_email.getText().toString();
                String Password = txt_password.getText().toString();

                if (Email.equals("") || Password.equals("")) {
                    Toast.makeText(getApplicationContext(), "Fields are" +
                            " empty", Toast.LENGTH_SHORT).show();
                } else {
                    Boolean checkEmail = db.checkEmail(Email);
                    if (checkEmail == true) {
                        Toast.makeText(getApplicationContext(), "Email is correct", Toast.LENGTH_SHORT).show();
                        Boolean insert = db.insert(Email, Password);
                        if (checkPassword == true) {
                            Toast.makeText(getApplicationContext(), "Login Successful!", Toast.LENGTH_SHORT).show();

                        } else {
                            Toast.makeText(getApplicationContext()"Incorrect Password", Toast.LENGTH_SHORT).show();
                        }
                    else{
                            Toast.makeText(getApplicationContext(), "Email already" + " Exists", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "No account", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
                        //btnLogin = {Button} findViewById(R.id.btnLogin);
    }
}