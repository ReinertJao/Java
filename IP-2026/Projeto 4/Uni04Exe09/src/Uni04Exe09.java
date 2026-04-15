import java.util.Scanner;

public class Uni04Exe09 {

    /*
    Entrada: num1 e num2 
    Saída: Se é inteiro ou não
    Processo: num1 / num2 = resultado com virgula não é interiro
    */
    public static void main(String[] args) {
        
        Scanner i = new Scanner(System.in);

        int num1 = i.nextInt();
        int num2 = i.nextInt();

        if (num1 % num2 == 0 ){ // O valor que sobrar da divisão do numero 1 / 2 precisar ser igual a 0 
            System.out.println("Os valores são múltiplos");
           
        }else{
            System.out.println("Os valores não são múltiplos");
        }
     
    }
}
