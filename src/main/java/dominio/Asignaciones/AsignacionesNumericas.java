package dominio.Asignaciones;

import dominio.Criterios.Criterio;

import java.util.ArrayList;

public class AsignacionesNumericas extends Asignacion {


    private ArrayList<Integer> notas = new ArrayList<Integer>();


    public void agregarNotas(Integer unaNotas){
        notas.add(unaNotas);
        ultimaNota = String.valueOf(unaNotas);
    }
    public AsignacionesNumericas(String descripcion, Criterio criterio) {

        super (descripcion,criterio);

    }

    public  ArrayList<Integer> obtenerLista () {

        return notas;
    }



    public String getUltimaNota () {

        return String.valueOf( notas.get(notas.size() -1));
    }

    public String setUltimaNota () {

        return String.valueOf( notas.get(notas.size() -1));
    }


    public ArrayList<Integer> obtenerListaDeNotas() {
        return notas;
    }
}
