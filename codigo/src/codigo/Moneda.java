package codigo;
public abstract class Moneda {
    public Moneda(){}
    public int getValor(){
        return 0;
    }
    public String getSerie(){
        return this.toString();
    }
    
}
class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }
    @Override
    public int getValor(){
        return super.getValor()+1000;
    }
}
class Moneda500 extends Moneda{
    public Moneda500(){
        super();
    }
    @Override
    public int getValor(){
        return super.getValor()+500;
    }
    
}
class Moneda100 extends Moneda{
    public Moneda100(){
        super();
    }
    public int getValor(){
        return super.getValor()+100;
    }
}
