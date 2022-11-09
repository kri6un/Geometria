package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculartriangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculartriangulo);


        EditText ingbasetri = (EditText) findViewById(R.id.ingbasetri);
        EditText ingalturatri = (EditText) findViewById(R.id.ingalturatri);
        TextView resultadotri = (TextView) findViewById(R.id.resultradotri);
        Button calculartri = (Button) findViewById(R.id.calculartri);

        calculartri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double base = Double.parseDouble(ingbasetri.getText().toString());
                Double altura = Double.parseDouble(ingalturatri.getText().toString());
                double Total = (base * altura)/2;

                resultadotri.setText("Total: "+Total);
            }

        });
    }
}