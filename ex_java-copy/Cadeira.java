
public class Cadeira{
    Cor cor;
    Aluno aluno;
    
    public Cadeira(Cor cor){
        this.cor = cor;
        this.aluno = null;
    }
    
    public Cor getCor(){
        return cor;
    }
    
    public Aluno getAluno(){
        return aluno;
    }
    
    public void ocuparCadeira(Aluno aluno){
        this.aluno = aluno;
    }
    
    public void desocuparCadeira(){
        this.aluno = null;
    }
    
    public String toString() {
        if (aluno != null) {
            return "A cadeira da cor " + cor + " está ocupada pelo aluno: " + aluno.getNome();
        } else {
            return "A cadeira da cor " + cor + " está desocupada";
        }
    }
}
