package com.example.lazarev_v_6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class NoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice);
        ImageView backtwo = (ImageView)  findViewById(R.id.backtwo);
        backtwo.setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        Intent intent = new Intent(NoticeActivity.this, PersonalaAreaActivity.class);
        startActivity(intent);

    }
}