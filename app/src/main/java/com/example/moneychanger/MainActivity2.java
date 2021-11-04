package com.example.moneychanger;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);

        TextView name1 = (TextView) findViewById(R.id.name1);

        name1.setText("Hai, "+text);

        Button convert = (Button)findViewById(R.id.convert);
        convert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openMainActivity3();
            }
        });
    }

    public void openMainActivity3(){
        EditText value = (EditText)findViewById(R.id.value) ;
        RadioButton rd1 = (RadioButton) findViewById(R.id.radioButton1);
        RadioButton rd2 = (RadioButton) findViewById(R.id.radioButton2);

        TextView name1 = (TextView) findViewById(R.id.name1) ;
        String textname = name1.getText().toString();
        String textIDR = value.getText().toString();
        Intent intent2 = new Intent(this, MainActivity3.class);
        if (rd1.isChecked()){
            Float valueint = Float.parseFloat(value.getText().toString()) / 3400;
            String textRes = valueint.toString();
            String text2 = textname.length()-5 + textname.substring(5, textname.length())
                    + textIDR.length() + textIDR
                    + textRes.length() + "RM "+ textRes;
            intent2.putExtra(EXTRA_TEXT,text2);
        }
        else if (rd2.isChecked()){
            Float valueint = Float.parseFloat(value.getText().toString()) / 10600;
            String textRes = valueint.toString();
            String text2 = textname.length()-5 + textname.substring(5, textname.length())
                    + textIDR.length() + textIDR
                    + textRes.length() + "SGD " + textRes;
            intent2.putExtra(EXTRA_TEXT,text2);
        }



        startActivity(intent2);
    }
}