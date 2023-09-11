import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o grau de temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273;

        System.out.printf("%.1f graus Celsius equivale a %.1f graus Fahrenheit e %.1f graus Kelvin%n", celsius, fahrenheit, kelvin);

        scanner.close();
    }
}

