package com.frissco.tetra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class about extends AppCompatActivity {
    Button license,about,update;
    TextView play,plays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().hide();

        license = (Button) findViewById(R.id.license);
        license.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlicense();
            }
        });

        play = (TextView) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://play.google.com/store/apps/dev?id=8331228622407376932");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        plays = (TextView) findViewById(R.id.plays);
        plays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://play.google.com/store/apps/dev?id=8331228622407376932");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        about = (Button) findViewById(R.id.github);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://github.com/Cyber-Zypher/Tetra-Companion");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        update = (Button) findViewById(R.id.chfup);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.frissco.tetra");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

    private void openlicense() {
        Intent intent = new Intent(this, com.frissco.tetra.license.class);
        startActivity(intent);
    }
}