package com.ejemplos.lanzarcalculo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;
    private Button salir;
    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=(EditText) findViewById(R.id.editText);
        calcular=(Button) findViewById(R.id.bCalcular);
        salir= (Button) findViewById(R.id.bSalir);
        calcular = (Button) findViewById(R.id.bCalcular);
        calcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
               if (nombre.getText().toString().equals("")){
                   nombre.setError("Tienes que introducir el nombre.");

                }else{
                   empezar();
               }

            }
        });
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salir();
            }
        });
    }
    public void empezar(){
        Intent i=new Intent(this,Numeros_Activity.class);
        startActivity(i);

    }
    public void salir(){
        finish();
    }

}
