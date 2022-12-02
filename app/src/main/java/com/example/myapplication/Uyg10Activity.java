package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10layout);
        Button uygulamazmni = findViewById(R.id.btniste);
        EditText girisbir = findViewById(R.id.textsayi1);
        EditText girisiki = findViewById(R.id.textsayi2);
        TextView text1 = findViewById(R.id.texts1);
        TextView text2 = findViewById(R.id.texts2);
        TextView text3 = findViewById(R.id.texts3);
        TextView text4 = findViewById(R.id.texts4);
        uygulamazmni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int sayi1 = Integer.parseInt(girisbir.getText().toString());
                    int sayi2 = Integer.parseInt(girisiki.getText().toString());
                    text1.setText("x 10’dan büyük ve y 10’dan küçük mü : " + (sayi1>10 && sayi2<10));
                    text2.setText("x 10’dan büyük ve y 10’dan küçük mü tersi : " + !(sayi1>10 && sayi2<10));
                    text3.setText("x 10’dan büyük veya y 10’dan küçük mü : " + (sayi1>10 || sayi2<10));
                    text4.setText("x 10’dan büyük veya y 10’dan küçük mü tersi : " + !(sayi1>10 || sayi2<10));
                }
                catch (Exception e)
                {
                    Toast.makeText(Uyg10Activity.this, "Lütfen sayıları girdiğine emin ol.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
