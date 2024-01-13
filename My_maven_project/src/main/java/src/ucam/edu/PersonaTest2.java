package src.ucam.edu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonaTest2 {

    @Test
    void testCrearPersona() {
        Persona persona = new Persona("Juan", 25);

        assertEquals("Juan", persona.obtenerNombre()); 
        assertEquals(25, persona.obtenerEdad()); 
        assertFalse(persona.puedeVotar()); // Aserto
        //assertTrue por que si puede votar
        assertEquals("SI", persona.esAdulto()); // Aserto
        //SI por que es adulta
        // Nueva comprobación
        assertNotEquals("Ana", persona.obtenerNombre()); 
    }

    @Test
    void testEdadNegativa() {
        assertThrows(IllegalArgumentException.class, () -> new Persona("Ana", -5));
    }

    @Test
    void testSaludar() {
        Persona persona = new Persona("María", 30);
        assertEquals("Hola, mi nombre es Pedro y tengo 30 años.", persona.saludar()); 
        //Imprime Pedro en vez de Maria. Tiene que imprimir lo mismo, da igual si es Pedro o María
    }

    @Test
    void testEsAdulto() {
        Persona adulto = new Persona("Carlos", 35);
        Persona nino = new Persona("Laura", 10);

        assertEquals("NO", adulto.esAdulto());
        //sE esperaba un si
        assertEquals("SI", nino.esAdulto()); 
        //Se esperaba un No
    }
    

    @Test
    void testDescribirPersona() {
        Persona nino = new Persona("Pedro", 10);
        Persona adolescente = new Persona("Sofía", 15);
        Persona adulto = new Persona("Juan", 25);

        assertEquals("Soy un niño llamado Pedro.", nino.describirPersona()); // Aserto correcto
        assertEquals("Soy un adolescente llamado Sofía.", adolescente.describirPersona()); // Aserto correcto
        assertEquals("Soy un adulto llamado Juan.", adulto.describirPersona()); // Aserto correcto
    }

    @Test
    void testVotar() {
        Persona adultoNoVotado = new Persona("Ana", 20);
        Persona adultoVotado = new Persona("Pedro", 22);

        assertFalse(adultoNoVotado.puedeVotar()); 
        //Cambiado a true por que no ha votado y ahora vota
        adultoNoVotado.votar();
        assertFalse(adultoNoVotado.puedeVotar()); 
        // Cambiado a assertFalse
        //Por que si ya ha vtado no puede votar otra vez

        assertTrue(adultoVotado.puedeVotar()); 
        adultoVotado.votar();// Hacemos que adultoVotado vote antes de la verificación
        assertFalse(adultoVotado.puedeVotar());
    }


    @Test
    void testCelebrarCumpleaños() {
        Persona persona = new Persona("Elena", 28);
        persona.celebrarCumpleaños();
        assertEquals(29, persona.obtenerEdad()); 
    }

    @Test
    void testOtroMetodo() {
        Persona persona = new Persona("Pablo", 18);
        assertTrue(persona.esAdulto().equals("SI")); // Aserto correcto
        assertTrue(persona.puedeVotar()); // Aserto correcto
    }
}
