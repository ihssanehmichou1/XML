package com.example.appform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;
import java.util.HashMap;

public class MainActivity2 extends AppCompatActivity {
    private TextView nomN;
    private TextView prenomP;
    private TextView ageA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nomN = (TextView) findViewById(R.id.textViewN);
        prenomP = (TextView) findViewById(R.id.textViewP);
        ageA = (TextView) findViewById(R.id.textViewA);
        Intent intent = getIntent();
        Serializable s = getIntent().getSerializableExtra("Data");
        if (s != null) {
            HashMap data = (HashMap) s;
            nomN.setText("Nom:" + data.get(nomN));
            prenomP.setText("Prenom:" + data.get(prenomP));
            ageA.setText("Age" + data.get(ageA));
        } else {
        }
        }
    }