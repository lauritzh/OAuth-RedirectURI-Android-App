package com.lauritz.oauthredirecturitest;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get Intent Data
        Intent intent = getIntent();
        String action = intent.getAction();
        Uri data = intent.getData();

        // Output via Alert
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Test");
        alertDialog.setMessage("Action: " + action + "\nIntent-Data: " + data);
        alertDialog.show();
    }
}