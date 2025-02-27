package br.com.ds.tree;

import br.com.ds.list.Element;

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

    int getBalance(Node node) {
        return (node == null) ? 0 : height(node.getChild_left()) - height(node.getChild_right());
    }

    Node balance(Node node) {
        updateHeight(node);
        int balance = getBalance(node);

        
        if (balance > 1 && getBalance(node.getChild_left()) >= 0)
            return rotateRight(node);

        
        if (balance < -1 && getBalance(node.getChild_right()) <= 0)
            return rotateLeft(node);

        
        if (balance > 1 && getBalance(node.getChild_left()) < 0) {
            node.setChild_left(rotateLeft(node.getChild_left()));
            return rotateRight(node);
        }

       
        if (balance < -1 && getBalance(node.getChild_right()) > 0) {
            node.setChild_right(rotateRight(node.getChild_right()));
            return rotateLeft(node);
        }

        return node;
    }

    public boolean insert(Element elem){
        Node node = new Node(elem, idGenerator.generateRandomInteger());

        if(start == null){
            start = node;
            size++;

            updateHeight(start);
            start = balance(start);

            return true;
        }

        Node nodeIter = start;
        Node nodeParent = null;

        while(nodeIter != null){
            nodeParent = nodeIter;
            if( nodeIter.getId() > node.getId() ){
                nodeIter = nodeIter.getChild_left();
                if(nodeIter == null){
                    nodeParent.setChild_left(node);
                    node.setParent(nodeParent);
                    size++;
                    
                    updateHeight(nodeParent);
                    nodeParent = balance(nodeParent);

                    return true;
                }
            }else{
                nodeIter = nodeIter.getChild_right();
                if(nodeIter == null){
                    nodeParent.setChild_right(node);
                    node.setParent(nodeParent);

                    updateHeight(nodeParent);
                    nodeParent = balance(nodeParent);

                    size++;
                    return true;
                }
            }
        }


        return false;
    }

    boolean isBalanceTree(){
        start = balance(start);
        return true;
    }

    
}
