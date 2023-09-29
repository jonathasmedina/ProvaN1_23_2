package com.example.provan1_23_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivityConsulta extends AppCompatActivity {

    ListView listView;
    Button bt;

    ArrayAdapter arrayAdapter;

    ArrayList<AtividadeComplementar> atividadeComplementarArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_consulta);

        bt  = findViewById(R.id.buttonRetorna);
        listView  = findViewById(R.id.listViewConsulta);

        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            atividadeComplementarArrayList = (ArrayList<AtividadeComplementar>) getIntent().getSerializableExtra("array");
        }

            arrayAdapter = new ArrayAdapter<AtividadeComplementar>(
                    getApplicationContext(),
                    android.R.layout.simple_list_item_1,
                    atividadeComplementarArrayList
            );
            listView.setAdapter(arrayAdapter);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityConsulta.this, MainActivity.class);
                intent.putExtra("array", atividadeComplementarArrayList);
                startActivity(intent);
            }
        });

    }
}