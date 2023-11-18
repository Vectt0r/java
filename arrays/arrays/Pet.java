public class Pet{
    String nome;
    int idade;
    
    public Pet(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int  getIdade(){
        return idade;
    }
    
    public String toString(){
        return "Nome: "+ nome +" | idade: " + idade;
    }
}