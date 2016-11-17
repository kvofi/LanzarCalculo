package com.ejemplos.lanzarcalculo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Numeros_Activity extends AppCompatActivity {
    private EditText num;
    private  EditText result;
    private Button xdos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);
        num= (EditText) findViewById(R.id.eNum);
        result= (EditText) findViewById(R.id.eResult);
        xdos=(Button) findViewById(R.id.bCalcular);
        xdos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mult();
            }
        });

    }
    public void mult(){
        //Cogemos el valor del edit text de numero en "n"
       int n=Integer.parseInt(num.getText().toString());
        int res= n*2;
        //Pasamos al eResult el valor de res
        result.setText(String.valueOf(res));
    }
}
