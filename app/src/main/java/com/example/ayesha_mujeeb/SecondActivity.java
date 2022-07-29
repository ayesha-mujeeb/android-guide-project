package com.example.ayesha_mujeeb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textViewMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewMsg = findViewById(R.id.textViewMsg);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("text");
        textViewMsg.setText(msg);
    }
}