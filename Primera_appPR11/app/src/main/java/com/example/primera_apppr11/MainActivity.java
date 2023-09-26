package com.example.primera_apppr11;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.button);

        // Configura un OnClickListener para el botón
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence texto = "Hello, World!";
                // Display a toast message
                Toast.makeText(MainActivity.this, texto, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
