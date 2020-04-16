package com.example.exerciciodadospessoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String Nome = "Nome";
    public static final String telephone = "Telefone";
    public static final String email = "email";
    public static final String EXTRA_IDADE  = "idade";
    public static final String EXTRA_PESO  = "peso";
    public static final String EXTRA_ALTURA  = "altura";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {


        EditText nomeEdit = (EditText) findViewById(R.id.edit_nome);
        EditText telefoneEdit = (EditText) findViewById(R.id.edit_telefone);
        EditText emailEdit = (EditText) findViewById(R.id.edit_email);
        EditText idadeEdit = (EditText) findViewById(R.id.edit_idade);
        EditText pesoEdit = (EditText) findViewById(R.id.edit_peso);
        EditText alturaEdit = (EditText) findViewById(R.id.edit_altura);

        String nomeMensagem = nomeEdit.getText().toString();
        String telefoneMensagem = telefoneEdit.getText().toString();
        String emailMensagem = emailEdit.getText().toString();

        String idadeMensagem = idadeEdit.getText().toString();


        String pesoMensagem = pesoEdit.getText().toString();


        String alturaMensagem = alturaEdit.getText().toString();


        //validar dados
        if (nomeMensagem.length() <= 0) {
            nomeEdit.setError("Preencha o nome");
            nomeEdit.requestFocus();
            return;
        }

        if (telefoneMensagem.length() <= 0) {
            telefoneEdit.setError("Preencha o telefone");
            telefoneEdit.requestFocus();
            return;
        }

        if (emailMensagem.length() <= 0) {
            emailEdit.setError("Preencha o email");
            emailEdit.requestFocus();
            return;
        }

        int idade = 0;
        try {
            idade = Integer.parseInt(idadeMensagem);
        } catch (NumberFormatException e) {
            idadeEdit.setError("Preencha a idade");
            idadeEdit.requestFocus();
            return;
        }

        if (idade <= 18) {
            idadeEdit.setError("Idade nao pode ser inferior a 18 anos");
            idadeEdit.requestFocus();
            return;
        }

        int peso = 0;
        try {
            peso = Integer.parseInt(pesoMensagem);
        } catch (NumberFormatException e) {
            pesoEdit.setError("Preencha o peso");
            pesoEdit.requestFocus();
            return;
        }

        int altura = 0;
        try {
            altura = Integer.parseInt(alturaMensagem);
        } catch (NumberFormatException e) {
            alturaEdit.setError("Preencha a altura");
            alturaEdit.requestFocus();
            return;
        }


        Intent intent = new Intent(this, DisplayMessageActivity.class);

        intent.putExtra(Nome, nomeMensagem);

        intent.putExtra(telephone, telefoneMensagem);

        intent.putExtra(email, emailMensagem);

        intent.putExtra(EXTRA_IDADE, idadeMensagem);

        intent.putExtra(EXTRA_PESO, pesoMensagem);

        intent.putExtra(EXTRA_ALTURA, alturaMensagem);

        startActivity(intent);
    }
}
