package com.example.android.tallerfinal;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cuadrado extends AppCompatActivity {
    private EditText cajaLado;
    private Intent i;
    private Bundle b;
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        cajaLado = (EditText)findViewById(R.id.txtLado);
        res = this.getResources();

        i = new Intent(this,Resultado1.class);
        b = new Bundle();
    }

    public void Cuadrado(View v){
        String operacion, dato, lad, aux="";
        int lad2;

        if(validar()){
            lad = cajaLado.getText().toString();
            lad2 = Integer.parseInt(lad);

            operacion = res.getString(R.string.areacua);
            dato = res.getString(R.string.lado2)+" "+lad2;

            lad2 = lad2*lad2;
            aux = aux+lad2+" mts^2";

            b.putString("ResultadoCuadrado", aux);
            i.putExtras(b);
            Operacion o = new Operacion(operacion,dato,aux);
            o.guardar();
            startActivity(i);
        }
    }

    public boolean validar(){
        if(cajaLado.getText().toString().isEmpty()){
            cajaLado.setError(res.getString(R.string.errorlado));
            return false;
        }
        return true;
    }

    public void borrar1(View v){ limpiar(); }

    public void limpiar(){
        cajaLado.setText("");
        cajaLado.requestFocus();
    }

}
