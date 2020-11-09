package com.example.ufolep;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Lien.LienDto;
import com.example.domain.SessionDto;
import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;

import org.w3c.dom.Text;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Connection extends AppCompatActivity {

    private Button validate;
    private EditText pseudo;
    private EditText password;
    private SessionDto session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);

        final String nom = ((LienDto)this.getApplication()).getSomeVariable();

        this.validate = (Button) findViewById(R.id.validate);


        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        HttpURLConnection urlConnection = null;
                        try {

                            // Construction et appel de l'URL
                            String passwordVal = password.getText().toString();
                            String pseudoVal = pseudo.getText().toString();
                            URL url = new URL("http://" + nom +"/adherents/connect?pseudo=" + pseudoVal + "&password=" + passwordVal);
                            urlConnection = (HttpURLConnection) url.openConnection();
                            urlConnection.setRequestMethod("GET");
                            // Lecture de la reponse
                            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                            Scanner scanner = new Scanner(in);
                            GensonBuilder builder = new GensonBuilder();
                            builder.useDateAsTimestamp(false);
                            builder.useDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
                            Genson genson = builder.create();
                            String response = scanner.nextLine();
                            session = genson.deserialize(response, SessionDto.class);

                            in.close();

                            // Transmission de l'adherent a l'accueil
                            Intent otherActivity = new Intent(getApplicationContext(), Saison.class);
                            otherActivity.putExtra("session", session);
                            startActivity(otherActivity);
                            finish();
                        } catch (Exception e) {
                            Log.e("Exchage-JSON", "Cannot found http server", e);
                        } finally{
                            if (urlConnection != null);
                        }
                    }
                }).start();
            }
        });
    }

    @Override
    protected void onResume(){
        super.onResume();
        password = findViewById(R.id.password);
        pseudo = findViewById(R.id.pseudo);
    }
}
