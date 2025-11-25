package com.example.netflixapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TemaPrincipalActivity extends AppCompatActivity {

    Button btnVolverMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema_principal);

        btnVolverMenu = findViewById(R.id.btnVolverMenu);

        btnVolverMenu.setOnClickListener(v ->
                startActivity(new Intent(TemaPrincipalActivity.this, MenuActivity.class))
        );
    }
}
