package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UygActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        main();
    }
    public void main() {
        boolean degisken1 = true;
        boolean degisken2 = false;
        System.out.println(degisken1);
        System.out.println(degisken2);
    }
}
