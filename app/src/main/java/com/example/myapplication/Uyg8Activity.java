package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg8Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8layout);
        EditText girilen = findViewById(R.id.txtGirilen);
        EditText girilen2 = findViewById(R.id.txtGirilen2);
        TextView txt1 = findViewById(R.id.textw1);
        TextView txt2 = findViewById(R.id.textw2);
        TextView txt3 = findViewById(R.id.textw3);
        TextView txt4 = findViewById(R.id.textw4);
        TextView txt5 = findViewById(R.id.textw5);
        TextView txt6 = findViewById(R.id.textw6);
        TextView txt7 = findViewById(R.id.textw7);
        Button btn = findViewById(R.id.btnUygula);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    try {
                        int sayi = Integer.parseInt(girilen.getText().toString());
                        int sayi2 = Integer.parseInt(girilen2.getText().toString());
                        int toplam = sayi + sayi2;
                        int fark = sayi - sayi2;
                        int carpma = sayi * sayi2;
                        int bolme = sayi / sayi2;
                        int modalma = sayi % sayi2;
                        int arttirma = sayi++;
                        int azaltma = sayi--;
                        txt1.setText("Toplam = " + toplam);
                        txt2.setText("Fark = " + fark);
                        txt3.setText("Çarpma = " + carpma);
                        txt4.setText("Bölme = " + bolme);
                        txt5.setText("Modu = " + modalma);
                        txt6.setText("Arttırma = " + arttirma);
                        txt7.setText("Azaltma = " + azaltma);
                    }
                    catch (Exception e)
                    {
                        Toast.makeText(Uyg8Activity.this, "Lütfen sayıları girdiğinize emin olun.", Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }
}
