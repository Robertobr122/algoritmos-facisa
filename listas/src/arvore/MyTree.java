package arvore;

import models.Livro;

public class MyTree {
    private Node root;

    public MyTree() {
        root = null;
    }

    public void inserir(Livro livro) {
        root = inserirRecursivo(root, livro);
    }

    private Node inserirRecursivo(Node node, Livro livro) {
        if (node == null) {
            return new Node(livro);
        }

        if (livro.getIsbn() < node.getLivro().getIsbn()) {
            node.setEsquerda(inserirRecursivo(node.getEsquerda(), livro));
        } else if (livro.getIsbn() > node.getLivro().getIsbn()) {
            node.setDireita(inserirRecursivo(node.getDireita(), livro));
        }

        return node;
    }

    public Livro buscar(int isbn) {
        return buscarRecursivo(root, isbn);
    }

    private Livro buscarRecursivo(Node node, int isbn) {
        if (node == null || node.getLivro().getIsbn() == isbn) {
            return (node != null) ? node.getLivro() : null;
        }

        if (isbn < node.getLivro().getIsbn()) {
            return buscarRecursivo(node.getEsquerda(), isbn);
        } else {
            return buscarRecursivo(node.getDireita(), isbn);
        }
    }

    public void remover(int isbn) {
        root = removerRecursivo(root, isbn);
    }

    private Node removerRecursivo(Node node, int isbn) {
        if (node == null) {
            return null;
        }

        if (isbn < node.getLivro().getIsbn()) {
            node.setEsquerda(removerRecursivo(node.getEsquerda(), isbn));
        } else if (isbn > node.getLivro().getIsbn()) {
            node.setDireita(removerRecursivo(node.getDireita(), isbn));
        } else {
            if (node.getEsquerda() == null) {
                return node.getDireita();
            } else if (node.getDireita() == null) {
                return node.getEsquerda();
            }

            node.setLivro(encontrarMinimo(node.getDireita()));
            node.setDireita(removerRecursivo(node.getDireita(), node.getLivro().getIsbn()));
        }

        return node;
    }

    private Livro encontrarMinimo(Node node) {
        Livro minimo = node.getLivro();
        while (node.getEsquerda() != null) {
            minimo = node.getEsquerda().getLivro();
            node = node.getEsquerda();
        }
        return minimo;
    }

    public void exibirArvore() {
        exibirArvoreRecursivo(root);
    }

    private void exibirArvoreRecursivo(Node node) {
        if (node != null) {
            exibirArvoreRecursivo(node.getEsquerda());
            System.out.println("ISBN: " + node.getLivro().getIsbn() + ", Título: " + node.getLivro().getTitulo());
            exibirArvoreRecursivo(node.getDireita());
        }
    }
}
