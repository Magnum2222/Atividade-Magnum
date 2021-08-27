import java.util.Scanner;

public class Questão04 {
    
    public static void main(String[] args){

        String Nome; int Quantidade; double Valor;

        Scanner Calculo = new Scanner(System.in);

        System.out.println("Produto: ");
        Nome = Calculo.nextLine();
        System.out.println("Quantidade: ");
        Quantidade = Calculo.nextInt();
        System.out.println("Preco: ");
        Valor = Calculo.nextDouble();

        if(Quantidade >= 11 && Quantidade <= 20){

            Valor = Valor * quantidade;
            Valor = Valor-(Valor*10)/100;

            System.out.println("Produto: "+Nome);
            System.out.println("Quantidade de produto: "+Quantidade);
            System.out.println("Preço total: "+Valor);

        }else if(Quantidade >= 21 && Quantidade <= 50){
                    
            Valor = Valor * quantidade;
            Valor = Valor-(Valor*20)/100;

            System.out.println("Produto: "+Nome);
            System.out.println("Quantidade de produto: "+Quantidade);
            System.out.println("Preço total: "+Valor);

        }else if(Quantidade > 50){
                
            Valor = Valor * Quantidade;
            Valor = Valor-(Valor*25)/100;

            System.out.println("Produto: "+Nome);
            System.out.println("Quantidade de produto: "+Quantidade);
            System.out.println("Preço total: "+Valor);

        }else{

            System.out.println("Produto: "+Nome);
            System.out.println("Quantidade de produto: "+Quantidade);
            System.out.println("Preço total: "+Valor);

        }

    }
}