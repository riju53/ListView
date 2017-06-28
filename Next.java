package com.example.rijunath.listview_sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by RIJU NATH on 6/25/2017.
 */
public class Next extends AppCompatActivity {
    WebView wv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next);
        int i=getIntent().getExtras().getInt("imag");
        String s=getIntent().getExtras().getString("lnk");
        wv=(WebView)findViewById(R.id.wv);
        wv.loadUrl(s);
    }
}
