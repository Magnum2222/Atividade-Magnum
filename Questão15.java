import java.util.Scanner;

public class Questão15 {
    public static void main(String[] args){

        double Media, Nota1, Nota2, Nota3;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nota 1: ");
        Nota1 = leitor.nextInt();
        System.out.println("Nota 2: ");
        Nota2 = leitor.nextInt();
        System.out.println("Nota 3: ");
        Nota3 = leitor.nextInt();
        media = (Nota1+Nota2+Nota3)/3;

        if(Media > 6){
            System.out.println("Aprovado!");
        }else if(Media>=4 && Media <= 6){
            System.out.println("Verificação Suplementar!");
        }else{
            System.out.println("Reprovado!");           
        }
    }
}
// Metodo utilizado: Foi necessario importar o Scanner para a operação estar de acordo, após isso um simples calculo aritmetico
