package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9layout);
        EditText txt1 = findViewById(R.id.txtgirisi1);
        EditText txt2 = findViewById(R.id.txtgirisi2);
        Button btn = findViewById(R.id.btnUygulama);
        TextView text1 = findViewById(R.id.textaga1);
        TextView text2 = findViewById(R.id.textaga2);
        TextView text3 = findViewById(R.id.textaga3);
        TextView text4 = findViewById(R.id.textaga4);
        TextView text5 = findViewById(R.id.textaga5);
        TextView text6 = findViewById(R.id.textaga6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int sayi1 = Integer.parseInt(txt1.getText().toString());
                    int sayi2 = Integer.parseInt(txt2.getText().toString());
                    text1.setText("x ile y eşit mi : " + (sayi1 == sayi2));
                    text2.setText("x ile y farklı mı : " + (sayi1 != sayi2));
                    text3.setText("x, y den büyük mü : " + (sayi1 > sayi2));
                    text4.setText("x, y den küçük mü : " + (sayi1 < sayi2));
                    text5.setText("x, y den büyük veya eşit mi : " + (sayi1 >= sayi2));
                    text6.setText("x, y den küçük veya eşit mi : " + (sayi1 <= sayi2));
                }
                catch (Exception e)
                {
                    Toast.makeText(Uyg9Activity.this, "Lütfen sayı girişini unutmayın", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
