import java.util.Scanner;
public class Questão10{
    public static void main(String[] args){
        Scanner Calculador = new Scanner(System.in);
        double investimento, juro_mensal, Total_valor = 0;
        String Resultado;
        System.out.printf("Valor do investimento: ");
        investimento = Calculador.nextDouble();
        System.out.printf("Valor do juros: ");
        juro = Calculador.nextDouble();
        do{
            for(int i = 1; i <= 12; i++){

                investimento = investimento+(investimento*juro_mensal)/100;
                Total_valor = Total_valor + investimento;

            }
            System.out.printf("\nValor depois de um ano: %f", Total_valor);
            Calculador.nextLine();
            System.out.printf("\n\nDeseja processar mais um ano (s= sim, n = não)? ");
            Resultado = Calculador.nextLine();
            investimento = Total_valor;

        }while("s".equals(Resultado) || "S".equals(Resultado));

    }

}
