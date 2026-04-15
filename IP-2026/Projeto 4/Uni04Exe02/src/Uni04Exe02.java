import java.util.Scanner;

public class Uni04Exe02 {

    /*
    Entrada: Numero
    Saída: Par ou Impar
    Proceso: dividir o numero por 2 se for 0 é par senão é impar 
    Fluxograma: 
    
    */
    
    public static void main(String[] args) {
        
        Scanner ip = new Scanner(System.in);

        int Num = ip.nextInt();

        if (Num % 2 == 0) {

            System.out.println("Seu numero é: Par");            
        }else{
            System.out.println("Seu numero é: Impar");
        }
        ip.close();
    }
}
