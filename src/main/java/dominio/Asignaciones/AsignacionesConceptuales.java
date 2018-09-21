package dominio.Asignaciones;

import dominio.Criterios.Criterio;

import java.util.ArrayList;
import java.util.List;

public class AsignacionesConceptuales extends Asignacion {

    private List<String> notas = new ArrayList<String>() ;




 public AsignacionesConceptuales ( String descripcion , Criterio criterio) {

     super (descripcion,criterio);


 }
    public  List<String> obtenerListaDeNotas () {
    return notas;
 }
    public String getUltimaNota () {return notas.get(notas.size() -1);    }
    public void agregarNotaConceptual(String nota) { notas.add(nota);}
}
