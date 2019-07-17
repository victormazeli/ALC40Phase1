package com.example.alc40phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlc extends AppCompatActivity {

    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);



        getSupportActionBar().setTitle("About Alc");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView =  findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public  void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                handler.proceed();
            }
        });
        webView.loadUrl("https://andela.com/alc/");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);



    }
    @Override
    public  void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {


            super.onBackPressed();
        }

    }

}

