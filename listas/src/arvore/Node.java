package arvore;

public class Node {
    int info;
    Node left;
    Node right;

    public Node(int info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }
}