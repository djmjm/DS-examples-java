package br.com.ds.tree;

import br.com.ds.list.Element;

public class Node {

    private int id;
    private Element content;
    private Element child_left;
    private Element child_right;
    private Element parent;

    public Node(Element content, int id){
        this.content = content;
    }

    public void setChild_left(Element child_left) {
        this.child_left = child_left;
    }
    public void setChild_right(Element child_right) {
        this.child_right = child_right;
    }
    public void setParent(Element parent) {
        this.parent = parent;
    }

    public int getId() {
        return id;
    }
    public Element getContent() {
        return content;
    }
    public Element getChild_left() {
        return child_left;
    }
    public Element getChild_right() {
        return child_right;
    }
    public Element getParent() {
        return parent;
    }

    
}
