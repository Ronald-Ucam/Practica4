package src.ucam.edu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonaTest3 {

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Configuración inicial antes de todas las pruebas en la clase");
    }

    @Before
    public void setUp() {
        System.out.println("Configuración inicial antes de cada prueba");
    }

    @Test
    public void pruebaVotar() {
        Persona adultoNoVotado = new Persona("Ana", 20);
        assertTrue(adultoNoVotado.puedeVotar());
        adultoNoVotado.votar();
        assertFalse(adultoNoVotado.puedeVotar());
    }

    @After
    public void tearDown() {
        System.out.println("Limpieza después de cada prueba");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Limpieza después de todas las pruebas en la clase");
    }

    @Ignore
    @Test
    public void pruebaIgnorada() {
        System.out.println("Esta prueba será ignorada");
    }
}
