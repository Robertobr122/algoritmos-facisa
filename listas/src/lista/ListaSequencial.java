package lista;
import models.Livro;
import java.util.Arrays;

public class ListaSequencial<T> {
    private T[] meuArray;
    private int tamanho;

    public ListaSequencial() {
        this.meuArray = (T[]) new Object[10];
        this.tamanho = 0;
    }

    public void adicionar(T obj) {
        if (tamanho == meuArray.length) {
            aumentarCapacidade();
        }
        meuArray[tamanho++] = obj;
    }

    private void aumentarCapacidade() {
        int novaCapacidade = (meuArray.length * 3) / 2;
        meuArray = Arrays.copyOf(meuArray, novaCapacidade);
    }

    public int size() {
        return tamanho;
    }

    public void mostrar() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(meuArray[i]);
        }
    }

    public T pegarPosicao(int index) {
        if (index < 0 || index >= tamanho) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return meuArray[index];
    }

    public T buscarPorTitulo(String titulo) {
        for (int i = 0; i < tamanho; i++) {
            T elemento = meuArray[i];
            if (elemento instanceof Livro) {
                Livro livro = (Livro) elemento;
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    return elemento;
                }
            }
        }
        return null;
    }
    public void bubbleSort() {
        for (int j = tamanho - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                T atual = meuArray[i];
                T proximo = meuArray[i + 1];

                if (atual instanceof Livro && proximo instanceof Livro) {
                    Livro livroAtual = (Livro) atual;
                    Livro livroProximo = (Livro) proximo;

                    if (livroAtual.getTitulo().compareToIgnoreCase(livroProximo.getTitulo()) > 0) {
                        meuArray[i] = proximo;
                        meuArray[i + 1] = atual;
                    }
                }
            }
        }
    }
}
