import java.util.Scanner;

public class Uni03Exe08 {
    
    //Entrada: valorDolar, cotacaoDolar
    //Saída: valorReal
    //Processo: valorReal = valorDolar * cotacaoDolar

    public static void main(String[] args) {

        Scanner d = new Scanner(System.in);
        System.err.print("Valor em dólar recebido pelo cliente:  ");
        float valorDolar = d.nextFloat();
        System.out.print("Cotação do dólar hoje:  ");
        float cotacaoDolar = (float) d.nextFloat();

        float valorReal = valorDolar * cotacaoDolar;

        System.out.print("O atendente deve devolver R$ "+ valorReal + " Para o cliente.");
        
    }
}
