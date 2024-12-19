package br.com.ds.list;

public class CircularDoublyLinkedList {
    private ElementBack start;
    private ElementBack end;
    private int size;

    boolean insertCounterCounterClockwise(ElementBack elem, int pos){
        if(size == 0){
            start = elem;

            start.setBack(start);
            start.setNext(start);

            return true;
        }

        ElementBack elemIter = (ElementBack) elem.getNext();

        while(pos > 0){
            elemIter = (ElementBack) elemIter.getNext();
            pos--;
        }

        ElementBack swapNext = ( (ElementBack) elemIter.getNext() );
        
        swapNext.setBack(elem);
        elemIter.setNext(elem);

        elem.setBack(elemIter.getBack());
        elem.setNext(swapNext);

        return true;
    }

    boolean insertClockwise(ElementBack elem, int pos){
        if(size == 0){
            start = elem;

            start.setBack(start);
            start.setNext(start);

            return true;
        }

        ElementBack elemIter = (ElementBack) elem.getNext();

        while(pos > 0){
            elemIter = (ElementBack) elemIter.getNext();
            pos--;
        }

        ElementBack swapNext = ( (ElementBack) elemIter.getNext() );
        
        swapNext.setBack(elem);
        elemIter.setNext(elem);

        elem.setBack(elemIter);
        elem.setNext(swapNext);

        return true;
    }

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

    public Element getFirst(){
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
