
public class Questao20 {
    private static String Nome;
    private static int Codigo;
    private static String Numero;
    static int n = 1;

    public class Agenda{

        public void stt(){
            System.out.println("");
            System.out.println("*************** Agenda: " + (n++) + " ***************\n");
            System.out.println("*****************************************\n");
        }
        public void status(){
            System.out.println("");
            System.out.println("Dados do contato:");
            System.out.println("Nome: " + Nome);
            System.out.println("Número: " + Numero);
            System.out.println("Código: " + Codigo);
            System.out.println("");
        }

        public class Contato{
            public void setNome(String n){
                Nome = n;
            }
            public String getNome(){
                return Nome;
            }
    
            public void setNumero(String n){
                Numero = n;
            }
            public String getNumero(){
                return Numero;
            }
    
            public void setCodigo(int c){
                Codigo = c;
            }
            public int getCodigo(){
                return Codigo;
            }

        }
        
        
    }

}
