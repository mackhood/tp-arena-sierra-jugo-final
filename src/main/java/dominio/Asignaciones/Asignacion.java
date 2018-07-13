package dominio.Asignaciones;

import dominio.Criterios.Criterio;
import org.uqbar.commons.utils.Observable;

@Observable
public abstract  class Asignacion {


public String descripcion;
public Criterio criterio;
public String ultimaNota;
public String estado;

public Asignacion (String descripcion, Criterio criterio) {

    this.descripcion=descripcion;
    this.criterio = criterio;

}
    public String getDescripcion(){
    return  descripcion;
}

    public String getUltimaNota(){
        return  ultimaNota;
    }

    public boolean estaAprobado () {
        return criterio.cumpleCriterio();
    }


    public void actualizarEstado(){
        this.estado = "Desaprobado";
        if(criterio.cumpleCriterio()){
            estado = "Aprobado";
        }

    }

    public String getEstado(){
        this.actualizarEstado();
        return estado;
    }


}
