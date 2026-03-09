import java.util.Scanner;

public class Uni03exe10 {
    
    //Entrada: catetoOposto, catetoAdjacente
    //Saída: hipotenusa
    //Processo: hipotenusa² = catetoOposto² + catetoAdjacente²
    //          hipotenusa = raiz quadrada (hipotenusa)


    public static void main(String[] args) {
        Scanner m  = new Scanner(System.in);
        System.out.print("Catetpo Oposto: ");
        double catetoOposto = m.nextDouble();
        System.out.print("Cateto Adjacente: ");
        double catetoAdjacente = m.nextDouble();

        double hip = (catetoOposto * catetoOposto) + Math.pow(catetoAdjacente, 2);  // Math.pow = O numero ao ² (Vezes ele mesmo)
        hip = Math.sqrt(hip);       // Math.sqrt = Sempre quando precisar puxar a raiz quadrada de um numero 

        System.out.print("Hipotenusa: " + hip);

        m.close();
        
    }
}
