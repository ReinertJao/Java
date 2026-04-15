import java.util.Scanner;

public class Uni04Exe24 {
    
    public static void main(String[] args) {
        
        Scanner p = new Scanner(System.in);

        System.out.println("Valor 1: ____ Valor 2: ____ Valor 3: ____ Opção: 1");
        
        int valor1 = p.nextInt();
        int valor2 = p.nextInt();
        int valor3 = p.nextInt(); 
        int num = p.nextInt();

        switch (num) {
            case 1:
                if (valor1 < valor2 && valor2 < valor3)                  
                System.out.println(num);
            break;
        case 2:
            if (valor1 > valor2 && valor2 > valor3) 
                System.out.println();
            break;
        case 3:
            if (valor1 < valor2 && valor2 >valor3)
                System.out.println();
            break;
        default:
            System.out.println("Erro");
            break;
        }
    }
}
