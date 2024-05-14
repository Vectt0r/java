import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ListaCarros lista = new ListaCarros();
    public static void main(String[] args) {
        while (true) {
            System.out.println("1 - Adicionar Carro\n2 - Listar Carros\n3 - Sair");
            int opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1:
                    lista.adicionarCarro();
                    break;
                case 2:
                    lista.exibir();
                    break;
                case 3:
                    System.out.println("Saindo");
                    return;
            }

        }
    }
}
