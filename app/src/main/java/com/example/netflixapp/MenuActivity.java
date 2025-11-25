package com.example.netflixapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button btnTemaPrincipal, btnMisionVision, btnQuienesSomos, btnGaleria,
            btnVideo, btnContacto, btnRedes, btnSimulacion, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnTemaPrincipal = findViewById(R.id.btnTemaPrincipal);
        btnMisionVision = findViewById(R.id.btnMisionVision);
        btnQuienesSomos = findViewById(R.id.btnQuienesSomos);
        btnGaleria = findViewById(R.id.btnGaleria);
        btnVideo = findViewById(R.id.btnVideo);
        btnContacto = findViewById(R.id.btnContacto);
        btnRedes = findViewById(R.id.btnRedes);
        btnSimulacion = findViewById(R.id.btnSimulacion);
        btnLogout = findViewById(R.id.btnLogout);

        // ========= ACTIVIDADES =========
        btnTemaPrincipal.setOnClickListener(v ->
                startActivity(new Intent(MenuActivity.this, TemaPrincipalActivity.class)));

        btnMisionVision.setOnClickListener(v ->
                startActivity(new Intent(MenuActivity.this, MisionVisionActivity.class)));

        btnQuienesSomos.setOnClickListener(v ->
                startActivity(new Intent(MenuActivity.this, QuienesSomosActivity.class)));

        btnGaleria.setOnClickListener(v ->
                startActivity(new Intent(MenuActivity.this, GaleriaActivity.class)));

        btnVideo.setOnClickListener(v ->
                startActivity(new Intent(MenuActivity.this, VideoPromocionalActivity.class)));

        btnContacto.setOnClickListener(v ->
                startActivity(new Intent(MenuActivity.this, ContactanosActivity.class)));

        btnRedes.setOnClickListener(v ->
                startActivity(new Intent(MenuActivity.this, RedesSocialesActivity.class)));

        btnSimulacion.setOnClickListener(v ->
                startActivity(new Intent(MenuActivity.this, SimulacionActivity.class)));

        btnLogout.setOnClickListener(v -> {
            Intent logout = new Intent(MenuActivity.this, MainActivity.class);
            logout.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(logout);
            finish();
        });
    }
}
