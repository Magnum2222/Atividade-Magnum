import java.lag.Math;
import java.util.Scanner;

public class Questão01 {
   public static void main (String[]args){
       double N1, N2, A, B, C, D;
       Scanner Calculo = new scannner(System.in);

       System.out.println("O valor de A é: ");
       System.out.println("O valor de B é; ");
       System.out.println("O valor de C é: ");
       A = Calculo.nextDouble ();
       B = Calculo.nextDouble ();
       C = Calculo.nextDouble ();
    
       D = Math.pow(B,2)-4*A*C;
       if(D>=0) {
           N1 = (-B + Math.sqrt(D))/2*A;
           N2 = (-B - Math.sqrt(D))/2*A;
           System.out.printf("Raiz da equação é 1=%.1f \n",N1);
           System.out.printf("RAIZ da equação é 1=%.1f \n",N2);
       }    else{  System.out.println("Equação sem Raiz!");


       }



   }  
    
}