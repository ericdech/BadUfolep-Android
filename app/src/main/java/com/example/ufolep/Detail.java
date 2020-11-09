package com.example.ufolep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Detail extends AppCompatActivity {

    private Button back;
    private Button un_un;
    private Button un_deux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        this.back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        this.un_un = findViewById(R.id.un_un);

        un_un.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Match_double.class);
                startActivityForResult(otherActivity,1000);
            }
        });

        this.un_deux = findViewById(R.id.un_deux);

        un_deux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Match_simple.class);
                startActivityForResult(otherActivity, 1000);
            }
        });
    }
}
