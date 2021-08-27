import java.util.Scanner;

public class Questão18{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String unidade[]= {" zero ", " um ", " dois ", " três ", " quatro ", " cinco ", " seis ", " sete ", " oito ", " nove "};
        String dezena[]= {" zero ", " dez ", " vinte ", " trinta ", " quarenta ", " cinquenta ", " sessenta ", " setenta ", " oitenta ", " noventa "};
        String centena[]= {" zero ", " cem ", " duzentos ", " trezentos ", " quatrocentos ",  " quinhentos ", " seiscentos ", " setecentos ", " oitocentos ", " novecentos "};

        long Valor, N1, N2, N3, N4, N5, N6, N7, N8, N9;

        do{
            System.out.printf("Qual o Valor para ser convertido: ");
            Valor = leitor.nextLong();
            if(Valor >= 1000000000){
                System.out.println("Só posso com numeros com 9 digitos!!");
            }

        }while(Valor >= 1000000000);

        N1 = Valor/100000000;
        Valor = Valor-(N1*100000000);
        N2 = Valor/10000000;
        Valor = Valor-(N2*10000000);
        N3 = Valor/1000000;
        Valor = Valor-(N3*1000000);
        N4 = Valor/100000;
        Valor = Valor-(N4*100000);
        N5 = Valor/10000;
        Valor = Valor-(N5*10000);
        N6 = Valor/1000;
        Valor = Valor-(N6*1000);
        N7 = Valor/100;
        Valor = Valor-(N7*100);
        N8 = Valor/10;
        Valor = Valor-(N8*10);
        N9 = Valor/1;

        if(N1 != 0 || N2 != 0 ||  N3 != 0){
            if(N1 != 0){
                System.out.printf(centena[(int) N1]);
            }
            if(N2 != 0){
                System.out.printf(dezena[(int) N2]);
            }
            if(N3 != 0){
                System.out.printf(unidade[(int) N3]);
            }
            System.out.printf("milhão");
        }
        if(N4 != 0 || N5 != 0 ||  N6 != 0){
            if(N4 != 0){
                System.out.printf(centena[(int) N4]);
            }
            if(N5 != 0){
                System.out.printf(dezena[(int) N5]);
            }
            if(N6 != 0){
                System.out.printf(unidade[(int) N6]);
            }
            System.out.printf("mil");
        }
        if(N7 != 0 || N8 != 0 ||  N9 != 0){
            if(N7 != 0){
                System.out.printf(centena[(int) N7]);
            }
            if(N8 != 0){
                System.out.printf(dezena[(int) N8]);
            }
            if(N9 != 0){
                System.out.printf(unidade[(int) N9]);
            }
        }      
    }  
}