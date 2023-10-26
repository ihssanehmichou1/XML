package com.example.appform;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private EditText nom1;
    private EditText prenom1;
    private EditText age1;
    private Button result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom1=findViewById(R.id.editTextTextnom);
        prenom1=findViewById(R.id.editTextTextprenom);
        age1=findViewById(R.id.editTextNumberage);
        result=findViewById(R.id.button);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String msg =nom1.getText().toString();
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                HashMap<String,String>data=new HashMap<>();
                data.put("Nom",nom1.getText().toString());
                data.put("Prenom",prenom1.getText().toString());
                data.put("Age",age1.getText().toString());
                intent.putExtra("Data",data);
                startActivity(intent);
                finish();
            }
        });
    }
}