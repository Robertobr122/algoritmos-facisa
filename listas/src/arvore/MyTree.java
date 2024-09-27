package arvore;

public class MyTree {
    public Node root = null;

    public void insert(int info) {
        root = insertRec(root, info);
    }

    private Node insertRec(Node place, int info) {
        if (place == null) {
            place = new Node(info);
            return place;
        }

        if (info < place.info) {
            place.left = insertRec(place.left, info);
        } else if (info > place.info) {
            place.right = insertRec(place.right, info);
        }

        return place;
    }

    public void preOrder(Node place) {
        if (place != null) {
            System.out.print(" " + place.info);
            preOrder(place.left);
            preOrder(place.right);
        }
    }

    public void inOrder(Node place) {
        if (place != null) {
            inOrder(place.left);
            System.out.print(" " + place.info);
            inOrder(place.right);
        }
    }

    public void posOrder(Node place) {
        if (place != null) {
            posOrder(place.left);
            posOrder(place.right);
            System.out.print(" " + place.info);
        }
    }

    public Node getRoot() {
        return root;
    }
}
