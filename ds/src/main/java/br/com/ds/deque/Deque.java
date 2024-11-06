package br.com.ds.deque;

import br.com.ds.queue.Queue;

public class Deque extends Queue{

    public Deque(int size){
        super(size);
    }

    public boolean enqueueFirst(int elem){
        if(isFull()){ return false; };

        posStart--;
        if(posStart < 0){ posStart = size - 1; }
        content[posStart] = elem;

        return true;
    }

    public int dequeueLast(){

        if(isEmpty()){ return Queue.NULL_RESULT; };

        posFinal--; if(posFinal < 0){ posFinal = size - 1; }
        int returnValue = content[posFinal];

        return returnValue;
    }

    public String peekLast(){
        if(isEmpty()){ return "Nenhum elemento na fila!"; };
        int currentPostPeek = posFinal - 1;
        if(currentPostPeek < 0) {currentPostPeek = size - 1;}
        return   String.valueOf(content[currentPostPeek]);
    }

}
