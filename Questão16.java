
public class Questão16 {
    
    private int h;
    private int m;
    private int s;

    public void Tempo(int s){
        this.h = s / 3600;
        int r = s % 3600;
        this.m = r / 60;
        r = r % 60;
        this.s = r;
    }
    public int Horas(){
        return this.h;
    }
    public int Minutos(){
        return this.m;
    }
    public int Segundos(){
        return this.s;
    }
    public void status(){
        System.out.println("Horas: " +Horas());
        System.out.println("Minutos: " +Minutos());
        System.out.println("Segundos: " +Segundos());
    }


}
