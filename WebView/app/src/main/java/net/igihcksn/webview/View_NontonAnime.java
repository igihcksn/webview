package net.igihcksn.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class View_NontonAnime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__nonton_anime);

        String url = "http://nontonanime.org";
        WebView view=(WebView) this.findViewById(R.id.nonton1);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}