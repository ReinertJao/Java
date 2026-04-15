import java.util.Scanner;

public class Uni04Exe14 {
    public static void main(String[] args) {
        
        Scanner d = new Scanner(System.in);

        System.out.print("Dia: ");
        int dia = d.nextInt();

        System.out.println("Mês: ");
        int mes = d.nextInt();

        System.out.println("Ano");
        int ano = d.nextInt();
    
        if (dia <= 31 && mes == 1 && ano <= 2026 ) {
            System.out.println("Valído");
        } else if (dia <= 28 && mes ==2 && ano <=2026) {
            System.out.println("Válido");
        } else {
            System.out.println("Não válido");
        }
        
    }
}
