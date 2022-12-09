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
        Button uygulama8 = findViewById(R.id.btn8);
        Button uygulama9 = findViewById(R.id.btn10);
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
        uygulama8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Uyg8Activity.class);
                startActivity(a);
            }
        });
        uygulama9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Uyg10Activity.class);
                startActivity(a);
            }
        });
        Button sa = findViewById(R.id.btn9);
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Uyg9Activity.class);
                startActivity(a);
            }
        });
        Button as = findViewById(R.id.btn11);
        as.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Uyg11Activity.class);
                startActivity(a);
            }
        });
        Button ase = findViewById(R.id.btn12);
        ase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Uyg12Activity.class);
                startActivity(a);
            }
        });
    }
}