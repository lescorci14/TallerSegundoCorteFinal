package com.example.android.tallerfinal;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado1 extends AppCompatActivity {
    private TextView enviado;
    private Bundle b;
    private String resultado, aux;
    private Resources res;
    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado1);

        enviado = (TextView)findViewById(R.id.txtResultadoCua);
        b = getIntent().getExtras();
        resultado = b.getString("ResultadoCuadrado");
        res = this.getResources();

        aux = res.getString(R.string.area)+" "+resultado;

        enviado.setText(aux);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(res.getString(R.string.result));
        builder.setMessage(aux)
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        i = new Intent(Resultado1.this, Cuadrado.class);
                        startActivity(i);
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
