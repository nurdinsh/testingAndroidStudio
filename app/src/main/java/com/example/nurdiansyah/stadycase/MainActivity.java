package com.example.nurdiansyah.stadycase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    private EditText Mmenu;
    private EditText Mporsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mmenu = (EditText) findViewById(R.id.menu_id);
        Mporsi = (EditText) findViewById(R.id.porsi_id);

    }

    public void EATBUS(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Mmenu = (EditText) findViewById(R.id.menu_id);
        Mporsi = (EditText) findViewById(R.id.porsi_id);

        String call = String.valueOf(Mporsi.getText());

        if (Mmenu.getText().toString().equalsIgnoreCase("Nasi Uduk") && call.equalsIgnoreCase("2")) {
            Intent intent = new Intent(MainActivity.this, WadahActivity.class);
            String id="But_Eatbus";
            intent.putExtra("idButton", id);
            startActivity(intent);
        }else{
            Toast toast = Toast.makeText(this, "tidak ditemukan, mungkin toko sebelah", Toast.LENGTH_LONG);
            toast.show();
        }

    }



    public void ABNORMAL(View view) {
        Log.d(LOG_TAG, "Button Clicked!");

        Mmenu = (EditText) findViewById(R.id.menu_id);
        Mporsi = (EditText) findViewById(R.id.porsi_id);

        String call = String.valueOf(Mporsi.getText());

        if (Mmenu.getText().toString().equalsIgnoreCase("Nasi Uduk") && call.equalsIgnoreCase("2")) {

            Intent intent = new Intent(MainActivity.this, WadahActivity.class);
            String id ="But_Abnormal";
            intent.putExtra("idButton", id);
            startActivity(intent);
        } else {
            Toast toast = Toast.makeText(this, "tidak ditemukan, mungkin toko sebelah", Toast.LENGTH_LONG);
            toast.show();
        }

    }
}
