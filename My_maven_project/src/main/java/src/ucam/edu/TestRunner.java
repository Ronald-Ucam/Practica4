package src.ucam.edu;

public class TestRunner {
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        runner.runTests();
    }

    public void runTests() {
        // Prueba 1: Verificar que se crea una persona correctamente
        System.out.println("Prueba 1:");
        pruebaCrearPersona();

        // Prueba 2: Verificar el método votar
        System.out.println("\nPrueba 2:");
        pruebaVotar();
    }

    private void pruebaCrearPersona() {
        try {
            Persona persona = new Persona("Juan", 25);
            System.out.println("Persona creada correctamente: " + persona.obtenerNombre());
        } catch (Exception e) {
            System.out.println("Error al crear la persona: " + e.getMessage());
        }
    }

    private void pruebaVotar() {
        try {
            Persona persona = new Persona("Ana", 20);
            System.out.println("¿Puede votar?: " + persona.puedeVotar());
            persona.votar();
            System.out.println("¿Puede votar después de votar?: " + persona.puedeVotar());
        } catch (Exception e) {
            System.out.println("Error al realizar la prueba de votar: " + e.getMessage());
        }
    }
}
