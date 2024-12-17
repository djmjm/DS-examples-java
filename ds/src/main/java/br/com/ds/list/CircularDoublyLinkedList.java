package br.com.ds.list;

public class CircularDoublyLinkedList {
    private ElementBack start;
    private ElementBack end;
    private int size;

    boolean findClockwise(String id){
        ElementBack elemIter = start;

        do{
            if(id == elemIter.getId()){
                return true;
            }
            elemIter = (ElementBack) elemIter.getNext();
        }while(elemIter != start);


        return false;
    }

    boolean findCounterClockwise(String id){
        ElementBack elemIter = start;

        do{
            if(id == elemIter.getId()){
                return true;
            }
            elemIter = (ElementBack) elemIter.getBack();
        }while(elemIter.getNext() != start);


        return false;
    }

    
}
