import java.util.Scanner;

public class Uni04Exe08 {
    public static void main(String[] args) {
        
        Scanner v = new Scanner(System.in);

        System.out.println("Digite a sua letra: ");
        String vogal = v.next();
        vogal = vogal.toLowerCase(); // Vai deixar as letras em minusculas
        char vogalis = vogal.charAt(0); // vai sempre pegar a primeira letra

        if (vogalis == 'a' || /*OU */ vogalis == 'e' || /*OU*/ vogalis == 'i' || /*OU*/ vogalis == 'o' || /*OU*/ vogalis == 'u'){
            System.out.println("É vogal");            
        }else{
            System.out.println("Não é vogal");
        }

    }
}
