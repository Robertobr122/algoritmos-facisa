package arvore;

import models.Livro;

public class Node {
    private Livro livro;
    private Node esquerda;
    private Node direita;

    public Node(Livro livro) {
        this.livro = livro;
        esquerda = null;
        direita = null;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Node getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Node esquerda) {
        this.esquerda = esquerda;
    }

    public Node getDireita() {
        return direita;
    }

    public void setDireita(Node direita) {
        this.direita = direita;
    }
}