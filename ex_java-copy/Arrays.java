public class Arrays{
    
    public int procuraNome(String[] nomes, String nome) {
        for(int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }
    
    public double calculaMedia(double[] valores){
        
        double soma = 0;
        
        for(int i=0; i<valores.length; i++){
            soma += valores[i];
        }
        return soma / valores.length;
    }
    
    public static void main(String[] args){
        String[] nomes = {"joao", "theo", "marina", "ana"};
        String nome = "theo";
        Arrays e = new Arrays();
        
        int posicao = e.procuraNome(nomes, nome);
        System.out.println("Posição Encontrada" +posicao);
    }
}
