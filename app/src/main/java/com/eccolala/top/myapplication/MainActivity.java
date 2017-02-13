package com.eccolala.top.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String TAG = MainActivity.class.getSimpleName();
    public final static String EXTRA_MESSAGE = "com.eccolala.top.myapplication";
    private EditText editText;
    private Button send;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.submit_area);
        send = (Button) findViewById(R.id.submit);
    }


    public void sendMessage(View view) {

        Intent intent = new Intent(this, Main2Activity.class);
        String message = editText.getText().toString().trim();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}
