package br.com.ds.list;

public class LinkedList {
    private Element start;
    private Element end;
    private int size;

    public boolean push(Element elem){
        try{
            elem.setNext(start);
            start = elem;
            size++;
            end = getLast();
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

    public Element find(String id){
        if(isEmpty()){
            return null;
        }

        Element elem = start;

        while(elem != null
        ){
            if(id == elem.getId()){
                return elem;
            }

            elem = elem.getNext();
        }

        return null;
    }

    public boolean insert(Element elemNew, int pos){
        try{

            if(pos < 1){ return false; };

            if(pos == 1){
                elemNew.setNext(start);
                start = elemNew;

                size++;
                return true;
            }

            Element elem = start;

            while(pos > 2
            ){
                if(elem == null){ break;}

                elem = elem.getNext();
                pos--;
            }

            elemNew.setNext(
                elem.getNext()
            );
            elem.setNext(
                elemNew
            );

            end = getLast();

            size++;
            return true;
        }catch(Exception e){
            return false;
        }


    }

    public boolean remove(int pos){
        if(pos < 1){ return false; }

        Element elem = start;

        while(pos > 2){
            if(elem.getNext() == null){
                break;
            }
            pos--;
            elem = elem.getNext();
        }

        if(elem.getNext() == null){
            end = null;
            end = getLast();
        }
        else{
            elem.setNext(
                elem.getNext().getNext()
            );
        }

        return true;
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
