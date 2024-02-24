package com.example.my_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int myCountvalue = 0;

    Button add_btn, minus_btn;
    TextView reset_countr, count_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add_btn = findViewById(R.id.add_btn);
        minus_btn = findViewById(R.id.minus_btn);
        reset_countr = findViewById(R.id.reset_countr);
        count_number = findViewById(R.id.countnumber);

        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCountvalue = myCountvalue - 1;
                count_number.setText(String.valueOf(myCountvalue));
            }
        });
        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCountvalue = myCountvalue + 1;
                count_number.setText(String.valueOf(myCountvalue));
            }
        });
        reset_countr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCountvalue = 0;
                count_number.setText(String.valueOf(myCountvalue));
            }
        });
    }
}
