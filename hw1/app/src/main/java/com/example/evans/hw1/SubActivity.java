package com.example.evans.hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a2);
        Bundle bundle = this.getIntent().getExtras();
        String co = bundle.getString("www");
        TextView textView = (TextView) findViewById(R.id.t);
        textView.setText("B10509016: "+ co);
    }
}
