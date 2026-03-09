import java.util.Scanner;

public class Uni03Exe09 {
    
    //Entrada: altura, raio²
    //Saída: volumeOleo
    //Processo: volumeOleo = raio² * altura * PI (3,14) 

    public static void main(String[] args) {

        Scanner v = new Scanner(System.in);
        System.out.print("Qual o valor do Raio: ");
        double raio = v.nextDouble();
        System.out.print("Qual a altura:  ");
        double altura = v.nextDouble();


        double volumeOleo = Math.pow(raio, 2) * altura * Math.PI;

        System.out.print("O volume da lata de óleo é: " + volumeOleo);

        v.close();
    
    }
}
