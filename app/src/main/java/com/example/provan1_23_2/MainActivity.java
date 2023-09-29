package com.example.provan1_23_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btTela1, btTela2;

    ArrayList<AtividadeComplementar> atividadeComplementarArrayList = new ArrayList<>();

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btTela1  = findViewById(R.id.button);
        btTela2  = findViewById(R.id.button2);

        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            atividadeComplementarArrayList = (ArrayList<AtividadeComplementar>) getIntent().getSerializableExtra("array");
        }

        btTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityCadastro.class);
                intent.putExtra("array", atividadeComplementarArrayList);
                startActivity(intent);
            }
        });

        btTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityConsulta.class);
                intent.putExtra("array", atividadeComplementarArrayList);
                startActivity(intent);
            }
        });
    }
}