package com.example.nurdiansyah.stadycase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class WadahActivity extends AppCompatActivity {

        TextView NamaTempat;
        TextView Harga;
        TextView JenisMakanan;
        TextView JumlahPorsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wadah);


        NamaTempat = (TextView) findViewById(R.id.nama_tempat);
        Harga = (TextView) findViewById(R.id.jumlah_harga);
        JenisMakanan =(TextView)findViewById(R.id.jenis_makanan);
        JumlahPorsi =(TextView)findViewById(R.id.jumlah_porsi);

        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        String data = (String) bd.get("idButton");
        
        if (data.equalsIgnoreCase("But_Eatbus")) {
            NamaTempat.setText("Eatbus");
            JenisMakanan.setText("Nasi Uduk");
            JumlahPorsi.setText("2");
            Harga.setText("100000");
            Toast.makeText(getApplicationContext(), "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        } else if (data.equalsIgnoreCase("But_Abnormal")) {
            NamaTempat.setText("Abnormal");
            JenisMakanan.setText("Nasi Uduk");
            JumlahPorsi.setText("2");
            Harga.setText("60000");
            Toast.makeText(getApplicationContext(), "Disini aja makan malamnya", Toast.LENGTH_LONG).show();

        }
    }
}