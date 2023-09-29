package com.example.provan1_23_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivityCadastro extends AppCompatActivity {

    EditText edNome, edEmail, edDescricao, edHoras;
    Button btSalvar;

    Spinner spinner;

    ArrayList<AtividadeComplementar> atividadeComplementarArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cadastro);
        edNome = findViewById(R.id.editTextNomeEstudante);
        edEmail = findViewById(R.id.editTextEmailEstudante);
        edDescricao = findViewById(R.id.editTextDescricao);
        edHoras = findViewById(R.id.editTextCargaHoraria);
        btSalvar = findViewById(R.id.buttonSalvar);

        spinner = findViewById(R.id.spinnerCategorias);

        Intent intent_ = getIntent();
        if (intent_.getExtras() != null) {
            atividadeComplementarArrayList = (ArrayList<AtividadeComplementar>) getIntent().getSerializableExtra("array");
        }

        ArrayList<String> dadosSpinner = new ArrayList<>();
        dadosSpinner.add("Categoria 1 - Cursos");
        dadosSpinner.add("Categoria 2 - Projetos");
        dadosSpinner.add("Categoria 3 - Pesquisas");

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, dadosSpinner);

        spinner.setAdapter(spinnerArrayAdapter);

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                atividadeComplementarArrayList.add(new AtividadeComplementar(
                        edNome.getText().toString(),
                        edEmail.getText().toString(),
                        edDescricao.getText().toString(),
                        edHoras.getText().toString(),
                        spinner.getSelectedItem().toString()
                        )
                );

                Intent intent = new Intent(MainActivityCadastro.this, MainActivity.class);
                intent.putExtra("array", atividadeComplementarArrayList);

                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Atividade Salva.", Toast.LENGTH_SHORT).show();

            }
        });
    }
}