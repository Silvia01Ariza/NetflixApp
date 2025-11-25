package com.example.netflixapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class RedesSocialesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redes_sociales);

        Button facebook = findViewById(R.id.btnFacebook);
        Button instagram = findViewById(R.id.btnInstagram);
        Button tiktok = findViewById(R.id.btnTikTok);
        Button youtube = findViewById(R.id.btnYoutube);
        Button regresar = findViewById(R.id.btnRegresarMenuRedes);

        // Abrir redes sociales
        facebook.setOnClickListener(v -> abrirUrl("https://www.facebook.com"));
        instagram.setOnClickListener(v -> abrirUrl("https://www.instagram.com"));
        tiktok.setOnClickListener(v -> abrirUrl("https://www.tiktok.com"));
        youtube.setOnClickListener(v -> abrirUrl("https://www.youtube.com"));

        // Regresar
        regresar.setOnClickListener(v ->
                startActivity(new Intent(this, MenuActivity.class))
        );
    }

    private void abrirUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}