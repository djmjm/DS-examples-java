package br.com.ds.stack;



public class Stack {
    private int size;
    private int topIndex;
    private int[] content;
    private int returnValue;

    public Stack(int size){
        this.size = size;
        this.topIndex = -1;
        this.content = new int[size];
        
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

    public boolean push(int new_value){
        if(!this.isFull()){
            this.topIndex += 1;
            this.content[this.topIndex] = new_value;
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

    public String print(){
        if(this.isEmpty()){
            return "A pilha está vazia!!!";
        }else{
            String returnValue = "";

            for(int i = 0; i < this.topIndex; i++){
                returnValue += this.content[i] + "\n";
            }

            return returnValue;
        }
    }
}

