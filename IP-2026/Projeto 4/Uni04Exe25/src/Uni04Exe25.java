import java.util.Scanner;

public class Uni04Exe25 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" Escolha uma opção:\r\n" + //
                "1 - Soma de dois números.\r\n" + //
                "2 - Diferença entre dois números.\r\n" + //
                "3 - Produto entre dois números.\r\n" + //
                "4 - Divisão entre dois números (o denominador não pode ser zero)");

        int opcao = s.nextInt();

        int valor1 = s.nextInt();
        int valor2 = s.nextInt();

        switch (opcao) {
            case 1:
                int op1 = valor1 + valor2;
                System.out.println(op1);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                break;
        }

    }
}
