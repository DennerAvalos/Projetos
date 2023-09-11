import java.util.Scanner;

public class Cobre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos kg de latão deseja produzir? ");
        double quantidadeLatao = scanner.nextDouble();

        scanner.close();

        double percentualCobre = 0.7;
        double percentualZinco = 0.3;

        double quantidadeCobre = quantidadeLatao * percentualCobre;
        double quantidadeZinco = quantidadeLatao * percentualZinco;

        System.out.println("Para " + quantidadeLatao + " kg de latão será necessário " +
                           quantidadeCobre + " kg de cobre e " +
                           quantidadeZinco + " kg de zinco.");
    }
}
