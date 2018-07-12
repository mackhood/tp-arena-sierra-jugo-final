package dominio.Asignaciones;

import dominio.Asignaciones.Asignacion;
import dominio.Criterios.Criterio;

import java.util.ArrayList;

public class AsignacionesConceptuales extends Asignacion {

    private ArrayList<String> notas = new ArrayList<String>();


 public AsignacionesConceptuales ( String descripcion , Criterio criterio) {

     super (descripcion,criterio);


 }

 public  ArrayList<String> obtenerListaDeNotas () {
    return notas;
 }


    public String ultimaNota () {

        return notas.get(notas.size() -1);
    }

    public boolean estaAprobado () {

     return criterio.cumpleCriterio();
    }


}
