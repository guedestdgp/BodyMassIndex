package com.example.bodymassindex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText heightField = findViewById(R.id.height);
        final EditText massField = findViewById(R.id.mass);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double heightCalc = Double.valueOf(heightField.getText().toString());
                heightCalc = Double.valueOf(massField.getText().toString())/ heightCalc;
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("bmi", Double.toString(heightCalc));
                startActivity(intent);
            }
        });
    }
}