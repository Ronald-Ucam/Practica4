package src.ucam.edu;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestPartitionM {
    
    @Test
    public void testMetodoQueCambiaEstado1() {
    	 // Crear una instancia de Persona
        Persona persona = new Persona("Ejemplo", 20);

        // Llamar al método que cambia el estado
        persona.votar();

        // Verificar si el estado cambió correctamente
        assertTrue(persona.haVotado);
    }

    @Test
    public void testMetodoQueCambiaEstado2() {
    	Persona persona = new Persona("Otro Ejemplo", 25);

        // Llamar a otro método que cambia el estado
        persona.celebrarCumpleaños();

        // Verificar si el estado cambió correctamente
        assertTrue(persona.obtenerEdad() == 26); 
    }
}
