package br.com.ds.list;

public class LinkedList {
    private Element start;
    private int size;

    public boolean push(Element elem){
        try{
            elem.setNext(start);
            start = elem;
            size++;
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public Element pop(){
        if(start == null){
            return null;
        }

        Element elem = start;
        start = elem.getNext();
        elem.setNext(null);

        size--;

        return elem;

    }

    public Element getFirst(){
        if(isEmpty()){ 
            return null;
        }

        return start;
    }

    public Element getLast(){
        if(isEmpty()){
            return null;
        }

        Element elem = start;

        while(elem.getNext() != null){
            elem = elem.getNext();
        }

        return elem;
    }

    public boolean isEmpty(){
        return start == null;
    }

    public int getSize() {
        return size;
    }

    

}
