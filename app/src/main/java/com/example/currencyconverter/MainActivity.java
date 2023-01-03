package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button inr;
    Button pound;
    TextView textView;
    EditText editTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inr=findViewById(R.id.inr);
        pound=findViewById(R.id.pound);
        editTextNumber=findViewById(R.id.editTextNumberDecimal);
        textView=findViewById(R.id.textView);

        inr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=editTextNumber.getText().toString();
                double number= Double.parseDouble(s);
                Toast.makeText(MainActivity.this, "Amount in Rupees :"+(number*82.90), Toast.LENGTH_SHORT).show();
            }
        });

       pound.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String d=editTextNumber.getText().toString();
               double no= Double.parseDouble(d);
               Toast.makeText(MainActivity.this, "Amount in Pounds : "+(no*0.84), Toast.LENGTH_SHORT).show();

           }
       });

    }
}