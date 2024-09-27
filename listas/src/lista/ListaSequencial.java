/* 
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
        if (tamanho == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append('[');

        for (int i = 0; i < tamanho; i++) {
            sb.append(meuArray[i]);
            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }

        sb.append(']');
        System.out.println(sb.toString());
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

                    if (livroAtual.getAutor().compareToIgnoreCase(livroProximo.getAutor()) > 0) {
                        meuArray[i] = proximo;
                        meuArray[i + 1] = atual;
                    }
                }
            }
        }
    }

    public void quickSort() {
        quickSort(0, tamanho - 1);
    }

    private void quickSort(int left, int right) {
        if (left < right) {
            int p = partition(left, right);
            quickSort(left, p);
            quickSort(p + 1, right);
        }
    }

    private int partition(int left, int right) {
        T pivot = meuArray[left + (right - left) / 2];
        int i = left;
        int j = right;

        while (true) {
            while (compare(meuArray[i], pivot) < 0) {
                i++;
            }

            while (compare(meuArray[j], pivot) > 0) {
                j--;
            }

            if (i >= j) {
                return j;
            }

            T temp = meuArray[i];
            meuArray[i] = meuArray[j];
            meuArray[j] = temp;

            i++;
            j--;
        }
    }

    private int compare(T obj1, T obj2) {
        if (obj1 instanceof Livro && obj2 instanceof Livro) {
            Livro livro1 = (Livro) obj1;
            Livro livro2 = (Livro) obj2;
            return livro1.getAutor().compareToIgnoreCase(livro2.getAutor());
        }
        return 0;
    }
}

*/