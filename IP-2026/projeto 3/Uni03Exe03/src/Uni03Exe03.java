import java.util.Scanner;

public class Uni03Exe03 {

    //Entrada: preçoLitro, pagamento
    //Saída: valorLitros 
    //Processo: totalLitro = pagamento / precoLitro
    //Fluxograma:


    public static void main(String[] args) {
       Scanner g = new Scanner(System.in); 
       System.out.print("Quantos reais você gosaria  de colocar: ");
       float pagamento = g.nextFloat();
           float totalLitro = pagamento / 6.26f;

       System.out.print("A quantidade de litros foi de " + totalLitro);
       g.close();
    
    }
}
