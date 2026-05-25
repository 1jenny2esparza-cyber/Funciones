import java.util.Scanner;

public class Main {

    // Función que determina si una cadena es palíndromo
    public static boolean esPalindromo(String cadena) {
        // Convertir a minúsculas para comparar sin importar mayúsculas
        String original = cadena.toLowerCase();
        String invertida = new StringBuilder(original).reverse().toString();
        return original.equals(invertida);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cadena al usuario
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();

        // Llamar a la función y mostrar resultado
        if (esPalindromo(texto)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }

        scanner.close();
    }
}