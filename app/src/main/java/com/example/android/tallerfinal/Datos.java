package com.example.android.tallerfinal;

import java.util.ArrayList;

/**
 * Created by LabRedes on 21/04/2017.
 */
public class Datos {
    private static ArrayList<Operacion> operaciones = new ArrayList<>();

    public static void guardar(Operacion o) { operaciones.add(o); }

    public static ArrayList<Operacion> getOperaciones() {return operaciones;}
}
