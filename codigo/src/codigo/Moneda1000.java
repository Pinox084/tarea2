package codigo;
public class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }
    @Override
    public int getValor(){
        return super.getValor()+1000;
    }
}
