import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni04Exe01 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner h = new Scanner(System.in);

        DecimalFormat s = new DecimalFormat("0.00");

        System.out.print("Horas trabalhadas no mês: ");
        float hotasTrabalhadas = h.nextFloat();

        System.out.print("Valor pago por hora: ");
        float valorHora = h.nextFloat();
         int horaMes = 160;

        float salario = (hotasTrabalhadas * valorHora);

        if ( hotasTrabalhadas > horaMes) {

            float horaExtra =  (hotasTrabalhadas - horaMes);
            float valorExtra =  (horaExtra * (valorHora * 0.5f));
            salario += valorExtra;            
        }
     
        System.out.println("Seu salário é: " + salario);
    h.close();
    }
}
