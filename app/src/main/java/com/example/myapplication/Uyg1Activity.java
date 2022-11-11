package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1layout);

        uygulama();
    }

    public void uygulama() {
        byte bir = 127;
        short iki = 32767;
        int uc =  2147483647;
        long dort =  9223372036854775807L;
        System.out.println("Byte: " + bir);
        System.out.println("Short: " + iki);
        System.out.println("Int: " + uc);
        System.out.println("Long: " + dort);
    }
}
