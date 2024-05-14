public class Carros {
    private String nome;

    public Carros(String nome){
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "'" + nome + "'";
    }
}