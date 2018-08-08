import dominio.Asignaciones.AsignacionesConceptuales;
import dominio.Asignaciones.AsignacionesNumericas;
import dominio.Criterios.CriterioConceptuales;
import dominio.Criterios.CriterioNumericas;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



public class testCriterio {



    private CriterioConceptuales unCriterioConceptual;
    private CriterioNumericas unCriterioNumerico;
    private AsignacionesConceptuales asignacionMockConceptual;
    private AsignacionesNumericas asignacionMockNumericas;
    private List<Integer> notasNumericas = new ArrayList<Integer> () ;
    private List<String> notasConceptuales = new ArrayList<String>();
    @Before
    public void setUp() {



     asignacionMockConceptual = mock(AsignacionesConceptuales.class);
     asignacionMockNumericas = mock(AsignacionesNumericas.class);
    unCriterioConceptual = new CriterioConceptuales();
    unCriterioNumerico = new CriterioNumericas();
     notasNumericas.add(8);
     notasNumericas.add(4);
     notasNumericas.add(6);
     notasConceptuales.add("B");
     notasConceptuales.add("M");
     notasConceptuales.add("R");
     unCriterioConceptual.setAsignacionConceptual(asignacionMockConceptual);
     unCriterioNumerico.setAsignacionesNumericas(asignacionMockNumericas);

        when(asignacionMockConceptual.obtenerListaDeNotas()).thenReturn( notasConceptuales);
        when(asignacionMockNumericas.obtenerListaDeNotas()).thenReturn( notasNumericas);


    }


    @Test
    public void cumpleCriterioConceptual () {

        assertFalse(unCriterioConceptual.cumpleCriterio());
    }


    @Test
    public void cumpleCriterioNumerico () {

        assertTrue(unCriterioNumerico.cumpleCriterio());

    }









}
