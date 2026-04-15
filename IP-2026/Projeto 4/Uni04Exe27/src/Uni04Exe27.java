import java.util.Scanner;

public class Uni04Exe27 {

    /*
    horaChegada: 13 minChegada: 10 horasSaida: 13 minSaida: 22
    */
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);

        System.out.println("horaChegada:_______ minChegada:____ \n" + "horasSaida:______ minSaida:______");
        
    int horaChegada = t.nextInt();
   int minChegada = t.nextInt();
   
   int horasSaida = t.nextInt();
   int minSaida = t.nextInt();
   
   
   int saida = t.nextInt();



   switch (saida) {
            case 01:
                minChegada = minChegada / 100;
                int hora01 = horaChegada + minChegada;

                minSaida = minSaida / 100;
                int hora02 = horasSaida + minSaida;

                int fim = hora01 - hora02;
                if (fim <= 2) {
                    System.out.println("Preço cobrado = R$ 5,00");
                }else if (fim <= 4) {
                    System.out.println("Preço cobrado = R$ 10,00");
                } else {
                    System.out.println("Preço cobrado = 35,00");
                }

                break;
        
            default:
                break;
        }
    }
}
