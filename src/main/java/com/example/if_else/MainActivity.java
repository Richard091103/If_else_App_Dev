package com.example.if_else;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int int_age;
    EditText et_age, pangalan;

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pangalan =findViewById(R.id.name);
        et_age = findViewById(R.id.age);
    }

    public void submit(View view){

        if (et_age.getText().toString().isEmpty() || pangalan.getText().toString().isEmpty()){
            Toast.makeText(this, "Please fill up the missing field", Toast.LENGTH_SHORT).show();
        }
        else {
            int_age = Integer.parseInt(et_age.getText().toString());
            if (int_age <= 17){
                Toast.makeText(this, "You cannot vote.", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "You can vote.", Toast.LENGTH_SHORT).show();
                name = pangalan.getText().toString();
                Intent i = new Intent(this, VotingActivity.class);
                i.putExtra("name", name);
                startActivity(i);
                finish();
            }
        }

    }
}