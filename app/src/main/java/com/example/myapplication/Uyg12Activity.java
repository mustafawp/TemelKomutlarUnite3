package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg12Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg12layout);
        Button btn = findViewById(R.id.btnUyg12);
        EditText txt = findViewById(R.id.uyg12text);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sayi = txt.getText().toString();
                int s = 0;
                try {
                    s = Integer.parseInt(sayi);
                    Log.i("Bildiri","Sayıya Çevrildi.");
                }
                catch (Exception e)
                {
                    Log.e("Bildiri","Sayıya çevrilemedi");
                    s = 0;
                }
                finally {
                    s += 2;
                    Log.i("Bildiri","Sayı = " + s);
                }
            }
        });
    }
}
