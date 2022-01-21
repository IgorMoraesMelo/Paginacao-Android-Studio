package com.example.novaspaginas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PaginaBoasVindas extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_boas_vindas);

            // Retorno da intent e da String
        Intent intent = getIntent();
        String nome = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView txt_resultado = findViewById(R.id.txt_resultado);
        txt_resultado.setText("Olá " + nome + " seja bem vindo ao nosso sitema de controle de usuarios ");


    }
}