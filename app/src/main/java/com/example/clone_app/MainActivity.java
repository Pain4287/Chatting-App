package com.example.clone_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView cht,srch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cht = findViewById(R.id.chat1);
        srch = findViewById(R.id.search);

        cht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Chat.class );
                startActivity(i);
            }
        });

        srch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sr = new Intent(MainActivity.this, Search.class);
                startActivity(sr);
            }
        });

    }
}