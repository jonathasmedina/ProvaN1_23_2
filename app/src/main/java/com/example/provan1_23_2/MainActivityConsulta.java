package com.example.provan1_23_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivityConsulta extends AppCompatActivity {

    ArrayList<AtividadeComplementar> atividadeComplementarArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_consulta);

        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            atividadeComplementarArrayList = (ArrayList<AtividadeComplementar>) getIntent().getSerializableExtra("arrayPopulado");
            Log.e("aqui", "tamanho recebido: " + atividadeComplementarArrayList.size());
        }

    }
}