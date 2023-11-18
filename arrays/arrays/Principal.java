
public class Principal{
   public static void main(String[] args){
        PetShop pet = new PetShop(5);
        
        for(int i = 0; i < 7; i++){
            double sorteio = Math.random()*10;
            int sortInteiro = (int) Math.round(sorteio);
            boolean inseriu = false;
            
            if(sortInteiro < 3)
                inseriu = pet.inserePet(new Cachorro("Cachorro" +i, i));
            else if(sortInteiro < 6)
                inseriu = pet.inserePet(new Gato("Gato" +i, i));
            else
                inseriu = pet.inserePet(new Papagaio("Papagaio" +i, i));
            if(inseriu)
                System.out.println("Inserido");
            else
                System.out.println("Não inserido");
        }
        
        System.out.println("\n*** PETs DO PETSHOP ***");
        pet.imprimePet();
        System.out.println("\n*** REMOVENDO PETS ***");
        Pet removido = pet.removePet("Gato 3");
        
        if(removido == null){
            System.out.println("Pet Não Encontrado");
        }
        else
            System.out.println("Pet removido" +removido);
            
        System.out.println("\n*** PETS DO PETSHOP***");
        pet.imprimePet();
        System.out.println("\n*** FAZENDO CACHORROS LATIREM ***");
        pet.fazCachorroLatirem();
    }
}