import java.lang.Math;
import java.util.Scanner;
public class Questão02 {
    public static void main(String[]args){
        Double Distancia, A1, B2, C2, A2, B2, C2;
        Scanner Calculo = new scanner (System.in);
        System.out.println("O valor de A1 é: ");
        System.out.println("O valor de B1 é: ");
        System.out.println("O valor de C1 é: ");
        System.out.println("O valor de A2 é: ");
        System.out.println("O valor de B2 é: ");
        System.out.println("O valor de C2 é: ");

        A1 = Distancia.nextDouble();
        B1 = Distancia.nextDouble();
        C1 = Distancia.nextDouble();
        A2 = Distancia.nextDouble();
        B2 = Distancia.nextDouble();
        C2 = Distancia.nextDouble();

        Distancia = Math.sqrt(Math.pow((A2-A1),2)+ Math.pow((B2-B1),2)+ Math.pow((C2-C1),2));
        Sytem.out.printf("A Distancia entre os dois pontos é: %f" Distancia,); 
    }
}