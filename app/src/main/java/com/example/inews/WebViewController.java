package com.example.inews;

import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewController extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String request) {
        view.loadUrl(request);
        return true;
    }
}
