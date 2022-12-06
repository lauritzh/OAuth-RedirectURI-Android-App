package com.lauritz.oauthredirecturitest;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

        // Launch URL on Button Tap
        final Button button = findViewById(R.id.launchUrl);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText simpleEditText = (EditText) findViewById(R.id.editTextUrl);
                String url = simpleEditText.getText().toString();

                if (!url.startsWith("http://") && !url.startsWith("https://"))
                    url = "http://" + url;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            }
        });
    }
}