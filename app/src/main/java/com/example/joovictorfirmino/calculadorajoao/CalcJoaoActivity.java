package com.example.joovictorfirmino.calculadorajoao;

import java.text.NumberFormat;

import android.os.Bundle;
import android.app.*;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.view.*;




public class CalcJoaoActivity extends Activity {

     EditText edtValor1;
     EditText edtValor2;
     EditText edtResultado;
     Button btnSoma;
     Button btnSubtrair;
     Button btnDividir;
     Button btnMultiplicar;
     double num1;
     double num2;
     double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_joao);
        edtValor1 = (EditText)findViewById(R.id.edtValor1);
        edtValor2 = (EditText)findViewById(R.id.edtValor2);
        edtResultado = (EditText)findViewById(R.id.edtResultado);
        btnSoma = (Button)findViewById(R.id.btnSoma);
        btnDividir = (Button)findViewById(R.id.btnDividir);
        btnSubtrair = (Button)findViewById(R.id.btnSubtrair);
        btnMultiplicar = (Button)findViewById(R.id.btnMultiplicar);


        btnSoma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                num1 = Double.parseDouble(edtValor1.getText().toString());
                num2 = Double.parseDouble(edtValor2.getText().toString());
                result = num1 + num2;
                edtResultado.setText(String.valueOf(result));


            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                num1 = Double.parseDouble(edtValor1.getText() .toString());
                num2 = Double.parseDouble(edtValor2.getText() .toString());
                result = num1 - num2;
                edtResultado.setText(String.valueOf(result));

            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                num1 = Double.parseDouble(edtValor1.getText() .toString());
                num2 = Double.parseDouble(edtValor2.getText() .toString());
                result = num1 / num2;
                edtResultado.setText(String.valueOf(result));

            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                num1 = Double.parseDouble(edtValor1.getText() .toString());
                num2 = Double.parseDouble(edtValor2.getText() .toString());
                result = num1 * num2;
                edtResultado.setText(String.valueOf(result));

            }
        } );

    }

}
