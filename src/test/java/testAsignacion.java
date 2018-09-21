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
    private AsignacionesConceptuales asignacionesConceptualesVerdaderas;
    private AsignacionesNumericas asignacionesNumericasVerdaderas;
    private AsignacionesConceptuales asignacionesConceptualesFalsas;
    private AsignacionesNumericas asignacionesNumericasFalsas;

    private CriterioNumericas mockCriterioNumericoVerdadero ;
    private CriterioNumericas mockCriterioNumericoFalso ;
    private CriterioConceptuales mockCriterioConceptualesVerdadero ;
    private CriterioConceptuales mockCriterioConceptualesFalso ;


    @Before

    public void setUp() {

        mockCriterioConceptualesVerdadero = mock(CriterioConceptuales.class);
        mockCriterioNumericoVerdadero = mock(CriterioNumericas.class);

        mockCriterioConceptualesFalso = mock(CriterioConceptuales.class);
        mockCriterioNumericoFalso = mock(CriterioNumericas.class);

        when(mockCriterioConceptualesVerdadero.cumpleCriterio()).thenReturn( true);
        when(mockCriterioNumericoVerdadero.cumpleCriterio()).thenReturn( true);

        when(mockCriterioConceptualesFalso.cumpleCriterio()).thenReturn( false);
        when(mockCriterioNumericoFalso.cumpleCriterio()).thenReturn( false);


        asignacionesNumericasVerdaderas=new AsignacionesNumericas("pruebaNumerica",mockCriterioNumericoVerdadero);
        asignacionesConceptualesVerdaderas = new AsignacionesConceptuales("pruebaConceptual",mockCriterioConceptualesVerdadero);


        asignacionesNumericasFalsas=new AsignacionesNumericas("pruebaNumerica",mockCriterioNumericoFalso);
        asignacionesConceptualesFalsas = new AsignacionesConceptuales("pruebaConceptual",mockCriterioConceptualesFalso);





    }


    @Test

    public  void estaAprobadoConceptual () {

       assertTrue(asignacionesConceptualesVerdaderas.estaAprobado());
    }

    @Test

     public void estaAprobadoNumerico () {
        assertTrue(asignacionesNumericasVerdaderas.estaAprobado());
    }



    @Test

    public void actualizarEstadoConceptual() {


        assertEquals("Aprobado",asignacionesConceptualesVerdaderas.getEstado());

    }



    @Test

    public void actualizarEstadoNumerica() {


        assertEquals("Aprobado",asignacionesNumericasVerdaderas.getEstado());

    }



    @Test

    public  void estaDesaprobadoConceptual () {

        assertFalse(asignacionesConceptualesFalsas.estaAprobado());
    }

    @Test

    public void estaDesaprobadoNumerico () {
        assertFalse(asignacionesNumericasFalsas.estaAprobado());
    }



    @Test

    public void actualizarEstadoConceptuaDesaprobado() {


        assertEquals("Desaprobado",asignacionesConceptualesFalsas.getEstado());

    }



    @Test

    public void actualizarEstadoNumericaDesaprobado() {

        assertEquals("Desaprobado",asignacionesNumericasFalsas.getEstado());

    }




    @Test
    public void ultimaNotaConceptual () {

        asignacionesConceptualesVerdaderas.agregarNotaConceptual(ultimaNota);
        assertEquals(ultimaNota,asignacionesConceptualesVerdaderas.getUltimaNota());

    }



    @Test
    public void ultimaNotaNumericas () {


    asignacionesNumericasVerdaderas.setearUltimaNota(ultimaNotaNumero);
    assertEquals(ultimaNotaNumero,asignacionesNumericasVerdaderas.getUltimaNotaEnInt());
    }




}
