package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bb;
    Toast toast;
    EditText etNum1;
    EditText etNum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = findViewById(R.id.editText);
        etNum2 = findViewById(R.id.editText2);
        bb = findViewById(R.id.btn1);

    }

    @Override
    public void onResume() {

        super.onResume();
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast
                Context context = getApplicationContext();
                CharSequence text = "Navigating Activity";
                int duration = Toast.LENGTH_SHORT;

                toast = Toast.makeText(context , text, duration);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.show();

                //Intent
                Intent intent = new Intent(MainActivity.this,SampleActivity.class);
                intent.putExtra("n1",etNum1.getText().toString());
                intent.putExtra("n2",etNum2.getText().toString());
                startActivity(intent);
            }
        });
    }
}
