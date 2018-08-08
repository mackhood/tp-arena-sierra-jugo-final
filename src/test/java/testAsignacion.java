import dominio.Asignaciones.AsignacionesConceptuales;
import dominio.Asignaciones.AsignacionesNumericas;
import dominio.Criterios.CriterioConceptuales;
import dominio.Criterios.CriterioNumericas;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;




public class testAsignacion {



    private String ultimaNota ="R";
    private  Integer ultimaNotaNumero = 6;
    private AsignacionesConceptuales asignacionesConceptuales;
    private AsignacionesNumericas asignacionesNumericas;
    private CriterioNumericas mockCriterioNumericoVerdadero ;
  //  private CriterioNumericas mockCriterioNumericoFalso ;
    private CriterioConceptuales mockCriterioConceptualesVerdadero ;
   // private CriterioConceptuales mockCriterioConceptualesFalso ;


    @Before

    public void setUp() {

     asignacionesConceptuales = new AsignacionesConceptuales("pruebaConceptual",mockCriterioConceptualesVerdadero);
     asignacionesNumericas=new AsignacionesNumericas("pruebaNumerica",mockCriterioNumericoVerdadero);
     mockCriterioConceptualesVerdadero = mock(CriterioConceptuales.class);
     mockCriterioNumericoVerdadero = mock(CriterioNumericas.class);

        when(mockCriterioConceptualesVerdadero.cumpleCriterio()).thenReturn( true);
        when(mockCriterioNumericoVerdadero.cumpleCriterio()).thenReturn( true);    }


    @Test

    public  void estaAprobadoConceptual () {

        assertTrue(asignacionesConceptuales.estaAprobado());



    }
    @Test

     public void estaAprobadoNumerico () {
        assertTrue(asignacionesNumericas.estaAprobado());
    }



    @Test

    public void actualizarEstadoConceptual() {

        asignacionesConceptuales.actualizarEstado();
        assertEquals("Aprobado",asignacionesConceptuales.getEstado());

    }



    @Test

    public void actualizarEstadoNumerica() {

        asignacionesNumericas.actualizarEstado();
        assertEquals("Aprobado",asignacionesNumericas.getEstado());

    }




    @Test
    public void ultimaNotaConceptual () {

        asignacionesConceptuales.agregarNotaConceptual(ultimaNota);
        assertEquals(ultimaNota,asignacionesConceptuales.getUltimaNota());

    }



    @Test
    public void ultimaNotaNumericas () {


    asignacionesNumericas.setearUltimaNota(ultimaNotaNumero);
    assertEquals(ultimaNotaNumero,asignacionesNumericas.getUltimaNotaEnInt());
    }




}
