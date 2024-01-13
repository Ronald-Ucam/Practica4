package src.ucam.edu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    void testCreacionPersona() {
        // Prueba la creación de la persona
        Persona persona = new Persona("Juan", 25);
        assertEquals("Juan", persona.obtenerNombre());
        assertEquals(25, persona.obtenerEdad());
    }

    @Test
    void testEdadNegativa() {
        // Prueba si se lanza una excepción para edades negativas
        assertThrows(IllegalArgumentException.class, () -> new Persona("Ana", -5));
    }

    @Test
    void testSaludar() {
        // Prueba el método saludar
        Persona persona = new Persona("María", 30);
        assertEquals("Hola, mi nombre es María y tengo 30 años.", persona.saludar());
    }

    @Test
    void testEsAdulto() {
        // Prueba el método esAdulto
        Persona adulto = new Persona("Carlos", 35);
        Persona nino = new Persona("Laura", 10);

        // Asertos correctos
        assertEquals("SI", adulto.esAdulto());
        assertEquals("NO", nino.esAdulto());
    }
}
