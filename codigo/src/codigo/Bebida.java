package codigo;

public abstract class Bebida{
    private int serie;
    public Bebida(int serie){
    }
    public int getSerie(){
        return serie;
    }
    public String beber(){
        return "sabor: ";
    }
}
