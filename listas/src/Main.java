import lista.ListaEncadeada;
import lista.ListaSequencial;
import java.util.List;
import models.Livro;
public class Main {
    public static void main(String[] args) {
        //testesIniciais();
        //adicionaInicio();
        //removeDoInicio();
        //removePosicao();
        listaSequencial();
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