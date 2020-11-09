package com.example.ufolep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.domain.AdherentDto;
import com.example.domain.ClubDto;
import com.example.domain.SessionDto;

public class Accueil extends AppCompatActivity {

    private Button inscription;
    private Button calendrier;
    private Button confirmation;
    private Button info;
    private Button propos;
    private Button classement;
    private Button score;
    private Button back;
    private com.example.domain.SessionDto session;
    private TextView nom;
    private TextView prenom;
    private TextView club;
    private AdherentDto adherent;
    private ClubDto nom_club;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        session = (SessionDto) getIntent().getSerializableExtra("session");
        setContentView(R.layout.acceuil_joueur);
        String annee = (String) getIntent().getSerializableExtra("annee");
        final TextView saison = (TextView) findViewById(R.id.saison);
        this.info = (Button)findViewById(R.id.info);
        saison.setText(annee);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Adherent.class);
                startActivityForResult(otherActivity, 1000);
            }
        });

        this.inscription = (Button) findViewById(R.id.inscription);

        inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Inscription.class);
                startActivityForResult(otherActivity, 1000);
            }
        });

        this.calendrier = (Button) findViewById(R.id.calendrier);

        calendrier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(Accueil.this , Calendrier.class);
                startActivityForResult(otherActivity, 1000);
            }
        });

        this.confirmation = (Button) findViewById(R.id.confirmation);

        confirmation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(Accueil.this, Confirmation.class);
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

        this.classement = findViewById(R.id.classement);

        classement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Clasement.class);
                startActivityForResult(otherActivity, 1000);
            }
        });

        this.score = findViewById(R.id.score);

        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Detail.class);
                startActivityForResult(otherActivity, 1000);
            }
        });

        this.back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Saison.class);
                otherActivity.putExtra("session", session);
                startActivityForResult(otherActivity, 1000);
            }
        });
    }

    @Override
    protected void onResume(){
        super.onResume();
        adherent = session.getAdherent();
        nom_club = session.getClub();
        nom = findViewById(R.id.nom);
        nom.setText(adherent.getNom());
        prenom = findViewById(R.id.prenom);
        prenom.setText(adherent.getPrenom());
        club = findViewById(R.id.club);
        club.setText(nom_club.getUcClub());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
