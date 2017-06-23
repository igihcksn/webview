package net.igihcksn.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebView1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view1);

    }
    btn_tutorial = (Button)findViewById(R.id.tutorial_button);

 btn_tutorial.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent tutorialPage = new Intent (this, tutorials.class);
            startActivity(tutorialPage);
        }
    }
}
