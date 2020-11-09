package com.example.ufolep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.domain.AdherentDto;
import com.example.domain.SessionDto;

import java.util.ArrayList;
import java.util.List;

public class Saison extends AppCompatActivity {

    private Button valider;
    private com.example.domain.SessionDto session;
    private String annee;
    private Boolean admin;
    Spinner spinner;
    private AdherentDto adherent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        session = (SessionDto) getIntent().getSerializableExtra("session");
        this.adherent = session.getAdherent();
        admin = adherent.isAdministrateur();

        setContentView(R.layout.activity_saison);
        spinner = (Spinner) findViewById(R.id.spinner);

        List<String> exempleList = new ArrayList<>();

        exempleList.add("2020-2021");
        exempleList.add("2021-2022");
        exempleList.add("2022-2023");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,android.R.layout.simple_spinner_item,exempleList
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        this.valider = findViewById(R.id.valider);

        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                annee = spinner.getSelectedItem().toString();
                if (admin == Boolean.TRUE) {
                    Intent otherActivity = new Intent(getApplicationContext(),AccueilTous.class);
                    otherActivity.putExtra("session", session);
                    otherActivity.putExtra("annee",annee);
                    startActivity(otherActivity);
                    finish();
                }
                else {
                    Intent otherActivity = new Intent(getApplicationContext(),Accueil.class);
                    otherActivity.putExtra("session", session);
                    otherActivity.putExtra("annee",annee);
                    startActivity(otherActivity);
                    finish();
                }
            }
        });
    }
}
