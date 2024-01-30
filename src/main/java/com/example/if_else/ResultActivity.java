package com.example.if_else;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView text, pangalan, pres, vicepres;
    String name, president, vicepresident;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        pangalan = findViewById(R.id.name);
        pres = findViewById(R.id.president);
        vicepres = findViewById(R.id.vicepresident);

        text = findViewById(R.id.text);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        president = i.getStringExtra("president");
        vicepresident = i.getStringExtra("vicepresident");

        text.setText("HELLO, " + name);
        pres.setText("PRESIDENT: " + president);
        vicepres.setText("VICE PRESIDENT: " + vicepresident);
    }
}
