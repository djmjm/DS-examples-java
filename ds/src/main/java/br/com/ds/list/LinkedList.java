package br.com.ds.list;

public class LinkedList {
    private Element start;

    public boolean push(Element elem){
        try{
            elem.setNext(start);
            start = elem;
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

        return elem;
    }

}
