import java.util.Scanner;

public class Estaçoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o dia: ");
        int dia = scanner.nextInt();
        System.out.print("Informe o mês: ");
        int mes = scanner.nextInt();
        System.out.print("Informe o ano: ");
        int ano = scanner.nextInt();
        
             if ((mes== 12 && dia >= 21) ||mes == 1 || mes == 2 ||(mes == 3 && dia <= 20)){
            System.out.println("Verão");
        }   
        else if ((mes == 3 && dia >= 21) || mes == 4 || mes == 5 || (mes == 6 && dia < 21) ){
            System.out.println("Outono");
        }
        else if ((mes == 6 && dia >= 21) || mes == 7 || mes == 8 || (mes == 9 && dia <= 23)){
            System.out.println("Inverno");
        }
        else if ((mes ==  9 && dia >= 23) || mes == 10 || mes == 11 || (mes == 12 && dia <= 21)){
            System.out.println("Primavera");
        }   
        }}

        
    