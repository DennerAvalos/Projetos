import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o nome do produto? ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Qual o preço de custo do produto? ");
        double precoCusto = scanner.nextDouble();

        System.out.print("Qual a porcentagem de lucro? ");
        double porcentagemLucro = scanner.nextDouble();
        
        System.out.print("Qual o preco final de venda? ");

        double precoLucro = porcentagemLucro/100;
        
        double precoFinal;
        precoFinal =  precoCusto / (1 - precoLucro);

        System.out.println(" o Detergente que tem preco de custo 1.4 deve ser vendido por "+precoFinal);


        
    }}

        