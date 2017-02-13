package com.eccolala.top.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView showWord = new TextView(this);
        showWord.setTextSize(40);
        showWord.setText(message);

        ViewGroup parent = (ViewGroup) findViewById(R.id.activity_display);
        parent.addView(showWord);
    }
}
