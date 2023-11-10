
public class Aluno{
    public String nome;
    public int idade;
    
    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String Nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String toString() {
        return "Nome do Aluno:" + nome + "\n, Idade do Aluno:" + idade + "\n";
    }
}
