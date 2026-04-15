import java.util.Scanner;

public class Uni04Exe13 {

    /*
     * Entrada: carta boas na mão
     * Saída: Truco, seis, nove
     * Processo:
     */
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("Cartas da mão: ");

        int c1 = t.nextInt();
        int c2 = t.nextInt();
        int c3 = t.nextInt();

        if (c1 == 1 && c2 == 2 && c3 == 3) {
            System.out.println("Nove");
        } else if (c1 <= 3 && c2 <= 3) {
            System.out.println("Seis");
        } else if (c1 <= 3) {
            System.out.println("Truco");
        } else {
            System.out.println("-");
        }
    }
}
