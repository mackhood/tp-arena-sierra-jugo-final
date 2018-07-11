package dominio.Asignaciones;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import dominio.Asignaciones.Asignacion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AsignacionesNumericas extends Asignacion {


    private ArrayList<Integer> notas = new ArrayList<Integer>();


    AsignacionesNumericas ( String descripcion , Criterio criterio) {

        super (descripcion,criterio);
    }

    public int ultimaNota () {

        return notas.get(notas.size() -1);
    }

    public boolean estaAprobado () {

    return criterio.cumpleCriterio(this.notas);
    }

}
