package com.example.android.tallerfinal;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Circulo extends AppCompatActivity {
    private EditText cajaRadio;
    private Intent i;
    private Bundle b;
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        cajaRadio = (EditText)findViewById(R.id.txtRadio);
        res = this.getResources();

        i = new Intent(this,Resultado2.class);
        b = new Bundle();
    }

    public void circulo(View v){
        String operacion, dato, rad, aux="";
        double rad2;
        double pi = 3.1416;

        if(validar()){
            rad = cajaRadio.getText().toString();
            rad2 = Integer.parseInt(rad);

            operacion = res.getString(R.string.areacir);
            dato = res.getString(R.string.radio2)+" "+rad2+"\n"+"Pi: "+pi;

            rad2 = (rad2*rad2)*pi;
            aux = aux+rad2+" mts^2";

            b.putString("ResultadoCirculo", aux);
            i.putExtras(b);
            Operacion o = new Operacion(operacion,dato,aux);
            o.guardar();
            startActivity(i);
        }
    }

    public boolean validar(){
        if(cajaRadio.getText().toString().isEmpty()){
            cajaRadio.setError(res.getString(R.string.errorradio));
            return false;
        }
        return true;
    }

    public void borrar2(View v){ limpiar();}

    public void limpiar(){
        cajaRadio.setText("");
        cajaRadio.requestFocus();
    }
}
