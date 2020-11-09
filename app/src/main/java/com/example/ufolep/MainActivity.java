package com.example.ufolep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button connect;
    //private Button subscribe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);

        this.connect = (Button) findViewById(R.id.connect);

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Connection.class);
                startActivity(otherActivity);
                finish();
            }
        });

        //this.subscribe = (Button) findViewById(R.id.subscribe);

        //subscribe.setOnClickListener(new View.OnClickListener() {
           // @Override
          // public void onClick(View v) {
                //Intent otherActivity = new Intent(getApplicationContext(), inscript.class);
                //startActivity(otherActivity);
                //finish();
           // }
        //});

    }
}
