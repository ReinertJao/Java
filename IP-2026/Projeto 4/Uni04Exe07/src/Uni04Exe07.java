import java.util.Scanner;

public class Uni04Exe07 {
    
    public static void main(String[] args) {
        
        Scanner g = new Scanner(System.in);

        System.out.println("Qual o valor das gramas: ");
        double gramas = g.nextDouble();

        if (gramas <= 50) {

            System.out.println("O valor é: 0,45");
                        
        }else if (gramas >= 50) {
            double sobou = gramas - 50;
            double total = 0.45 + (sobou * 0.02); 

            System.out.println(" O valor é: " + total);
               
        }
    }
}
