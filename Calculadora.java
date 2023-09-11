import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         
         System.out.println("informe um numero:");
         double numero = scanner.nextDouble();

         System.out.println("informe um numero:");
         double numero2 = scanner.nextDouble();

         System.out.println("digite um operador (+, -, *, / ou %):");
         char operador = scanner.next(). charAt(0);

         double resultado;

         if (operador == '+') {
             resultado = numero + numero2;
         } 
         else if (operador == '-') {
             resultado = numero - numero2;
         }
          else if (operador == '*') {
             resultado = numero * numero2;
         }
          else if (operador == '/') {
             resultado = numero / numero2;
         }
          
          else {
             System.out.println("Operador inválido!");
             return;
         }
         System.out.println(numero + " " + operador + " " + numero2 + " = " + resultado);
        
}}
