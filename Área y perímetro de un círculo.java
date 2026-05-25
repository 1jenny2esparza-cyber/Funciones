import java.util.Scanner;

public class Main {

    // Función que calcula y devuelve el área
    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }

    // Función que calcula y devuelve el perímetro
    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);

        System.out.println("--- Resultados ---");
        System.out.printf("Área del círculo:      %.2f%n", area);
        System.out.printf("Perímetro del círculo: %.2f%n", perimetro);

        scanner.close();
    }
}