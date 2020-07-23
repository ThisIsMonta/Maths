package com.testcompany.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstValue = findViewById(R.id.first_number);
        final EditText secondValue = findViewById(R.id.second_number);
        final EditText res = findViewById(R.id.resultID);

        final EditText thirdValue = findViewById(R.id.first_number2);
        final EditText fourthValue = findViewById(R.id.second_number2);
        final EditText res2 = findViewById(R.id.resultID2);

        Button btnAdd = findViewById(R.id.buttonC);
        Button btnSub = findViewById(R.id.buttonC2);

        btnAdd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String v1 = firstValue.getText().toString();
                String v2 = secondValue.getText().toString();
                Integer result = Integer.parseInt(v1)+Integer.parseInt(v2);
                res.setText(result.toString());
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String v1 = thirdValue.getText().toString();
                String v2 = fourthValue.getText().toString();
                Integer result = Integer.parseInt(v1)-Integer.parseInt(v2);
                res2.setText(result.toString());
            }
        });
    }
}