import java.util.Scanner;

public class Uni04Exe04 {

    /*
    Entrada: numero com ponto fluento ou não
    Saída: Se possui casa decimal ou nn
    Processo: caso possua casa decimal é true caso não possua é false
    Fluxograma: 
    */
    
    public static void main(String[] args) {

        Scanner p = new Scanner(System.in);

        double numero = p.nextDouble();

        if (numero != 0.00) {

            System.out.println("Casas decimais foram digitadas");
            
        }else{
            System.out.println("Casas decimais não foram digitadas");
        }
        
    }
}
