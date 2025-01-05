package br.com.ds.tree;

import java.util.Stack;

import br.com.ds.list.Element;
import br.com.ds.util.UniqueRandom;

public class BinaryTree {
    private Node start;
    private UniqueRandom idGenerator;
    private int size;

    private Stack<String> stackPrinting;
    
    public BinaryTree(){
        idGenerator = new UniqueRandom(10);
        start = null;
        size = 0;

        stackPrinting = new Stack<String>();
    }

    public boolean insert(Element elem){
        Node node = new Node(elem, idGenerator.generateRandomInteger());

        if(start == null){
            start = node;
            size++;
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
                    return true;
                }
            }else{
                nodeIter = nodeIter.getChild_right();
                if(nodeIter == null){
                    nodeParent.setChild_right(node);
                    node.setParent(nodeParent);
                    size++;
                    return true;
                }
            }
        }


        return false;
    }

    public String printWidth(){
        Node nodeIter = start;
        String result = "";

        traverseWidth(nodeIter);
        while(!stackPrinting.isEmpty()){
            result += stackPrinting.pop() + " - ";
        }
        

        return result;
    }

    

    public int getSize() {
        return size;
    }

    private Node traverseWidth(Node node){

            

        if(node.getChild_left() != null){ 
            traverseWidth(node.getChild_left());
        }
        if(node.getChild_right() != null){ 
            traverseWidth(node.getChild_right());
        }

        stackPrinting.push( node.getContent().getName() + " id(" + node.getId() + ")");
        return node;
    }
}
