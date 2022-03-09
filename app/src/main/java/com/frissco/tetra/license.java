package com.frissco.tetra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import javax.security.auth.callback.Callback;

public class license extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license);
        getSupportActionBar().hide();

        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new Callback());
        webView.loadUrl("file:///android_asset/license.html");
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return false;
        }
    }
}