package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportActionBar?.hide()

        val WebView = findViewById<WebView>(R.id.webView)

        WebView.webViewClient = WebViewClient()
        WebView.loadUrl("https://www.adrenaline.com.br/")
        WebView.settings.javaScriptEnabled = true
        WebView.settings.domStorageEnabled = true

    }
}