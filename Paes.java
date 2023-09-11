import java.util.Scanner;

public class Paes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paes;
        double custo = 0; 
        
        System.out.println("Quantos pães deseja?");
        paes = scanner.nextInt();

       if (paes <= 12){
        custo = 0.20 * paes;
       }
        
       if (paes > 12){
        custo = 0.15 * paes;

       } 
        System.out.println(paes + " pães custará $" + custo);


        
        
    }
    
}
