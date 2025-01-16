package br.com.ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.ds.list.Element;
import br.com.ds.util.UniqueRandom;

public class BinaryTree {
    private Node start;
    private UniqueRandom idGenerator;
    private int size;

    private LinkedList<String> queuePrinting;
    
    public BinaryTree(){
        idGenerator = new UniqueRandom(10);
        start = null;
        size = 0;

        queuePrinting = new LinkedList<String>();
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
        List<Node> list = new ArrayList<Node>();
        list.add(nodeIter);

        traverseWidth(list);
        while(!queuePrinting.isEmpty()){
            result += queuePrinting.poll() + " - ";
        }

        return result;
    }

    public String printInOrder(){
        Node nodeIter = start;
        String result = "";

        System.out.println(queuePrinting.size());
        traverseInOrder(nodeIter);
        while(!queuePrinting.isEmpty()){
            result += queuePrinting.poll() + " - ";
        }
        
        return result;
    }

    public String printPreOrder(){
        Node nodeIter = start;
        String result = "";

        System.out.println(queuePrinting.size());
        traversePreOrder(nodeIter);
        while(!queuePrinting.isEmpty()){
            result += queuePrinting.poll() + " - ";
        }
        
        return result;
    }


    

    public int getSize() {
        return size;
    }

    private List<Node> traverseWidth(List<Node> nodes){ 
        
        List<Node> nextLevel = new ArrayList<Node>();

        if(nodes.isEmpty()){ return null;};

        for(Node node: nodes){
            
            queuePrinting.add( node.getContent().getName() + " id(" + node.getId() + ")");

            if(node.getChild_left() != null){ 
                nextLevel.add( node.getChild_left());
            }
            if(node.getChild_right() != null){ 
                nextLevel.add(node.getChild_right());
            }
        }

        return traverseWidth(nextLevel);
    }

    private Node traverseInOrder(Node node){
        if(node.getChild_left() != null){ 
            traverseInOrder(node.getChild_left());
        }

        queuePrinting.add( node.getContent().getName() + " id(" + node.getId() + ")");

        if(node.getChild_right() != null){ 
            traverseInOrder(node.getChild_right());
        }

        return node;
    }

    private Node traversePreOrder(Node node){

        queuePrinting.add( node.getContent().getName() + " id(" + node.getId() + ")");

        if(node.getChild_left() != null){ 
            traversePreOrder(node.getChild_left());
        }

        if(node.getChild_right() != null){ 
            traversePreOrder(node.getChild_right());
        }

        return node;
    }
}
