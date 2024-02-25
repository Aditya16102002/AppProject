package com.example.checkboxex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    CheckBox c1, c2, c3, c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.menu);
        c1 = findViewById(R.id.dosa);
        c2 = findViewById(R.id.burger);
        c3 = findViewById(R.id.noodles);
        c4 = findViewById(R.id.veg);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String li = "";
                int amt = 0;
                if(c1.isChecked()){
                    li = li + c1.getText().toString()+"\n";
                    amt += 70;
                }
                if(c2.isChecked()) {
                    li = li + c2.getText().toString() + "\n";
                    amt += 150;
                }
                if(c3.isChecked()) {
                    li = li + c3.getText().toString() + "\n";
                    amt += 180;
                }
                if(c4.isChecked()) {
                    li = li + c4.getText().toString() + "\n";
                    amt += 250;
                }
                Toast.makeText(MainActivity.this, li, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, amt+"", Toast.LENGTH_SHORT).show();
            }
        });
    }
}