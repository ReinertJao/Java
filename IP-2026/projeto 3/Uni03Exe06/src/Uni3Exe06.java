import java.util.Scanner;

public class Uni3Exe06 {

    //Entrada: kilosPrato
    //Saída: valorPrato
    //Processo: kilosLimpo = KilosPrato - 0.75
    //           valorPrato = kilosLimpo * 25
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Qunatos kilos deu seu prato: ");
        Double kilosPrato = k.nextDouble();

        double kiloLimpo = kilosPrato - 0.75;
        double valorPrato = kiloLimpo * 25;

        System.out.print("O valor do pratro do cliente é R$ " + valorPrato);

        k.close();
        

        
    }
}
