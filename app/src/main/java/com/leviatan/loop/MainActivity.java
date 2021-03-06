package com.leviatan.loop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.web1);
        //obtiene las configuraciones
        webSettings = webView.getSettings();
        //habilita JavaScript para la App
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        //Toma la URL de el Proycto de Base de Datos
        webView.loadUrl("https://proycto-base-de-datos.herokuapp.com/Iniciar-Sesion.html");
        webView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}