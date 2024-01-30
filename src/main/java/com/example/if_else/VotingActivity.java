package com.example.if_else;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VotingActivity extends AppCompatActivity {

    TextView text, pangalan;
    String name;

    EditText president, vicepresident;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);
        pangalan = findViewById(R.id.name);
        president = findViewById(R.id.president);
        vicepresident = findViewById(R.id.vicepresident);

        text = findViewById(R.id.text);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        text.setText("HELLO, " + name);
    }

    public void Voting(View view) {

        if (president.getText().toString().isEmpty() || vicepresident.getText().toString().isEmpty()){
            Toast.makeText(this, "Please fill up the missing field", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("president", president.getText().toString());
            intent.putExtra("vicepresident", vicepresident.getText().toString());
            startActivity(intent);
            finish();
            }
        }

    }

