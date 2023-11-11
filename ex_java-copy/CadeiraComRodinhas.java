
public class CadeiraComRodinhas extends Cadeira{
    private Data data;
    private Cor cor;

    public CadeiraComRodinhas(Cor cor, Data data){
        super(cor);
        this.data = data;
    }
    
    public Data getData(){
        return data;
    }
    
    public void setData(){
        this.data = data;
    }
    
    public Cor getCor(){
        return cor;
    }
    
    public void setCor(){
        this.cor = cor;
    }
}
