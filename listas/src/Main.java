import arvore.MyTree;
import lista.ListaEncadeada;
import lista.ListaSequencial;
import models.Livro;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //testesIniciais();
        //adicionaInicio();
        //removeDoInicio();
        //removePosicao();
        //myApplication();
        myPersonalTree();
    }
    public static void myPersonalTree() {
        MyTree tree = new MyTree();

        int[] values = {33, 55, 52, 97, 1, 30, 7, 16, 3, 66};
        for (int value : values) {
            tree.insert(value);
        }

        System.out.println("\nPreOrder:");
        tree.preOrder(tree.getRoot());

        System.out.println("\nIn-Order:");
        tree.inOrder(tree.getRoot());

        System.out.println("\nPosOrder:");
        tree.posOrder(tree.getRoot());
    }
    public static void myApplication(){
        ListaSequencial<Livro> listaLivros = new ListaSequencial<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Ordenar livros (BubbleSort)");
            System.out.println("4. Ordenar livros (QuickSort)");
            System.out.println("5. Buscar livro por título");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ano de publicação do livro: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    Livro novoLivro = new Livro(titulo, autor, ano);
                    listaLivros.adicionar(novoLivro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Livros ---");
                    listaLivros.mostrar();
                    break;

                case 3:
                    listaLivros.bubbleSort();
                    System.out.println("Livros ordenados com BubbleSort!");
                    break;

                case 4:
                    listaLivros.quickSort();
                    System.out.println("Livros ordenados com QuickSort!");
                    break;

                case 5:
                    System.out.print("Digite o título do livro que deseja buscar: ");
                    String tituloBusca = scanner.nextLine();
                    Livro livroEncontrado = listaLivros.buscarPorTitulo(tituloBusca);

                    if (livroEncontrado != null) {
                        System.out.println("Livro encontrado: " + livroEncontrado);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
    public static void listaSequencial(){
        ListaSequencial<Livro> listaLivros = new ListaSequencial<>();
        Livro livro1 = new Livro("Ana", "luis", 1954);
        Livro livro2 = new Livro("Matilde", "carlos", 1949);
        Livro livro3 = new Livro("Clara", "hiandra", 1996);
        listaLivros.adicionar(livro1);
        listaLivros.adicionar(livro2);
        listaLivros.adicionar(livro3);
        String livroBuscado = "1984";
        Livro livroEncontrado = listaLivros.buscarPorTitulo(livroBuscado);
        System.out.println("Achei o livro: " + livroEncontrado);
        listaLivros.bubbleSort();
        listaLivros.mostrar();

    }
    public static void removePosicao(){
        ListaEncadeada lista = new ListaEncadeada<>();
        lista.adiciona(2);
        lista.adiciona(12);
        lista.adiciona(3);
        lista.remove(1);
        System.out.println(lista);
    }
    public static void removeDoInicio(){
        ListaEncadeada lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.removeFinal();
        System.out.println(lista);
    }
    public static void adicionaInicio(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adicionaInicio(3);
        lista.adicionaInicio(2);
        lista.adicionaInicio(1);
        lista.adiciona(0, 9);
        lista.adiciona(1, 4);
        lista.adiciona(2, 1);
        System.out.println(lista);
    }
    public static void testesIniciais(){
        ListaEncadeada<Integer> minhaLista = new ListaEncadeada<>();
        minhaLista.adiciona(1);
        System.out.println("Tamanho = " + minhaLista.getTamanho());
        System.out.println(minhaLista);

        minhaLista.adiciona(2);
        System.out.println(minhaLista);

        minhaLista.adiciona(3);
        System.out.println(minhaLista);
        System.out.println("Tamanho = " + minhaLista.getTamanho());

        //buscando por elemento
        System.out.println("Busca por elemento: ");
        System.out.println(minhaLista.busca(0));
        System.out.println(minhaLista.busca(1));
        System.out.println(minhaLista.busca(2));
        System.out.println(minhaLista.busca(3));

        // buscando por posicao
        System.out.println("Busca por posicao: ");
        System.out.println(minhaLista.buscaPorPosicao(0));
        System.out.println(minhaLista.buscaPorPosicao(1));
        System.out.println(minhaLista.buscaPorPosicao(2));
        //tem que cair no Exception:
        System.out.println(minhaLista.buscaPorPosicao(-1));
        System.out.println(minhaLista.buscaPorPosicao(-4));
    }
}