import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeUsuarios {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static int ultimoId = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void adicionarUsuario() {
        System.out.println("Digite o nome do usuario: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o email: ");
        String email = scanner.nextLine();
        Usuario usuario = new Usuario(ultimoId++, nome, email);
        usuarios.add(usuario);
    }

    //LISTA DE USUARIOS CADASTRADOS
    public static void listarUsuario(){
        if(usuarios.isEmpty()){
            System.out.println("Nenhum usuario cadastrado");
            return;
        }
        for(Usuario usuario : usuarios){
            System.out.println(usuario);
        }
    }

    //ATUALIZAR USUARIO JA CADASTRADO
    public static void atualizarUsuario(){
        System.out.println("Digite o id usuario do usuario: ");
        int id = Integer.parseInt(scanner.nextLine());
        for(Usuario usuario : usuarios){
            if(usuario.getId() == id){
                System.out.println("Digite o novo nome do usuario: ");
                usuario.setNome(scanner.nextLine());
                System.out.println("Digite o novo email do usuario: ");
                usuario.setEmail(scanner.nextLine());
                System.out.println("Usuario Atualizado");
            }
        }
    }

    //EXCLUIR USUARIO JÁ CADASTRADO
    public static void ExcluirUsuario(){
        System.out.println("Digite o ID do usuário para remover:");
        int id = Integer.parseInt(scanner.nextLine());
        usuarios.removeIf(usuario -> usuario.getId() == id);
    }
}
