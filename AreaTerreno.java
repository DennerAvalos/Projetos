import java.util.Scanner;

public class AreaTerreno {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a largura do terreno: ");
        int largura =  teclado.nextInt();

        System.out.println("informe o comprimento do terreno");
        int comprimento =  teclado.nextInt();
        
        int metro_quadrado =  largura * comprimento;
        System.out.println("o terreno "+largura+"x"+comprimento+" tem "+metro_quadrado+" metros quadrados");
    
}}
