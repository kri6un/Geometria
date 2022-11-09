package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void triangulo (View view){
            Intent tri = new Intent(this, calculartriangulo.class);
            startActivity(tri);

        }
        public void rectangulo (View view){
            Intent rec = new Intent(this, calcularrectangulo.class);
            startActivity(rec);
        }
        public void circulo (View view){
            Intent cir = new Intent(this, calcularcirculo.class);
            startActivity(cir);
        }
    public void registro(View view){
        Intent registrar = new Intent(this, conexbd.class);
        startActivity(registrar);
    }

}