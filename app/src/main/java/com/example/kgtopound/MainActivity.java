package com.example.kgtopound;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;
    private TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editTextNumber);
        textView4=findViewById(R.id.textView4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                int k = Integer.parseInt(s);
                double pound = 2.205 * k;
                textView4.setText("The Corresponding value in pound is " + pound);
            }
  });
}}