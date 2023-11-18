public class PetShop{
    private Pet[] pets;
    
    public PetShop(int quantMax){
        pets = new Pet[quantMax];
    }
     
    public boolean inserePet(Pet p){
        for(int i = 0; i < pets.length; i++)
            if(pets[i] == null){
                pets[i] = p;
                return true;
            }
        return false;
    }
    
    public Pet removePet(String nome){
        Pet retorno = null;
        for(int i = 0; i < pets.length; i++){
            if(pets[i] != null && pets[i].getNome().equalsIgnoreCase(nome)){
                retorno = pets[i];
                pets[i] = null;
                break;
            }
        }
        return retorno;
    }
    
    public void fazCachorroLatirem(){
        for(int i = 0; i < pets.length; i++){
        if(pets[i] != null && pets[i] instanceof Cachorro){
                ((Cachorro)pets[i]).latir();
            }
        }
    }
    
    public void imprimePet(){
        for(int i = 0; i < pets.length; i++){
            if(pets[i] != null){
                System.out.println(pets[i]);
            }
        }
    }
}