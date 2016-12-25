package ru.lexxer.lesson3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Button butGo;
    public WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butGo = (Button) findViewById(R.id.butGo);
        webView = (WebView) findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);
        butGo.setOnClickListener(this);
    }

    public void onClick(View v){
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String selected = spinner.getSelectedItem().toString();
        //Toast.makeText(getApplicationContext(), selected, Toast.LENGTH_SHORT).show();
        webView.loadUrl(selected);
    }
}
