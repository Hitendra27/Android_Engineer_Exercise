package com.example.android_engineer_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeActivityBTN = findViewById(R.id.create_an_account);
        changeActivityBTN
        .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }

        });
    }

    private void changeActivity() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}