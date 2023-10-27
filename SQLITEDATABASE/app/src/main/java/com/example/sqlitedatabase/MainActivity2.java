package com.example.sqlitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    btnRegister = (Button) findViewById(R.id.btnRegister);
    btnRegister.setOnClickListener(new View.OnClickListener()){
        @Override
        public void onClick(View view){
            Intent i =new Intent(MainActivity.this, Register.class);
            startActivity(i);
        }
    });
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}