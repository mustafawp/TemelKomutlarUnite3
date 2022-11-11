package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        float fl = 1f/3f;
        double db = 1d/3d;
        System.out.println("Float: " + fl );
        System.out.println("Double: " + db );
    }
}
