package br.com.ds.stack;

public class Stack {
    private int size;
    private int topIndex;
    private int[] content;
    private int returnValue;
    private boolean repeatElem;


    public Stack(int size){
        this( size, false );
    }

    public Stack(int size, boolean repeatElem){
        this.size = size;
        this.topIndex = -1;
        this.content = new int[this.size];
        this.repeatElem = repeatElem;
    }

    public boolean isFull(){
        return this.topIndex == this.size - 1;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public int size(){
        return this.topIndex + 1;
    }

    public int top(){
        return this.content[this.topIndex];
    }

    public boolean push(int newValue){
        if(!this.isFull()){

            if(!repeatElem){
                if(findIndex(newValue) != -1){
                    return false;
                }
            }

            this.topIndex++;
            this.content[this.topIndex] = newValue;
            return true;
        }else{
            return false;
        }
    }

    public boolean pop(){
        if(this.isEmpty()){
            return false;
        }else{
            this.returnValue = this.top();
            this.topIndex--;
            return true;
        }
    }

    public int getValueTop(){
        return this.returnValue;
    }

    public int findIndex(int elem){

        for(int i = 0; i <= this.topIndex; i++){
            if(this.content[i] == elem){
                return this.topIndex - i + 1;
            }
        }

        return -1;
    }

    public String print(){
        return this.print(false);
    }

    public String print(boolean side){
        if(this.isEmpty()){
            return "A pilha está vazia!!!";
        }else{
            String returnValue = "";

            if(side){ returnValue += "| "; }

            for(int i = 0; i < this.size(); i++){
                if(side){
                    returnValue += this.content[i] + " - ";
                }else{
                    returnValue += i+1 + " - " + this.content[i] + "\n";
                }
            }

            if(side){ returnValue += " |"; }

            return returnValue;
        }
    }
}

