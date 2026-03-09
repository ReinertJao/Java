import java.util.Scanner;

public class Uni03Exe05 {

    //Entrada: numeroGalinha
    //Salida: valorGasto
    //Proceso: gastoTotal = numeroGalinha * 4
    // Alimentação = numeroGalinha * 7

    public static void main(String[] args) {

        Scanner g = new Scanner(System.in);
        System.out.print("Digite o número de galinhas Identificadas:  ");
        float numeroGalinha = g.nextFloat();
        System.out.print("Digite o numero de galinhas Alimentadas: ");
        float numeroAlimentada = g.nextFloat();  
        
        float gastoTotal = numeroGalinha * 4;
        float gastoAlimentaçao = numeroAlimentada * 7;
        float gastoFinal = gastoTotal + gastoAlimentaçao;

        System.out.println("O gasto total para marcar " + numeroGalinha + " é " + gastoTotal);
        System.out.println("O gasto total para marcar " + numeroAlimentada + " é " + gastoAlimentaçao);
        
    }
}
