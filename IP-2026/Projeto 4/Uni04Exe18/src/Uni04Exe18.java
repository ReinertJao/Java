import java.util.Scanner;

public class Uni04Exe18 {
    public static void main(String[] args) {
        
        Scanner l = new Scanner(System.in);

        System.out.println("Dia do vencimento: 10 Dia do pagamento: _____ Valor da prestação: 100");

        double data = l.nextInt();

        double valor = l.nextDouble();
        valor = 100;

        if (data <= 9) {
            valor = valor - 0.02;
            System.out.println("O pagamento está em dia. O valor da prestação = R$" + valor);
        }else if (data == 10 ) {
            System.out.println("O pagamento está em dia");
        } else {
            data = Math.pow(valor, 0.2);
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$" + valor);
        }

    }
}
