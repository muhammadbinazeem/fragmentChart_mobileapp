package com.example.fragmetchart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity implements
        b.OneFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonClick(String text) {
        a textFragment = (a) getSupportFragmentManager()
                .findFragmentById(R.id.one_fragment);
        textFragment.changeTextProperties(text);
    }
}