package br.com.ds.list;

import java.util.LinkedList;

public class List {

    LinkedList<Element> elements;

    public List(){
        elements = new LinkedList();
    }

    public boolean pushBack(Element elem){
        try{
            elements.addLast(elem);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }

    public boolean pushFirst(Element elem){
        try{
            elements.addFirst(elem);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }

    public boolean find(Element elem){
        if(elements.contains(elem)){
            return true;
        }

        return false;
    }

    public int getSize(){
        return elements.size();
    }
    
}
