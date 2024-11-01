package br.com.ds.vector;

public class Vector {

    private static int NULL_RESULT = -1;

    private int sizeMax;
    private int sizeCurrent;
    private int[] content;
    private boolean isRepeatElem;



    public Vector(int size){
        this(size, false);
    }

    public Vector(int size, boolean isRepeatElem){

        this.sizeMax = size;
        this.sizeCurrent = 0;
        this.content = new int[size];
        this.isRepeatElem = isRepeatElem;

    }

    public int findIndex(int elem){

        for(int i = 0; i < sizeCurrent; i++){
            if(elem == content[i]){ return i ;}
        }

        return Vector.NULL_RESULT ;
    }

    public int findValue(int index){

        if(index < 0 || index > sizeCurrent){  return Vector.NULL_RESULT ; }

        return content[index];
    }


    public boolean push(int elem){

        if(sizeCurrent >= sizeMax){
            return false;
        }

        if(isRepeatElem){
            if(findIndex(elem) != Vector.NULL_RESULT ){
                return false;
            }
        }

        content[sizeCurrent] = elem;
        sizeCurrent++;

        return true;
    }

    public boolean insert(int elemn, int index){

        if(index < 0 || index > sizeCurrent){  return false ; };
        if(sizeCurrent >= sizeMax){ return false; }


        for(int i = sizeCurrent - 1; i >= index; i--){
            content[i+1] = content[i];
        }

        content[index] = elemn;
        sizeCurrent++;

        return true;
    }

    public boolean replace(int elemn, int index){
        content[index] = elemn;
        return true;
    }

    public boolean remove(int index){

        if(isEmpty()){
            return false;
        }

        if(findValue(index) == Vector.NULL_RESULT){
            return false;
        }

        for( int i= index; i < sizeCurrent - 1; i++){
            content[i] = content[i+1];
        }

        sizeCurrent--;

        return true;
    }

    public boolean removeValueAll( int value ){

        while(contains(value)){
            for(int i = 0; i < sizeCurrent; i++){
                if(findValue(i) == value){
                    remove(i);
                }
            }
        }

        return true;
    }

    public int getSize(){
        return this.sizeCurrent;
    }

    public int getSizeMax(){
        return this.sizeMax;
    }

    public String print(){
        String returnString = "| ";

        for(int i = 0; i < sizeCurrent; i++){
            returnString += content[i] + " - ";
        }

        returnString += " END |";

        return returnString;
    }

    public boolean isEmpty(){
        return sizeCurrent == 0;
    }

    public boolean isFull(){
        return sizeCurrent == sizeMax;
    }

    public boolean contains(int value){
        if(findIndex(value) != Vector.NULL_RESULT){
            return true;
        }

        return false;
    }


}
