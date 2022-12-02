package com.example.myapplication;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg11Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg11layout);
        final String _TAG = "OneWayTicket";
        Log.d(_TAG,"Debug mesajı");
        EditText text = findViewById(R.id.onewayticket1);
        Button btn = findViewById(R.id.onewayticket2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(_TAG,"İnfo Mesajı Butona tıklandı.");
                Toast.makeText(Uyg11Activity.this, text.getText().toString(), Toast.LENGTH_SHORT).show();
                Log.e(_TAG,"Hata Mesajı, Ekrana bilgi yazısı 1 atıldı.");
            }
        });
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.w(_TAG,"Uyarı Mesajı EditText 'e tıklandı.");
                Toast.makeText(Uyg11Activity.this, "Edit Text 'e tıklandı.", Toast.LENGTH_SHORT).show();
                Log.v(_TAG,"Verbose Mesajı ekrana bilgi yazısı 2 atıldı.");
            }
        });
    }
}
