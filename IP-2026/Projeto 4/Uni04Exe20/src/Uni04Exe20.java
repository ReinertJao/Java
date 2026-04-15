import java.util.Scanner;

public class Uni04Exe20 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        // A média de aproveitamento foi: 8.14. Conceito: B. Aprovado
        /*
         * >= 9,0 UM
         * >= 7,5 e < 9,0 B
         * >= 6,0 e < 7,5 C
         * >= 4,0 e < 6,0 D
         * < 4,0 E
         */

        double nt1 = n.nextDouble();
        double nt2 = n.nextDouble();
        double nt3 = n.nextDouble();
        double nt4 = n.nextDouble();

        double semiFim = nt1 + nt2 + nt3 + nt4;
        double totalFim = semiFim / 3;

        if (totalFim >= 9.0) {
            System.out.println("A média de aproveitamento foi de " + totalFim + ". Conceito: UM. Aporvado🥳");
        } else if (totalFim >= 7.5 && totalFim < 9.0) {
            System.out.println("A média de aproveitamento foi de " + totalFim + ". Conceito B. Aprovado🥳");
        }else if (totalFim >= 6.0 && totalFim < 7.5) {
            System.out.println("A média de aproveitamento foi de " + totalFim + ". Conceito C. Aprovado🥳");
        }else if (totalFim >= 4.0 && totalFim < 6.0) {
            System.out.println("A média de aproveitamento foi de " + totalFim + ". Conceito: D. Reprovado😢");
        }else if (totalFim < 4.0) {
            System.out.println("A média de aproveitamento foi de " + totalFim + ". Conceito: E. Reprovado😢");
        } else {
            System.out.println("Essa nota não existe");
        }

    }
}
