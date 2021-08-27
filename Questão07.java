
import java.util.Scanner;
public class Questão07 {
    public static void main(String[] args) {
        Scanner Calcular = new Scanner(System.in); 
        int Programa;  
        do { 
            System.out.print("Informe o código: "); 
            Programa = Calcular.nextInt();
            if(Programa != -1){      
                System.out.println("Código: " + Programa); 
            }
            
        } while (Programa != -1);
        Calcular.close();
    }

}
/* A opção correta é a primeira solução, há alguns metodos para resolver, podendo utilizar o if ou até o while.*/

Scanner Calculador = new Scanner(System.in); 
        int Programa; 
         
        System.out.println("Informe o código: "); 
        Programa = Calculador.nextInt(); 
        while (Programa != -1) { 
            System.out.println("Código: " + Programa); 
            System.out.println("Informe o código: "); 
            Programa = Calculador.nextInt();
        }