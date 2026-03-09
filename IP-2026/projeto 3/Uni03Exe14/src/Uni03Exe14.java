import java.util.Scanner;

public class Uni03Exe14 {

    // Entrada: distancia, tempo
    // Saída: velocidade e litros
    // Processo: distancia / 12
    // velocidade = distancia / tempo
    //

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("Distancia: ");
        Double distancia = v.nextDouble();
        System.out.print("Tempo: ");
        Double tempo = v.nextDouble();

        double litros = distancia / 12.0;
        double km = distancia / tempo;

        System.out.print("A velocidade média foi de " + km + " km/hea. A quantidade de combustível usado foi de "
                + litros + " litros.");

        v.close();

    }

}
