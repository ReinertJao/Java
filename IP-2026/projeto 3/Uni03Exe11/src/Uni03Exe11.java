import java.util.Scanner;

public class Uni03Exe11 {
    
    //Entrada: graus
    //Saída: fahrenheit
    //Processo:  fahrenheit = graus * 9 / 5 + 32 
    //          

    public static void main(String[] args) {
      
        Scanner g = new Scanner(System.in);
        System.out.print("Quantos C°: ");
        double graus = g.nextDouble();

        double fahrenheit = graus * 9 / 5 + 32;

        System.out.print("O valor em fahreneit é: " + fahrenheit);

      
    }
}
