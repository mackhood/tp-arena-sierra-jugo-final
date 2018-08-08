package dominio.Asignaciones;

import dominio.Criterios.Criterio;

import java.util.ArrayList;
import java.util.List;

public class AsignacionesNumericas extends Asignacion {


    private List<Integer> notas = new ArrayList<Integer>();


    public void agregarNotas(Integer unaNotas){
        notas.add(unaNotas);
        ultimaNota = String.valueOf(unaNotas);
    }
    public AsignacionesNumericas(String descripcion, Criterio criterio) {

        super (descripcion,criterio);

    }

    public  List<Integer> obtenerLista () {

        return notas;
    }



    public String getUltimaNota () {

        return String.valueOf( notas.get(notas.size() -1));
    }

    public String setUltimaNota () {

        return String.valueOf( notas.get(notas.size() -1));
    }

    public  void setearUltimaNota ( int nota){

        notas.add(nota);
    }

    public Integer getUltimaNotaEnInt (){

        return notas.get(notas.size()-1);
    }

    public List<Integer> obtenerListaDeNotas() {
        return notas;
    }
}
