package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SampleActivity extends AppCompatActivity {
    EditText etNum1;
    EditText etNum2;
    String num1;
    String num2;
    int n1,n2;
    TextView lblSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        etNum1 = findViewById(R.id.editText);
        etNum2 = findViewById(R.id.editText2);
        lblSum = findViewById(R.id.lbl);

        Intent intent = getIntent();

        num1 = intent.getStringExtra("n1");
        num2 = intent.getStringExtra("n2");

        etNum1.setText(num1);
        etNum2.setText(num2);

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);

    }

    public void add(View view){
        lblSum.setText(num1 + "+" + num2 + "=" + (n1+n2));
    }

    public void sub(View view){
        lblSum.setText(num1 + "-" + num2 + "=" + (n1-n2));
    }

    public void mul(View view){
        lblSum.setText(num1 + "*" + num2 + "=" + (n1*n2));
    }

    public void div(View view){
        lblSum.setText(num1 + "/" + num2 + "=" + (n1/n2));
    }
}
