import java.util.Scanner;
public class exercicio4_Abenza {
    public static void main(String[] args) {
    Scanner leitor=new Scanner(System.in);
        System.out.print("Escreva um número: ");
        int r=leitor.nextInt();
        int i;
        for(i=1; i<r; i++){
           if(r%i==0){
           System.out.println("Os divisores de "+ r+" é "+i);
           }
            
        }
      
        
}
}