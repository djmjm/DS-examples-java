package br.com.ds.list;

public class CircularDoublyLinkedList {
    private ElementBack start;
    private ElementBack end;
    private int size;

    public boolean insertCounterClockwise(ElementBack elem, int pos){

        boolean isEndNew = false;
        boolean isStartNew = false;

        if(size == 0){

            elem.setBack(elem);
            elem.setNext(elem);
            
            start = elem;
            end = elem;

            size++;
            return true;
        }

        if(pos == 0){
            isStartNew = true;
        }

        ElementBack elemIter = (ElementBack) start.getBack();

        while(pos > 0){
            elemIter = (ElementBack) elemIter.getBack();
            pos--;
        }

        if(elemIter == end){
            isEndNew = true;
        }

        ElementBack swapNext = ( (ElementBack) elemIter.getNext() );
        
        swapNext.setBack(elem);
        elemIter.setNext(elem);

        elem.setBack(elemIter);
        elem.setNext(swapNext);

        if(isEndNew){
            end = elem;
            if(end == start){
                if(size != 0){
                    end = (ElementBack) start.getBack();
                }
            }
        }

        if(isStartNew){
            start = elem;
            if(end == start){
                if(size != 0){
                    end = (ElementBack) start.getBack();
                }
            }
        }

        size++;
        return true;
    }

    public boolean insertClockwise(ElementBack elem, int pos){

        boolean isEndNew = false;
        boolean isStartNew = false;

        if(size == 0){
            elem.setBack(elem);
            elem.setNext(elem);

            start = elem;
            end = elem;

            size++;
            return true;
        }

        ElementBack elemIter = (ElementBack) start.getNext();

        if(pos == 0){
            isStartNew = true;
        }

        while(pos > 0){
            elemIter = (ElementBack) elemIter.getNext();
            pos--;
        }

        if(elemIter == end){
            isEndNew = true;
        }

        ElementBack swapNext = ( (ElementBack) elemIter.getNext() );
        
        swapNext.setBack(elem);
        elemIter.setNext(elem);

        elem.setBack(elemIter);
        elem.setNext(swapNext);

        if(isEndNew){
            end = elem;
            if(end == start){
                if(size != 0){
                    end = (ElementBack) start.getBack();
                }
            }
        }

        if(isStartNew){
            start = elem;
            if(end == start){
                if(size != 0){
                    end = (ElementBack) start.getBack();
                }
            }
        }


        size++;
        return true;
    }

    public boolean findClockwise(String id){
        ElementBack elemIter = start;

        do{
            if(id == elemIter.getId()){
                return true;
            }
            elemIter = (ElementBack) elemIter.getNext();
        }while(elemIter != start);


        return false;
    }

    public boolean findCounterClockwise(String id){
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
