import java.util.Scanner;

public class Uni03Exe12 {
    
    //Entrada: nomeFuncionario, quantHora, dependentes
    //Saída: nomeFunci, salarioBruto, salarioLiquido
    //Processo: salarioBruto = dependentes + quantHora
    //          SalarioLiquido = salarioBruto - 13.5%


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nome funcionario: ");
        String nomeFuncionario = s.next();
        System.out.print("Quantidades de horas trabalhadas: ");
        double quantHora = s.nextDouble();
        System.out.print("Quantidades de dependentes: ");
        double dependentes = s.nextDouble();

        double salarioBase = quantHora * 10;
        double salarioFamilia = dependentes * 60;

        double inss = salarioBase * 0.085;
        double ir = salarioBase * 0.05;

        double salarioBruto = salarioBase + salarioFamilia;
        double salarioLiquido = salarioBase - inss - ir;

        System.out.println(nomeFuncionario);
        System.out.println("Valor Bruto: " + salarioBruto);
        System.out.println("Valor Liquido: " + salarioLiquido);

        s.close();


        

        

    }
}
