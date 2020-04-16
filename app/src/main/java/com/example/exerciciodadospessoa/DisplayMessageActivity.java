package com.example.exerciciodadospessoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String messageNome = intent.getStringExtra(MainActivity.Nome);

        String messageTelephone = intent.getStringExtra(MainActivity.telephone);

        String messageEmail = intent.getStringExtra(MainActivity.email);

        String messageIdade = intent.getStringExtra(MainActivity.EXTRA_IDADE);

        String messagePeso = intent.getStringExtra(MainActivity.EXTRA_PESO);

        String messageAltura = intent.getStringExtra(MainActivity.EXTRA_ALTURA);

        TextView nomeText = findViewById(R.id.textViewNome);
        nomeText.setText(messageNome);

       TextView telefoneText = findViewById(R.id.textViewTelefone);
        telefoneText.setText(messageTelephone);

        TextView emailText = findViewById(R.id.textViewEmail);
        emailText.setText(messageEmail);

        TextView idadeText = findViewById(R.id.textViewIdade);
        idadeText.setText(messageIdade);

        TextView pesoText = findViewById(R.id.textViewPeso);
        pesoText.setText(messagePeso);

        TextView alturaText = findViewById(R.id.textViewAltura);
        alturaText.setText(messageAltura);
    }
}
