
public class Sala{
    private String nome;
    private Cadeira cadeira1;
    private Cadeira cadeira2;
    private Cadeira cadeira3;
    private Cadeira cadeira4;

    public Sala(String nome, Cadeira cadeira1, Cadeira cadeira2, Cadeira cadeira3, Cadeira cadeira4){
        this.nome = nome;
        this.cadeira1 = cadeira1;
        this.cadeira2 = cadeira2;
        this.cadeira3 = cadeira3;
        this.cadeira4 = cadeira4;
    }
    
    public String Getnome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Cadeira getCadeira1(){
        return cadeira1;
    }
    
    public void setCadeira1(){
        this.cadeira1 = cadeira1;
    }
    
    public Cadeira getCadeira2(){
        return cadeira2;
    }
    
    public void setCadeira2(){
        this.cadeira2 = cadeira2;
    }
    
    public Cadeira getCadeira3(){
        return cadeira3;
    }
    
    public void setCadeira3(){
        this.cadeira3 = cadeira3;
    }
    
    public Cadeira getCadeira4(){
        return cadeira4;
    }
    
    public void setCadeira4(){
        this.cadeira4 = cadeira4;
    }
    
    public int cadeirasComMesaDisponiveis(){
        int totalCadeiras = 4;
        int CadeirasComMesaDisponiveis = 0;
        
        if(cadeira1.getAluno() == null && cadeira1 instanceof CadeiraComMesa){
            CadeirasComMesaDisponiveis ++;
        };
        
        if(cadeira2.getAluno() == null && cadeira2 instanceof CadeiraComMesa){
            CadeirasComMesaDisponiveis ++;
        };
        
        if(cadeira3.getAluno() == null && cadeira3 instanceof CadeiraComMesa){
            CadeirasComMesaDisponiveis ++;
        }
        
        if(cadeira4.getAluno() == null && cadeira4 instanceof CadeiraComMesa){
            CadeirasComMesaDisponiveis ++;
            
            return CadeirasComMesaDisponiveis;
        }else{
            return CadeirasComMesaDisponiveis - totalCadeiras;
        }
    }
    
    public int cadeiraComRodinhasDisponiveis(){
        int totalCadeiras = 4;
        int CadeirasComRodinhasDisponiveis = 0;
        
        if(cadeira1.getAluno() == null && cadeira1 instanceof CadeiraComRodinhas){
            CadeirasComRodinhasDisponiveis ++;
        };
        
        if(cadeira2.getAluno() == null && cadeira2 instanceof CadeiraComRodinhas){
            CadeirasComRodinhasDisponiveis ++;
        };
        
        if(cadeira3.getAluno() == null && cadeira3 instanceof CadeiraComRodinhas){
            CadeirasComRodinhasDisponiveis ++;
        }
        
        if(cadeira4.getAluno() == null && cadeira4 instanceof CadeiraComRodinhas){
            CadeirasComRodinhasDisponiveis ++;
            
            return CadeirasComRodinhasDisponiveis;
        }else{
            return CadeirasComRodinhasDisponiveis - totalCadeiras;
        }
    }
}
