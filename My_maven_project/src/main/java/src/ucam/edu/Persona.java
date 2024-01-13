package src.ucam.edu;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    boolean haVotado;

    public Persona(String nombre, int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.nombre = nombre;
        this.edad = edad;
        this.haVotado = false;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String saludar() {
        return "Hola, mi nombre es " + nombre + " y tengo " + edad + " años.";
    }

    public String esAdulto() {
        return edad >= 18 ? "SI" : "NO";
    }

    public String describirPersona() {
        if (edad < 12) {
            return "Soy un niño llamado " + nombre + ".";
        } else if (edad < 18) {
            return "Soy un adolescente llamado " + nombre + ".";
        } else {
            return "Soy un adulto llamado " + nombre + ".";
        }
    }

    public boolean puedeVotar() {
        return edad >= 18 && !haVotado;
    }

    public void votar() {
        if (puedeVotar()) {
            System.out.println(nombre + " ha votado.");
            haVotado = true;
        } else {
            System.out.println(nombre + " no puede votar o ya ha votado.");
            haVotado = false;  // Actualiza el estado de haVotado a false si no puede votar
        }
    }


    public void celebrarCumpleaños() {
        edad++;
        System.out.println(nombre + " ha celebrado su cumpleaños. Ahora tiene " + edad + " años.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();

        // Bucle do-while para permitir al usuario ingresar información sobre nuevas personas
        do {
            System.out.print("Ingrese el nombre de la persona (o 'fin' para terminar): ");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Ingrese la edad de la persona: ");
            int edad = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea pendiente después de nextInt()

            personas.add(new Persona(nombre, edad));
        } while (true);

        // Imprimir información sobre cada persona en el ArrayList
        for (Persona persona : personas) {
            System.out.println(persona.saludar());
            System.out.println("Es adulto: " + persona.esAdulto());
            System.out.println("Descripción: " + persona.describirPersona());
            System.out.println("¿Puede votar?: " + persona.puedeVotar());
            persona.votar();  // Ejemplo de uso del método votar
            persona.celebrarCumpleaños();  // Ejemplo de uso del método celebrarCumpleaños
            System.out.println();
        }

        scanner.close();
    }
}
