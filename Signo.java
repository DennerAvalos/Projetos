import java.util.Scanner;

public class Signo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome ?");
        String nome = scanner.nextLine();
        System.out.print("Informe o dia: ");
        int dia = scanner.nextInt();
        System.out.print("Informe o mês: ");
        int mes = scanner.nextInt();
        System.out.print("Informe o ano: ");
        int ano = scanner.nextInt();

        String resultado;
        resultado = "";
        if((mes == 3 && dia >=21) || (mes == 4 && dia <= 19)){
             resultado =("Áries");
        }
        else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <=20)){
             resultado =("Touro");
        }
        else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <=21)){
             resultado =("Gêmeos");
        }
        else if ((mes == 6 && dia >=22) || (mes == 7 && dia <=22)){
             resultado =("Cãncer");
        }
        else if ((mes == 7 && dia >=23) || (mes == 8 && dia <=22)){
             resultado =("Leão");
        }
        else if ((mes == 8 && dia >=23) || (mes == 9 && dia <= 22)){
             resultado =("Virgem");
        }
        else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)){
             resultado =("Libra");
        }
        else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)){
             resultado =("Escorpião");
        }
        else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)){
             resultado =("Sagitário");
        }
        else if ((mes == 12 && dia >= 22) ||(mes == 1 && dia <= 19)){
             resultado =("Capricórnio");
        }
        else if ((mes == 1 && dia >=20) || (mes == 2 && dia <= 18)){
             resultado =("Aquário");
        }
        else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)){
             resultado =("Peixes");
        }    
        System.out.println(nome + " é do signo de "+resultado);
        }
         

    }
    

