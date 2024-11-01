package br.com.ds.queue;

public class Queue {

    public static int NULL_RESULT = -1;
    
    private int[] content;
    private int size;
    private int posStart, posFinal;

    public Queue(int size){
        this.size = size;
        this.posFinal = 0;
        this.posStart = 0;
        this.content = new int[size];
    }

    public boolean isEmpty(){
        return posFinal == posStart;
    }

    public boolean isFull(){
        return (posFinal + 1) % size == posStart;
    }
    
    public boolean enqueue(int elem){
        if(isFull()){ return false; };

        int newPos = (posFinal + 1) % size;
        content[newPos] = elem;
        posFinal++;

        return true;
    }

    public int dequeue(){

        if(isEmpty()){ return Queue.NULL_RESULT; };

        int returnValue = content[posStart];
        posFinal--;

        return returnValue;
    }

    public int getSize(){
        if(posFinal < posStart){
            return posStart - posFinal;
        }

        if(posFinal > posStart){
            return size - posStart + posFinal;
        }

        if(isFull()) {  return size; };

        return 0;
    }

    public String print(){
        String returnString = "| ";

        if(posStart < posFinal){
            for(int i = posStart; i < posFinal; i++ ){
                returnString += content[i] + " - ";
            }
        }

        if(posFinal > posStart){
            for(int i = posFinal; i >= posStart; i-- ){
                returnString += content[i] + " - ";
            }
        }

        if(posStart == posFinal){
           if(isFull()){
                for(int i = posStart; i < posStart + size; i++ ){

                    int index = i % size;

                    returnString += content[index] + " - ";
                }
            }
        }

        returnString += " END |";

        return returnString;
    }
}
