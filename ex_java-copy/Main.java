import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        System.out.printf("Informe o nome do aluno: ");
        nome = scanner.nextLine();
        
        int idade;
        System.out.printf("Informe a idade do aluno: ");
        idade = scanner.nextInt();
        
        int r;
        System.out.printf("\nNivel de Cor R: ");
        r = scanner.nextInt();
        
        int g;
        System.out.printf("Nivel de Cor G: ");
        g = scanner.nextInt();
        
        int b;
        System.out.printf("Nivel de Cor B: ");
        b = scanner.nextInt();
        
        Aluno aluno = new Aluno(nome, idade);

        Cor cor = new Cor(r, g, b);
        
        System.out.println("\nNome do aluno: " + aluno.getNome());
        System.out.println("Idade do aluno: " + aluno.getIdade());
        System.out.println(cor);

        // Chamando o método toString explicitamente
        //String representacao = objeto.toString();
        //System.out.println(representacao);

        // Concatenando o objeto com uma string
        //String resultado = "Objeto: " + objeto;
        //System.out.println(resultado);
    }
}