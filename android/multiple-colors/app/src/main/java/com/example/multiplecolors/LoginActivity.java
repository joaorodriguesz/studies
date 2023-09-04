package com.example.multiplecolors;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editEmail;
    private EditText editSenha;
    private Button btnEntrar;
    private Button btnRegistro;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editEmail = findViewById(R.id.editEmail);
        editSenha = findViewById(R.id.editSenha);
        btnEntrar = findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editEmail.getText().toString().isEmpty()) {
                    editEmail.setError("Campo e-mail obrigatório");
                    editEmail.setEnabled(true);
                }
                else if (editSenha.getText().toString().isEmpty()) {
                    // Mensagem de erro ...
                }
                else {
                    if (
                        editEmail.getText().toString().equals("superman")
                        &&
                        editSenha.getText().toString().equals("loislaine")
                    ) {
                        Intent it = new Intent(LoginActivity.this, MainActivity.class);
                        it.putExtra("KEY_LEGENDA", editEmail.getText().toString());
                        it.putExtra("KEY_SENHA", editSenha.getText().toString());
                        startActivity(it);
                    }
                }
            }
        });

        btnRegistro = findViewById(R.id.btnRegistro);
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}