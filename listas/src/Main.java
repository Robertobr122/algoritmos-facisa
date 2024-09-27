import arvore.MyTree;
import java.util.Scanner;
import models.Livro;

public class Main {
    public static void main(String[] args) {
        MyTree arvoreDeLivros = new MyTree();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\nSistema de Biblioteca");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Buscar livro por ISBN");
            System.out.println("3. Remover livro");
            System.out.println("4. Exibir todos os livros");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ISBN do livro: ");
                    int isbn = scanner.nextInt();
                    scanner.nextLine();  // Consumir nova linha
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    Livro livro = new Livro(isbn, titulo, autor);
                    arvoreDeLivros.inserir(livro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o ISBN do livro que deseja buscar: ");
                    isbn = scanner.nextInt();
                    Livro livroEncontrado = arvoreDeLivros.buscar(isbn);
                    if (livroEncontrado != null) {
                        System.out.println("Livro encontrado: " + livroEncontrado.getTitulo() + " por " + livroEncontrado.getAutor());
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o ISBN do livro que deseja remover: ");
                    isbn = scanner.nextInt();
                    arvoreDeLivros.remover(isbn);
                    System.out.println("Livro removido com sucesso!");
                    break;

                case 4:
                    System.out.println("Exibindo todos os livros da biblioteca:");
                    arvoreDeLivros.exibirArvore();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}