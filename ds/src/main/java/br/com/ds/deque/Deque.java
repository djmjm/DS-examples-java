package br.com.ds.deque;

import br.com.ds.queue.Queue;

public class Deque extends Queue{

    public Deque(int size){
        super(size);
    }

    public boolean enqueueFirst(int elem){
        if(isFull()){ return false; };

        int newPos = (posStart) % size;
        content[newPos] = elem;
        posStart--;

        if(posStart < 0){ posStart = size - 1; }

        return true;
    }

    public int dequeueLast(){

        if(isEmpty()){ return Queue.NULL_RESULT; };

        int returnValue = content[posFinal];
        posStart--;

        if(posStart < 0){ posStart = size - 1; }

        return returnValue;
    }

}
