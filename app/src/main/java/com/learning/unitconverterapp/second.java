package com.learning.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        EditText editText=findViewById(R.id.editText);
        Button button=findViewById(R.id.button2);
        TextView textView=findViewById(R.id.textView);
Button bt=findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String input=editText.getText().toString();
              double kilos =Double.parseDouble(input);
              double meter=convert(kilos);
              textView.setText(""+meter);
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(second.this, "back to main", Toast.LENGTH_SHORT).show();
                firstactivity();
            }
        });
    }
    public double convert(double kilos){
        return kilos*1000;
    }
    public void firstactivity(){

        Intent in=new Intent(this, MainActivity.class);
        Toast.makeText(this, "moving back to main", Toast.LENGTH_SHORT).show();
        startActivity(in);


    }
}