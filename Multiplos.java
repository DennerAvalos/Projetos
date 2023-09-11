import java.util.Scanner;
public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, numero2;
        System.out.println("informe o primeiro numero:");
        numero = scanner.nextInt();

        System.out.println("informe o segundo numero:");
        numero2 = scanner.nextInt();
        
        if (numero % numero2 == 0){
        System.out.println(numero+ " é multiplo de " +numero2);}

         else if (numero % numero2 != 0){
            System.out.println(numero+" nao é multiplo de " +numero2+ ",porem "+ numero2+ " é multiplo de "+numero);
         }
        
        else {
        
            System.out.println(numero + " não é múltiplo de " + numero2 + " e " + numero2 + " também não é múltiplo de " + numero);
        }
       
    
}}
