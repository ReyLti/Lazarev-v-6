package com.example.lazarev_v_6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PersonalaAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);
        Button brows = (Button) findViewById(R.id.buttonIn);
        brows.setOnClickListener(this::onClick);
        ImageView back = (ImageView) findViewById(R.id.imageView4);
        back.setOnClickListener(this::onClick);
        ImageView notik = (ImageView) findViewById(R.id.imageView3);
        notik.setOnClickListener(this::onClick);

    }

    private void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonIn:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://gb.ru")));
                break;
            case R.id.imageView4:
                Intent intent = new Intent(PersonalaAreaActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.imageView3:
                Intent intent2 = new Intent(PersonalaAreaActivity.this, NoticeActivity.class);
                startActivity(intent2);

        }
    }
}