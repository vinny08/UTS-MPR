package com.example.moneychanger;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    TextView nama, price, konversi;
    Button butDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        String text1 = intent.getStringExtra(MainActivity2.EXTRA_TEXT);

        Integer n_nama = Integer.parseInt(text1.substring(0,1));
        Integer n_price = Integer.parseInt(text1.substring(n_nama+1,n_nama+2));
        Integer n_konversi = n_nama+n_price;
        Integer n_hasil = text1.length();

        nama = (TextView) findViewById(R.id.nama);
        nama.setText(text1.substring(1,n_nama+1));

        price = (TextView) findViewById(R.id.price);
        price.setText(text1.substring(n_nama+2, n_konversi+2));

        konversi = (TextView) findViewById(R.id.konversi);
        konversi.setText(text1.substring( n_konversi+3, n_hasil));

        Button back = (Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openMainActivity1();
            }
        });

        butDialog = (Button)findViewById(R.id.tap);
        butDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    public void openDialog(){
        DialogFrag infoThank = new DialogFrag();
        infoThank.show(getSupportFragmentManager(), "Info Dialog");
    }

    public void openMainActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}