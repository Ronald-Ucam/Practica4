package src.ucam.edu;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCategorias {

    @Test
    public void testInicializacionPersona() {
        // Prueba la correcta inicialización de una persona
        Persona persona = new Persona("Juan", 25);
        assertNotNull(persona);
        assertEquals("Juan", persona.obtenerNombre());
        assertEquals(25, persona.obtenerEdad());
        assertFalse(persona.puedeVotar());
    }

    @Test
    public void testCalculoEsAdulto() {
        // Prueba el método de cálculo 'esAdulto()'
        Persona adulto = new Persona("Ana", 30);
        Persona noAdulto = new Persona("Pedro", 17);

        assertTrue(adulto.esAdulto().equals("SI"));
        assertTrue(noAdulto.esAdulto().equals("NO"));
    }

    @Test
    public void testConsultaDescripcionPersona() {
        // Prueba el método de consulta 'describirPersona()'
        Persona nino = new Persona("Carlos", 10);
        Persona adolescente = new Persona("Maria", 16);
        Persona adulto = new Persona("Luis", 25);

        assertTrue(nino.describirPersona().contains("niño"));
        assertTrue(adolescente.describirPersona().contains("adolescente"));
        assertTrue(adulto.describirPersona().contains("adulto"));
    }

    @Test
    public void testCategoriaVotacion() {
        // Prueba métodos relacionados con la votación
        Persona votante = new Persona("Laura", 20);

        assertTrue(votante.puedeVotar());
        votante.votar();
        assertFalse(votante.puedeVotar());
    }
}
