package com.example.android.demo3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button library;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        library = (Button) findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link JazzActivity)
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);

                //Start the new activity
                startActivity(libraryIntent);
            }
        });

    }
}

