package src.ucam.edu;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestPartitionNM {

    @Test
    public void testMetodoQueNoCambiaEstado1() {
    	Persona persona = new Persona("Ejemplo", 30);

        // Llamar a un método que no cambia el estado
        String saludo = persona.saludar();

        // Verificar que el estado no cambió
        assertTrue(saludo.equals("Hola, mi nombre es Ejemplo y tengo 30 años."));
    }
    

   
}

