package com.example.ufolep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccueilTous extends AppCompatActivity {

    private Button calendrier;
    private Button classement;
    private Button info;
    private Button propos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil_tous);

        this.calendrier = (Button) findViewById(R.id.calendrier);

        calendrier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Accueil.class);
                startActivityForResult(otherActivity, 1000);
            }
        });

        this.classement = findViewById(R.id.classement);

        classement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Clasement.class);
                startActivityForResult(otherActivity, 1000);
            }
        });

        this.info = (Button)findViewById(R.id.info);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Adherent.class);
                startActivityForResult(otherActivity, 1000);
            }
        });

        this.propos = findViewById(R.id.propos);

        propos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Propos.class);
                startActivityForResult(otherActivity, 1000);
            }
        });
    }
}
