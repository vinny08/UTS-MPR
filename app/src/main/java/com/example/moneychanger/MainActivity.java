package com.example.moneychanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button input = (Button)findViewById(R.id.input);
        input.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openMainActivity2();
            }
        });
    }

    public void openMainActivity2(){
        EditText name = (EditText) findViewById(R.id.name) ;
        String text = name.getText().toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(EXTRA_TEXT,text);
        startActivity(intent);
    }
}