import java.util.Scanner;
public class exercicio6_abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
       System.out.println("Digite um número: ");
        int nume = leitor.nextInt();
        
        boolean p = true;
        
        for (int i = 2; i < nume; i++) {
            if (nume % i == 0) {
                p = false;
                break;
            }
        }
        if (p) {
            System.out.println("Número primo.");
        }
        
        else {
            System.out.println("Não é primo.");
        }
       
       
    }
}
