import java.util.Scanner;

public class Uni04Exe03 {
    
    public static void main(String[] args) {
        
        Scanner m = new Scanner(System.in);

        int numero1 = m.nextInt();
        int numero2 = m.nextInt();

        if (numero1 > numero2) {

            System.out.println("O valor " + numero1  + " é maior que o valor de " + numero2 );                        
        }else{
            System.out.println("O valor " + numero2 + " é maior que o valor de " + numero1);
        }

    }
}
