package com.example.novaspaginas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Contante apontanto o pacote de classes
    public static final String EXTRA_MESSAGE = "com.example.novaspaginas.MESSAGE";

    private EditText edt_nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       edt_nome = findViewById(R.id.edt_nome);
    }

        // Metodo de clique para acessar a nova pagina
    public void nextPage(View view){

             // Intenção apontando para a proxima pagina
        Intent intent = new Intent(this, PaginaBoasVindas.class);
        String nome = edt_nome.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, nome);

        startActivity(intent);
    }
}