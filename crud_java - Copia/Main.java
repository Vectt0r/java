import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final GerenciadorDeUsuarios gerenciador = new GerenciadorDeUsuarios();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Escolha uma opção: [1] Adicionar [2] Listar [3] Atualizar [4] Remover [5] Sair");
            int opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1:
                    gerenciador.adicionarUsuario();
                    break;
                case 2:
                    gerenciador.listarUsuario();
                    break;
                case 3:
                    gerenciador.atualizarUsuario();
                    break;
                case 4:
                    gerenciador.ExcluirUsuario(); // Se você decidir usar o método renomeado
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
