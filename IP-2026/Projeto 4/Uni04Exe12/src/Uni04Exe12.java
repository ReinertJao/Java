import java.util.Scanner;

public class Uni04Exe12 {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        int lado1 = t.nextInt();
        int lado2 = t.nextInt();
        int lado3 = t.nextInt();

        if (lado1 + lado2 > lado3 &&
                lado1 + lado3 > lado2 &&
                lado2 + lado3 > lado1) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("É isóceles");
            } else {
                System.out.println("É escaleno");
            }
        } else {
            System.out.println("Não formam um triangulo");
        }
    }
}
