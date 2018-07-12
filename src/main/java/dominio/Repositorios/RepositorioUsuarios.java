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


  List<Usuario> lista;

    public  List<Usuario> obtenerUsuario() {




    ArrayList<Asignacion> asignacionFernando = new ArrayList<Asignacion>();
    CriterioNumericas criterioDiseño = new CriterioNumericas();
    AsignacionesNumericas parcialDiseño = new AsignacionesNumericas("Parcial Diseño",criterioDiseño);
     parcialDiseño.agregarNotas(8);
     parcialDiseño.agregarNotas(9);
     parcialDiseño.agregarNotas(10);

    CriterioConceptuales criterioTPDiseño = new CriterioConceptuales();
    AsignacionesConceptuales tpDiseño = new AsignacionesConceptuales("TP Diseño",criterioTPDiseño);

    asignacionFernando.add(parcialDiseño);
    asignacionFernando.add(tpDiseño);

    tpDiseño.agregarNotaConceptual("M");
    tpDiseño.agregarNotaConceptual("M");
    tpDiseño.agregarNotaConceptual("B");


     Usuario fernando = new Usuario  ("Fernando Sierra","fernandosierra9",asignacionFernando);

     lista = new ArrayList<>();
     lista.add(fernando );


    ArrayList<Asignacion> asignacionGerman = new ArrayList<Asignacion>();
    CriterioConceptuales criterioLaboratorio = new CriterioConceptuales();
    AsignacionesConceptuales laboratorio = new AsignacionesConceptuales("Laboratorio", criterioLaboratorio);
   CriterioNumericas criterioParcialAnalisis = new CriterioNumericas();
   AsignacionesNumericas parcialAnalisis = new AsignacionesNumericas("parcialAnalisis",criterioParcialAnalisis);
    asignacionGerman.add(laboratorio);
    asignacionGerman.add(parcialAnalisis);
    asignacionGerman.add(parcialDiseño);
    asignacionGerman.add(tpDiseño);
    asignacionGerman.add(parcialAnalisis);

    Usuario german = new Usuario  ("German Jugo","mackhood",asignacionGerman);
    lista.add(german);
    return lista;
    }

}

