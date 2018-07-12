package dominio.Repositorios;

import dominio.Asignaciones.Asignacion;
import dominio.Asignaciones.AsignacionesNumericas;
import dominio.Criterios.CriterioConceptuales;
import dominio.Criterios.CriterioNumericas;
import dominio.Usuario;
import org.uqbar.commons.utils.Observable;

import java.util.ArrayList;

@Observable
public class RepositorioUsuarios {
    public Usuario obtenerUsuario() {
    ArrayList<Asignacion> asignacionFernando = new ArrayList<Asignacion>();
    CriterioNumericas criterioDiseño = new CriterioNumericas();
    AsignacionesNumericas parcialDiseño = new AsignacionesNumericas("Parcial Diseño",criterioDiseño);

    CriterioConceptuales criterioTPDiseño = new CriterioConceptuales();
    AsignacionesNumericas tpDiseño = new AsignacionesNumericas("TP Diseño",criterioTPDiseño);

    asignacionFernando.add(parcialDiseño);
    asignacionFernando.add(tpDiseño);

    return new Usuario("Fernando Sierra","fernandosierra9",asignacionFernando);
    }
}
