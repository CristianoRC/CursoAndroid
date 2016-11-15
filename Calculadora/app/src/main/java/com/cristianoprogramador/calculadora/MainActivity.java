package com.cristianoprogramador.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity
{

    EditText etN1, etN2, etResultado;
    Button btnSomar;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etN1 = (EditText) findViewById(R.id.etN1);
        etN2 = (EditText) findViewById(R.id.etN2);
        etResultado = (EditText) findViewById(R.id.etResultado);

        btnSomar = (Button) findViewById(R.id.btnSomar);

        btnSomar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                float n1, n2, resultado;

                n1 = Float.parseFloat(etN1.getText().toString());
                n2 = Float.parseFloat(etN2.getText().toString());

                resultado = n1 + n2;

                String saida = String.valueOf(resultado);

                etResultado.setText(saida);

                AlertDialog.Builder menssagem = new AlertDialog.Builder(MainActivity.this);

                menssagem.setMessage("Cálculo efetudado com sucesso!");
                menssagem.show();
            }
        });
    }
}
