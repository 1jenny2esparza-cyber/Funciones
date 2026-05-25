import java.util.Scanner;

public class Main {

    // Función que devuelve true o false según si puede votar
    public static boolean puedeVotar(int edad) {
        return edad >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad al usuario
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Llamar a la función y mostrar resultado
        if (puedeVotar(edad)) {
            System.out.println("✔ La persona SÍ puede votar.");
        } else {
            System.out.println("✘ La persona NO puede votar.");
        }

        scanner.close();
    }
}