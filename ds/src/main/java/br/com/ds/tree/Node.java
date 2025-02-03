package br.com.ds.tree;

import br.com.ds.list.Element;

public class Node {

    private int id;
    private int height;
    private Element content;
    private Node child_left;
    private Node child_right;
    private Node parent;

    public Node(Element content, int id){
        this.content = content;
        this.id = id;
        this.height = 0;

        parent = null;
        child_left = null;
        child_right = null;
    }

    public void setChild_left(Node child_left) {
        this.child_left = child_left;
    }
    public void setChild_right(Node child_right) {
        this.child_right = child_right;
    }
    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getId() {
        return id;
    }
    public Element getContent() {
        return content;
    }
    public Node getChild_left() {
        return child_left;
    }
    public Node getChild_right() {
        return child_right;
    }
    public Node getParent() {
        return parent;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    

    
}
