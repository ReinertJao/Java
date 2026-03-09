import java.util.Scanner;

public class Uni03Exe13 {
    
    //Entrada: altura , comprimento
    //Saída: valorGasto
    //Processo: metro = altura * comprimento
    //          azulejos = metro * 9
    //          valorGasto = azulejos * 12.50

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Altura: ");
        double altura = a.nextDouble();
        System.out.print("Comprimento: ");
        Double comprimento = a.nextDouble();
        
        Double metro = altura * comprimento;
        double azulejos = metro * 9;
        double valorGasto = azulejos * 12.50;

        System.out.print("Valor Gasto R$: " + valorGasto);
        a.close();
    }
}
