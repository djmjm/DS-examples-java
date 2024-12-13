package br.com.ds.list;

public class DoublyLinkedList {
    private ElementBack start;
    private ElementBack end;
    private int size;

    public boolean removeBack(){
        if(size == 0){ return false; };
        if(size == 1){
            start = null;
            end = null;
            size--;
            return true;
        }

        end = (ElementBack) end.getBack();
        size--;
        return true;
    }

    public boolean removeFirst(){
        if(size == 0){ return false; };
        if(size == 1){
            start = null;
            end = null;
            size--;
            return true;
        }
        
        start = (ElementBack) start.getNext();
        size--;
        return true;
    }

    public boolean pushBack(ElementBack elem){

        if(end == null){
            start = elem;
            end = elem;
        }else{
            elem.setBack(end);
            end.setNext(elem);
            
            end = elem;
        }

        size++;
        return true;
    }

    public boolean pushFirst(ElementBack elem){

        if(start == null){
            start = elem;
            end = elem;
        }
        else{
            elem.setNext(start);
            start.setBack(elem);
            
            start = elem;
        }

        size++;
        return true;
    }

    public Element getFirst(){
        if(isEmpty()){ 
            return null;
        }

        return start;
    }

    public boolean isEmpty(){
        return start == null;
    }

    public int getSize() {
        return size;
    }

    public Element getEnd() {
        return end;
    }
   
}
