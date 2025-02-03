package br.com.ds.tree;

public class AVLTree extends BinaryTree{
    public AVLTree(){
        super();
    }

    int height(Node node) {
        return (node == null) ? 0 : node.getHeight();
    }

    void updateHeight(Node node) {
        if (node != null) {
            node.setHeight(1 + Math.max(height(node.getChild_left()), height(node.getChild_right())) );
        }
    }

    Node rotateRight(Node y) {
        Node x = y.getChild_left();
        Node T2 = x.getChild_right();

        x.setChild_right(y);
        y.setChild_left(T2);

        updateHeight(y);
        updateHeight(x);

        return x;
    }

    Node rotateLeft(Node x) {
        Node y = x.getChild_right();
        Node T2 = y.getChild_left();

        y.setChild_left(x);
        x.setChild_right(T2);

        updateHeight(x);
        updateHeight(y);

        return y;
    }

    Node rotateLeftRight(Node node) {
        node.setChild_left(rotateLeft(node.getChild_left()));
        return rotateRight(node);
    }

    Node rotateRightLeft(Node node) {
        node.setChild_right(rotateRight(node.getChild_right()));
        return rotateLeft(node);
    }
}
