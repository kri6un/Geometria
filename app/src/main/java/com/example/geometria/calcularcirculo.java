package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calcularcirculo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcularcirculo);

        EditText ingdiametro = (EditText) findViewById(R.id.ingdiametro);
        TextView resultadodia = (TextView) findViewById(R.id.resultadodia);
        Button calculardia = (Button) findViewById(R.id.calculardia);

        calculardia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double radio = Double.parseDouble(ingdiametro.getText().toString());
                double Total = Math.pow(radio,2)*3.14;
                resultadodia.setText("Total: "+Total);
            }
        });
    }
}