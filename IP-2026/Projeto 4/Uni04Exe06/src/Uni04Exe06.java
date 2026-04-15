import java.util.Scanner;

public class Uni04Exe06 {

    /*
    Entrada: sexo da pessoa
    Saida: se é masculi ou feminimo
    Processo: Receber a entrada e informar se é masculino ou femenino ou se não existe
    Fluxograma: 
    */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Qual seu sexo? ");
        String sexo = s.nextLine();

        if (sexo.equals("m")) {
            System.out.println("Masculino");
                       
        }else if (sexo.equals("f")) {
            System.out.println("Feminino");
                       
        }else if (sexo.equals("In")) {
            System.out.println("Não Informado");
        }else{
            System.out.println("Não Existe");
        }

    }
}
