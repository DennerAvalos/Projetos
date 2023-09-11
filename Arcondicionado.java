import java.util.Scanner;

public class Arcondicionado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o mês de referência? ");
        String mesReferencia = scanner.nextLine();

        System.out.print("Qual o total de kwh foi consumido em " + mesReferencia + "? ");
        double consumoMensalTotal = scanner.nextDouble();

        System.out.print("Qual o consumo em kwh por mês do ar condicionado? ");
        double consumoArCondicionado = scanner.nextDouble();

        System.out.print("Quanto tempo ele fica ligado diariamente? ");
        double tempoDiario = scanner.nextDouble();

        System.out.print("Quantos dias do mês ele ficou ligado? ");
        int diasLigado = scanner.nextInt();

        System.out.print("Qual a tarifa de energia por kwh? ");
        double tarifaEnergia = scanner.nextDouble();

        scanner.close();

        int diasNoMes = 30;
        double consumoArCondicionadoMensal = consumoArCondicionado * (diasLigado / (double) diasNoMes);

        double custoArCondicionado = consumoArCondicionadoMensal * tempoDiario * tarifaEnergia;
        double porcentagemNaConta = (custoArCondicionado / consumoMensalTotal) * 100;

        System.out.println("Em " + mesReferencia + " o ar condicionado consumiu " +
                           consumoArCondicionadoMensal + " kwh p mês, totalizando " +
                           String.format("%.2f", custoArCondicionado) + " reais. Equivalente a " +
                           String.format("%.2f", porcentagemNaConta) + "% do total de " +
                           String.format("%.2f", consumoMensalTotal) + " reais de conta.");
    }
}
