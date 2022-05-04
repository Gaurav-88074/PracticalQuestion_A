package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button add;
    private Button sub;
    private Button div;
    private Button mul;
    private Button mod;
    private TextView output;
    private EditText num1;
    private EditText num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        mod = findViewById(R.id.mod);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        output = findViewById(R.id.output);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v1 = Integer.parseInt(num1.getText().toString());
                int v2 = Integer.parseInt(num2.getText().toString());
                output.setText(String.valueOf(v1+v2));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v1 = Integer.parseInt(num1.getText().toString());
                int v2 = Integer.parseInt(num2.getText().toString());

                output.setText(String.valueOf(v1-v2));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v1 = Integer.parseInt(num1.getText().toString());
                int v2 = Integer.parseInt(num2.getText().toString());
                output.setText(String.valueOf(v1*v2));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v1 = Integer.parseInt(num1.getText().toString());
                int v2 = Integer.parseInt(num2.getText().toString());
                if (v2==0){
                    Toast.makeText(MainActivity.this, "num2 can't be zero", Toast.LENGTH_SHORT).show();
                    output.setText("");
                    return;
                }
                output.setText(String.valueOf((float)v1/v2));
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v1 = Integer.parseInt(num1.getText().toString());
                int v2 = Integer.parseInt(num2.getText().toString());
                output.setText(String.valueOf(v1%v2));
            }
        });

    }
}