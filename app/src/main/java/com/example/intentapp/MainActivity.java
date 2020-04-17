package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button next;
    EditText userInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    next = findViewById(R.id.btnNavigate);
    userInput = findViewById(R.id.edtText);

    next.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        String data = userInput.getText().toString();

        Intent i = new Intent(MainActivity.this,SecondActivity.class);
        i.putExtra("input",data);

        startActivity(i);
        }
    });
    }
}
