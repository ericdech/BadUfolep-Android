package com.example.ufolep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Calendrier extends AppCompatActivity {

    private Button retour;
    private String sexe_select;
    private String categorie_select;
    private Button validation;
    Spinner categorie;
    Spinner sexe;
    Spinner plateau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendrier);

        this.retour = (Button) findViewById(R.id.retour);

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        categorie = findViewById(R.id.catégorie);

        List<String> listcategorie = new ArrayList<>();

        listcategorie.add("Plume 1");
        listcategorie.add("Plume 2");
        listcategorie.add("Smash 1");
        listcategorie.add("Smash 2");

        sexe = findViewById(R.id.sexe);

        List<String> listsexe = new ArrayList<>();

        listsexe.add("Garçon");
        listsexe.add("Fille");

        //plateau = findViewById(R.id.plateau);

        ArrayAdapter<String> adapter_1 = new ArrayAdapter<>(
                this,android.R.layout.simple_spinner_item,listcategorie
        );
        adapter_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        categorie.setAdapter(adapter_1);

        ArrayAdapter<String> adapter_2 = new ArrayAdapter<>(
                this,android.R.layout.simple_spinner_item,listsexe
        );
        adapter_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sexe.setAdapter(adapter_2);
    this.validation = findViewById(R.id.validation);

    validation.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sexe_select = sexe.getSelectedItem().toString();
            categorie_select = categorie.getSelectedItem().toString();
            Intent otheractivity = new Intent(getApplicationContext(), Calendrier_2.class);
            startActivityForResult(otheractivity,1000);
        }
    });
    }
}
