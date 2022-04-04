package com.example.android_engineer_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText enter_email, enter_password, repeat_password;
    Button btn_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        enter_email = findViewById(R.id.enter_email);
        enter_password = findViewById(R.id.enter_password);
        repeat_password = findViewById(R.id.repeatpassword);
        btn_search = findViewById(R.id.btn_search);

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Validate the inputs.

                if(TextUtils.isEmpty(enter_email.getText().toString()) || TextUtils.isEmpty(enter_password.getText().toString()))
                    Toast.makeText(MainActivity2.this, "Invalid Inputs", Toast.LENGTH_SHORT).show();


            }
        });





    }
}