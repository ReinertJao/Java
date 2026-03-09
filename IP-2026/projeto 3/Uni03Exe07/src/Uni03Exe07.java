import java.util.Scanner;

public class Uni03Exe07 {

    //Entrada: refri01, refri02 e refri03
    //Saida: quanLitros
    //Processo: litrosRefri = refri01 + refri02 + refri03


    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Quantidade de 350ml:  ");
        float refri01 = r.nextFloat();
        System.out.print("Quantidade de 600ml:  ");
        float refri02 = r.nextFloat();
        System.out.print("Quantidade de 2L:  ");
        float refri03 = r.nextFloat();

        float quantidadeLitros = refri01 * 0.35f + refri02 * 0.60f + refri03 * 2.0f;

        System.out.print("O cliente comprou ao total " + quantidadeLitros + "Litros.");


        
    }
}
