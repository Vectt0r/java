public class Cor{
    private int R;
    private int G;
    private int B;
       
    public Cor(int R, int G, int B){
        this.R = R;
        this.G = G;
        this.B = B;
    }
    
    public int getR(){
        return R;
    }
    
    public void setR(int R){
        this.R = R;
    }
    
    public int getG(){
        return G;
    }
    
    public void setG(int G){
        this.G = G;
    }
    
    public int getB(){
        return B;
    }
    
    public void setB(int B){
        this.R = R;
    }
    
    public String toString() {
        return "\nNivel de R:" + R + "\nNivel de G:" + G + "\nNivel de B:" + B;
    }
    
}
