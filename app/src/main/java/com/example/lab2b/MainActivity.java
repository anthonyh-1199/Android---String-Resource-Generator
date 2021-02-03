package com.example.lab2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickInputButtonHelp(View v) {
        String[] sentences = getResources().getStringArray(R.array.sentences);
        int idx = new Random().nextInt(sentences.length);
        String s = (sentences[idx]);

        TextView t = (TextView) findViewById(R.id.textOutput);
        t.setText(s);
    }
}