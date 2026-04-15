import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni04Exe26 {
    public static void main(String[] args) {

        DecimalFormat nort = new DecimalFormat("0.00");
        Scanner c = new Scanner(System.in);

        System.out.println("se opção = 'T': calcular a área de um triângulo de base ser altura h\r\n" + //
                "se opção = 'Q': calcular a área de um quadrado de lado l\r\n" + //
                "se opção = 'R': calcular a área de um retângulo de base ser altura h\r\n" + //
                "se opção = 'C': calcular a área de um círculo de raio r\r\n");

        char valor = c.nextLine().toUpperCase().charAt(0);
        /* toUpperCase: letras minusculas para MAIUSCULAS
            charAt: troca o numeros por letras
            char: chama as letras ao inves dos numeros
        */

        switch (valor) {
            case 'T':
                int base = c.nextInt();
                int altura = c.nextInt();

                System.out.println(base);
                break;
            case 'Q':
                int quadrado = c.nextInt();
                double quavalo = Math.pow(quadrado, 2);
                System.out.println((int)quavalo);
                break;
            case 'R':
                int base02 = c.nextInt();
                int altura02 = c.nextInt();

                int retangulo = base02 * altura02;

                System.out.println(retangulo);
                break;
            case 'C':
                
                int raio = c.nextInt();

                double valRaio = (Math.pow(raio, 2)) * 3.14159f;

                System.out.println(nort.format(valRaio));
                break;

            default:
                break;
        }

    }
}
