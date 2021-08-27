import java.util.Scanner;
public class Questão08 {
    public static void main(String[] args){  
        Scanner leitor = new Scanner(System.in);    
        int i, Preco1 = 0, Preco2 = 0, Resposta, Quantidade = 0; 
        System.out.println("Quantos numeros: ");
        Quantidade = leitor.nextInt();
        while(Valor1 < 1){
            Resposta = Preco1;
            Preco1 = Resposta;
            System.out.printf(" "+Resposta+" ");
            Preco++;
        }
        if(Preco1 == 1 ){
            if(Quantidade > 1){
                for (i = 1; i <= Quantidade; i++){  
                    Resposta = Preco1 + Preco2;                    
                    Preco1 = Preco2;                           
                    Preco2 = Resposta;
                            
                    System.out.printf(" "+Resposta+" ");             
                }       
            }
        }
    }
}