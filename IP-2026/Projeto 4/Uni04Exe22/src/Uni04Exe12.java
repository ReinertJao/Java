import java.util.Scanner;

public class Uni04Exe12 {
    public static void main(String[] args) {

        Scanner p = new Scanner(System.in);

        System.out.println("1 - Ciência da Computação\n" + " 2 - Licenciatura da Computação\n " + " 3 - Sistemas de Informação");

        int opcao = p.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Bacharelado em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharelado em Sistemas de Informação");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
