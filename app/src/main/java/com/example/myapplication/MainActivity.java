package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button temelkomutlaragit = findViewById(R.id.btn1);
        Button uygulama2 = findViewById(R.id.btn2);
        Button uygulama3 = findViewById(R.id.btn3);
        Button uygulama4 = findViewById(R.id.btn4);
        temelkomutlaragit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sa = new Intent(MainActivity.this,Uyg1Activity.class);
                startActivity(sa);
            }
        });
        uygulama2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent as = new Intent(MainActivity.this,Uyg2Activity.class);
                startActivity(as);
            }
        });
        uygulama3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Uyg3Activity.class);
                startActivity(a);
            }
        });
        uygulama4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Uyg4Activity.class);
                startActivity(a);
            }
        });
    }
}