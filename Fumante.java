import java.util.Scanner;

public class Fumante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o nome do fumante? ");
        String nome = scanner.nextLine();

        System.out.print("Quantos anos " + nome + " fumou? ");
        int anosFumados = scanner.nextInt();

        System.out.print("Qual a quantidade média de cigarros por dia? ");
        int cigarrosPorDia = scanner.nextInt();

        System.out.print("Qual o preço médio de cada carteira? ");
        double precoCarteira = scanner.nextDouble();

        scanner.close();

        int diasPorAno = 365;
        int cigarrosPorCarteira = 20;
        double valorGastoPorCigarro = precoCarteira / cigarrosPorCarteira;

        int totalCigarros = anosFumados * diasPorAno * cigarrosPorDia;
        double totalGasto = totalCigarros * valorGastoPorCigarro;

        System.out.println(nome + " já gastou um total de " + String.format("%.2f", totalGasto) + " reais.");
    }
}
