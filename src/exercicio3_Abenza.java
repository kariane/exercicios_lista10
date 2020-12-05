import java.util.Scanner;
public class exercicio3_Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        int i, num = 0;
        for( i=1; i<10; i++){
            System.out.println("Escreva um número: ");
            num+=leitor.nextInt();
            
            System.out.println("A soma destes números é:"+ num);
        }
        
    }
}
