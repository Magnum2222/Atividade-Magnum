import java.util.Scanner;
import java.lang.Math;

public class Questão03 {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in); 
        double x1, y1, x2, y2, distancia;

   
        System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
        x1 = teclado.nextFloat();
        y1 = teclado.nextFloat();
        x2 = teclado.nextFloat();
        y2 = teclado.nextFloat();
    teclado.close();

    distancia = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), (double)1/2);
    System.out.println("A distância é: " + distancia);

    // O problema desse programa, ocorreu pelo motivo da operação aritmetica conter uma divisão inteira de 1/2, levando a uma resposta que não deveria.
}

}