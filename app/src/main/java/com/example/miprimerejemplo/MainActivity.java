package com.example.miprimerejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button botonPot, botonFib, botonMult;
    EditText edi1, edi2;
    TextView tvRes;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edi1 = (EditText) findViewById(R.id.num1);
        edi2 = (EditText) findViewById(R.id.num2);

        tvRes= (TextView) findViewById(R.id.resultado);

        botonPot = (Button) findViewById(R.id.potencia);
        botonFib = (Button) findViewById(R.id.fibonacci);
        botonMult= (Button)findViewById(R.id.multi);

        botonPot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int n1, n2;
                int respot;

                n1 = Integer.parseInt(edi1.getText().toString());
                n2 = Integer.parseInt(edi2.getText().toString());

                Calculadora cal = new Calculadora();

                cal.setResultadoPot(n1, n2);

                respot = cal.getResPot();

                tvRes.setText("La potencia de los numeros es " +respot);
            }
        });

        botonFib.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int n1, n2;
                int resfib;

                n1 = Integer.parseInt(edi1.getText().toString());
                n2 = Integer.parseInt(edi2.getText().toString());

                Calculadora cal = new Calculadora();

                cal.setResultadoMul(n1, n2);

                resfib = cal.getResFib();

                tvRes.setText("La secuencia fibonacci del "+n1+" es " +resfib);
            }
        });

        botonPot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int n1, n2;
                int resmult;

                n1 = Integer.parseInt(edi1.getText().toString());
                n2 = Integer.parseInt(edi2.getText().toString());

                Calculadora cal = new Calculadora();

                cal.setResultadoMul(n1, n2);

                resmult = cal.getResPot();

                tvRes.setText("La potencia de los numeros es " +resmult);
            }
        });
    }
}
