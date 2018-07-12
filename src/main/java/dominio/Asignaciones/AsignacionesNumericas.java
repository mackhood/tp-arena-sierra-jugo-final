package dominio.Asignaciones;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import dominio.Asignaciones.Asignacion;
import dominio.Criterios.Criterio;
import dominio.Criterios.CriterioNumericas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

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

    public boolean estaAprobado () {

    return criterio.cumpleCriterio();
    }

    public ArrayList<Integer> obtenerListaDeNotas() {
        return notas;
    }
}
