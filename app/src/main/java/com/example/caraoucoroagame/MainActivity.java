package com.example.caraoucoroagame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonJogar = findViewById(R.id.buttonJogar);


        buttonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Activity has changed, not the image!", Toast.LENGTH_LONG);


                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                //Passar dados para próxima tela
                int numero = new Random().nextInt(2); // 0 1
                intent.putExtra("numero", numero );
                Toast.makeText(getApplicationContext(), "Activity has changed instead of image!", Toast.LENGTH_LONG).show();
                startActivity( intent );
                finish();

            }
        });

    }
}