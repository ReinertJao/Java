import java.util.Scanner;

public class Uni03Exe15 {
    
    //Entrada: numero
    //Saída: nCentena, nDezena, nUnidade
    //Processo: nCentena / 100, 
    //          ndezena  % 100 / 10, 
    //          nUnidade % 10



    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.print("Qual o numero você quer saber: ");
        int numero = n.nextInt();

        int nCentena = numero / 100;  // Int para aparecer apenas 1 numero.
        int nDezena = numero % 100 / 10;
        int nUnidade = numero % 10; 

        System.out.print(nCentena + " centena(s) " + nDezena + " dezena(s) " + nUnidade + " unidade(s)");

        


    }
}
