package com.example.netflixapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class VideoPromocionalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_promocional);

        WebView webView = findViewById(R.id.webViewVideo);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        // Inserta aquí tu enlace de YouTube
        String videoHTML = "<iframe width=\"100%\" height=\"100%\" "
                + "src=\"https://www.youtube.com/embed/dQw4w9WgXcQ\" "
                + "frameborder=\"0\" allowfullscreen></iframe>";

        webView.loadData(videoHTML, "text/html", "utf-8");
    }
}