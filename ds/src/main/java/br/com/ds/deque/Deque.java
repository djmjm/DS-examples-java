package br.com.ds.deque;

import br.com.ds.queue.Queue;

public class Deque extends Queue{

    public Deque(int size){
        super(size);
    }

    public boolean enqueueLast(int elem){
        if(isFull()){ return false; };

        int newPos = (posFinal) % size;
        content[newPos] = elem;
        posFinal++;

        if(posFinal == size){ posFinal = 0; }

        return true;
    }
}
