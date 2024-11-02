package br.com.ds.queue;

public class Queue {

    public static int NULL_RESULT = -1;
    
    private int[] content;
    private int size;
    private int posStart, posFinal;

    public Queue(int size){
        this.size = size + 1;
        this.posFinal = 0;
        this.posStart = 0;
        this.content = new int[this.size];
    }

    public boolean isEmpty(){
        return posFinal == posStart;
    }

    public boolean isFull(){
        return (posFinal + 1) % size == posStart;
    }
    
    public boolean enqueue(int elem){
        if(isFull()){ return false; };

        int newPos = (posFinal) % size;
        content[newPos] = elem;
        posFinal++;

        if(posFinal == size){ posFinal = 0; }

        return true;
    }

    public int dequeue(){

        if(isEmpty()){ return Queue.NULL_RESULT; };

        int returnValue = content[posStart];
        posStart++;

        if(posStart == size){ posStart = 0; }

        return returnValue;
    }

    public int getSize(){
        if(posFinal > posStart){
            return posFinal - posStart;
        }

        if(posFinal < posStart){
            return size - posStart + posFinal;
        }

        if(isFull()) {  return size; };

        return 0;
    }

    public String print(){
        String returnString = "| HEAD ";

        for(int i = posStart; i < posStart + getSize(); i++ ){

            int index = i % size;

            returnString += content[index] + " - ";
        }
          

        returnString += " TAIL |";

        return returnString;
    }

    public String peek(){
        if(isEmpty()){ return "Nenhum elemento na fila!"; };

        
            return   String.valueOf(content[posStart % size]);


    }

    public int getPosStart(){
        return posStart;
    }

    public int getPosFinal(){
        return posFinal;
    }
}
