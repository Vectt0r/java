import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCarros {
    private static List<Carros> carros = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void adicionarCarro(){
        System.out.println("Digite o nome do carro: ");
        String nome = sc.nextLine();
        Carros carro = new Carros(nome);
        carros.add(carro);
        System.out.println("Carro adicionado com sucesso!"+ carro);
    }

    public static void exibir(){
        if(carros.isEmpty()){
            System.out.println("Nenhum carro cadastrado.");
            return;
        }
        for(Carros carro : carros){
            System.out.println(carro);
        }
    }

}
