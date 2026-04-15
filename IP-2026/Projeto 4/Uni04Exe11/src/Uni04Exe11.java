import java.util.Scanner;

public class Uni04Exe11 {

    /*
    Entrada: Idade dos irmão
    Saída: Se são gemios ou trigemios 
    Processo: Comparar se a idade são iguais
    */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        int irmao1 = i.nextInt();
        int irmao2 = i.nextInt();
        int irmao3 = i.nextInt();

        if (irmao1 == irmao3) {
            System.out.println("TRIGÊMEOS");
        }else if (irmao1 == irmao2) {
            System.out.println("GÊMEOS");
        }else{
            System.out.println("APENAS IRMÃO");
        }
    {
        }
    }
}

