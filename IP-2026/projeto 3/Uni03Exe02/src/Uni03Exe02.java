import java.util.Scanner;

public class Uni03Exe02 {

    // Ánalise: Será o valor em reais
    // Entrada: valorProduto
    // Saída: valorFinal
    // Processo: valorDesconto = valorProduto * 0,12
    // valorFinal = valorProduto - valorDeconto
    // Fluxograma:

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Valor do Produto R$ ");
        float valorProduto = s.nextFloat();

        float valorDesconto = valorProduto * 0.12f;
        float valorFinal = valorProduto - valorDesconto;

        System.out.println("O valor do desconto é de R$ " + valorDesconto);
        System.out.println("O preço do par de sapatos com desconto é R$ " + valorFinal);
        s.close();
    }
}
