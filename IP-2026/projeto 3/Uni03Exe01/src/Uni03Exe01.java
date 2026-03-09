import java.util.Scanner;

public class Uni03Exe01 {

    // Análise: Sera considerado em metros
    // Entrada: largura, comprimento
    // Saída: area
    // Processo: area = largura * comprimento
    // fluxograma:  

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite as Largura(m):  ");
        // Print: Apenas imprime
        // PrintLn: IMprime e pula a linha
        float largura = leitor.nextFloat(); 
        System.out.print("Digite o comprimento(m): ");
        float comprimento = leitor.nextFloat();

        float area = largura * comprimento;

        System.out.println("Área =" + area + "m²");
        
        leitor.close();
    }
}
