
public class CadeiraComMesa extends Cadeira {
    private int largura;
    private int profundidade;

    public CadeiraComMesa(Cor cor, int largura, int profundidade) {
        super(cor);
        this.largura = largura;
        this.profundidade = profundidade;
    }
    
    public int getLargura(){
        return largura;
    }
    
    public void setLargura(){
        this.largura = largura;
    }
    
    public int getProfundidade(){
        return profundidade;
    }
    
    public void setProfundidade(){
        this.profundidade = profundidade;
    }
    
     public String toString() {
        return "\nLargura:" + largura + "\nProfundidade:" + profundidade;
    }
    
    
}

