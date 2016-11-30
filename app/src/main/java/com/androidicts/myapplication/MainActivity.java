package com.androidicts.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText editTextResultado;
    private Button btn9;
    private Button btn8;
    private Button btn7;
    private Button btn6;
    private Button btn5;
    private Button btn4;
    private Button btn3;
    private Button btn2;
    private Button btn1;
    private Button btn0;
    private Button btnDel;
    private Button btnDivision;
    private Button btnMultiplicacion;
    private Button btnSuma;
    private Button btnResta;
    private Button btnIgual;
    private String contador;
    e


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);
       editTextResultado = (EditText) findViewById(R.id.editTextResultado);
       editTextResultado = (EditText) findViewById(R.id.editTextResultado);
       btn9 = (Button) findViewById(R.id.btn9);
       btn8 = (Button) findViewById(R.id.btn8);
       btn7 = (Button) findViewById(R.id.btn7);
       btn6 = (Button) findViewById(R.id.btn6);
       btn5 = (Button) findViewById(R.id.btn5);
       btn4 = (Button) findViewById(R.id.btn4);
       btn3 = (Button) findViewById(R.id.btn3);
       btn2 = (Button) findViewById(R.id.btn2);
       btn1 = (Button) findViewById(R.id.btn1);
       btn0 = (Button) findViewById(R.id.btn0);
       btnDel = (Button) findViewById(R.id.btnDel);
       btnDivision = (Button) findViewById(R.id.btnDivision);
       btnMultiplicacion = (Button) findViewById(R.id.btnMultiplicacion);
       btnSuma = (Button) findViewById(R.id.btnSuma);
       btnResta = (Button) findViewById(R.id.btnResta);
       btnIgual = (Button) findViewById(R.id.btnIgual);
       contador = "";
       List list;
       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               contador += "1";
               editTextResultado.setText(contador);
           }
       });





    }
}

