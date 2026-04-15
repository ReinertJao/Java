import java.util.Scanner;

public class Uni04Exe05 {

    /*
    Entrada: Sim ou Não
    Saída: Verdadeiro ou falso
    Processo: Se o céu for Sim, retorna verdadeiro caso contratario retora falso
    Fluxograma: 
    
    */
    
    public static void main(String[] args) {
        
        Scanner p = new Scanner(System.in);

        System.out.println("O céu é Azul ");
        String ceu = p.next();

        if (ceu.equalsIgnoreCase("sim") ) { // equalslgnoreCase: precisa que a resposta seja correta 

            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }
        p.close();
    }
}
