package com.example.netflixapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;

public class ContactanosActivity extends AppCompatActivity {

    EditText editNombre, editMensaje;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactanos);

        editNombre = findViewById(R.id.editNombre);
        editMensaje = findViewById(R.id.editMensaje);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(v -> {
            Toast.makeText(this, "Mensaje enviado 👍", Toast.LENGTH_SHORT).show();
        });
    }
}
