package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText numero1, numero2;
    public TextView resultado2;
    public int operando1, operando2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        resultado2 = findViewById(R.id.resultado2);
    }

    public void suma(View view){
        operando1 = Integer.parseInt(String.valueOf(numero1.getText()));
        operando2 = Integer.parseInt(String.valueOf(numero2.getText()));
        resultado = operando1 + operando2;
        resultado2.setText(String.valueOf(resultado));
    }

    public void resta(View view){
        operando1 = Integer.parseInt(String.valueOf(numero1.getText()));
        operando2 = Integer.parseInt(String.valueOf(numero2.getText()));
        resultado = operando1 - operando2;
        resultado2.setText(String.valueOf(resultado));
    }
    public void multiplicacion(View view){
        operando1 = Integer.parseInt(String.valueOf(numero1.getText()));
        operando2 = Integer.parseInt(String.valueOf(numero2.getText()));
        resultado = operando1 * operando2;
        resultado2.setText(String.valueOf(resultado));
    }

    public void division(View view){
        operando1 = Integer.parseInt(String.valueOf(numero1.getText()));
        operando2 = Integer.parseInt(String.valueOf(numero2.getText()));
        if (operando2!=0) {
            resultado = operando1 / operando2;
            resultado2.setText(String.valueOf(resultado));
        } else {
            resultado2.setText("No es posible dividir por 0");
        }

    }
}