package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calcularrectangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcularrectangulo);

        EditText ingbaserec = (EditText) findViewById(R.id.ingbaserec);
        EditText ingalturarec = (EditText) findViewById(R.id.ingalturarec);
        TextView resultadorec = (TextView) findViewById(R.id.resultadorec);
        Button calcularrec = (Button) findViewById(R.id.calcularrec);

        calcularrec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double base = Double.parseDouble(ingbaserec.getText().toString());
                Double altura = Double.parseDouble(ingalturarec.getText().toString());
                double Total = base * altura;

                resultadorec.setText("total: "+Total);
            }
        });

    }
}