package src.ucam.edu;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestAtributoEdad {
    
    @Test
    public void testIncrementoEdadEnCelebrarCumpleaños() {
        // Crear una persona con una edad específica
        Persona persona = new Persona("Ejemplo", 25);
        
        // Llamar al método que incrementa la edad al celebrar el cumpleaños
        persona.celebrarCumpleaños();
        
        // Verificar que la edad ha aumentado
        assertTrue(persona.obtenerEdad() == 26);
    }

    @Test
    public void testEsAdultoDespuesDeVotar() {
        // Crear una persona menor de edad
        Persona persona = new Persona("Ejemplo", 17);
        
        // Llamar al método de votar que cambia el estado de "haVotado"
        persona.votar();
        
        // Verificar que, después de votar, la persona es considerada adulta
        assertTrue(persona.esAdulto().equals("SI"));
    }
}
