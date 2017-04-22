package com.example.android.tallerfinal;

import android.widget.EditText;

/**
 * Created by LabRedes on 21/04/2017.
 */
public class Operacion {
    private String opera;
    private String dato;
    private String result;

    public Operacion(String opera, String dato, String result) {
        this.opera = opera;
        this.dato = dato;
        this.result = result;
    }

    public String getOpera() {
        return opera;
    }

    public void setOpera(String opera) {
        this.opera = opera;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void guardar(){Datos.guardar(this);}
}
