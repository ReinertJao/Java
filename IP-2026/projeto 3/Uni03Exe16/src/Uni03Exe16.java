import java.util.Scanner;

public class Uni03Exe16 {
    
    //Entrada: valorCompra, valorPago 
    //Saída: numeroNota
    //Processo: nDezena /100, nCezena % 100 / 10, nUnidade % 10


    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Insira o valor da compra: ");
        int valorCompra = t.nextInt();
        System.out.print("Digite quanto cliente pagou: ");
        int valorPago = t.nextInt();

        int numeroNota = valorCompra - valorPago; 
        int nDezena = numeroNota / -100 ;
        int nCezena = numeroNota % 100 / -10 ;
        int nUnidade = numeroNota % 10 / -1;


        System.out.println("Quantidade de notas de 100 necessárias é: " + nDezena);
        System.out.println("Quantidade de notas de 10 necessárias é: " + nCezena);
        System.out.println("Qunatidade de notas de 1 necessárias é: " + nUnidade);

        t.close();
    }
}
