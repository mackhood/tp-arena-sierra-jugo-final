package dominio.Repositorios;

import dominio.Asignaciones.Asignacion;
import dominio.Asignaciones.AsignacionesConceptuales;
import dominio.Asignaciones.AsignacionesNumericas;
import dominio.Criterios.CriterioConceptuales;
import dominio.Criterios.CriterioNumericas;
import dominio.Usuario;
import org.uqbar.commons.utils.Observable;

import java.util.*;

@Observable
public class RepositorioUsuarios {


  List<Usuario> lista ;

    public  List<Usuario> obtenerUsuarios() {


    ArrayList<Asignacion> asignacionFernando = new ArrayList<Asignacion>();
    ArrayList<Asignacion> asignacionGerman = new ArrayList<Asignacion>();

    CriterioNumericas criterioDiseño = new CriterioNumericas();
    CriterioNumericas criterioParcialAnalisis = new CriterioNumericas();

    CriterioConceptuales criterioTPDiseño = new CriterioConceptuales();
    CriterioConceptuales criterioLaboratorio = new CriterioConceptuales();

    AsignacionesNumericas parcialDiseño = new AsignacionesNumericas("Parcial Diseño",criterioDiseño);
    AsignacionesNumericas parcialAnalisis = new AsignacionesNumericas("parcialAnalisis",criterioParcialAnalisis);

    AsignacionesConceptuales laboratorio = new AsignacionesConceptuales("Laboratorio", criterioLaboratorio);
    AsignacionesConceptuales tpDiseño = new AsignacionesConceptuales("TP Diseño",criterioTPDiseño);



    parcialDiseño.agregarNotas(8);
    parcialDiseño.agregarNotas(9);
    parcialDiseño.agregarNotas(10);


    tpDiseño.agregarNotaConceptual("M");
    tpDiseño.agregarNotaConceptual("B");
    tpDiseño.agregarNotaConceptual("B");


    laboratorio.agregarNotaConceptual("B");


    parcialAnalisis.agregarNotas(4);


    criterioDiseño.setAsignacionesNumericas(parcialDiseño);
    criterioLaboratorio.setAsignacionConceptual(laboratorio);
    criterioParcialAnalisis.setAsignacionesNumericas(parcialAnalisis);
    criterioTPDiseño.setAsignacionConceptual(tpDiseño);


    asignacionFernando.add(parcialDiseño);
    asignacionFernando.add(tpDiseño);

    asignacionGerman.add(laboratorio);
    asignacionGerman.add(parcialAnalisis);
    asignacionGerman.add(parcialDiseño);
    asignacionGerman.add(tpDiseño);


    Usuario fernando = new Usuario  ("Fernando Sierra","fernandosierra9",asignacionFernando);
    Usuario german = new Usuario  ("German Jugo","mackhood",asignacionGerman);

    lista =  new ArrayList<Usuario>();
    lista.add(fernando );
    lista.add(german);
    return lista;
    }


}

