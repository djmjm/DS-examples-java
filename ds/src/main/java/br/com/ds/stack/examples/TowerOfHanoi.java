package br.com.ds.stack.examples;

import java.util.ArrayList;

import br.com.ds.stack.Stack;

/** ... 
 * 
 *  quebra-cabeças (inspirado no Torres de
    Hanoi) em que existem 3 pilhas, sendo que duas delas são totalmente preenchidas
    com números aleatórios e a terceira está totalmente vazia.
    O objetivo é, manualmente, através de operações de pop-push, separe-se a metade
    dos números menores em uma das pilhas e a metade dos maiores fique em outra
    pilha.
 * 
 * 
 * ----------------------------------------------------------------------------------
 * 
 * Puzzle (inspired by the Tower of Hanoi) with 3 stacks, 
 * where two of them are completely filled with random numbers, 
 * and the third is entirely empty. The goal is, manually, 
 * through pop-push operations, to separate half of the smaller numbers 
 * into one stack and half of the larger numbers into another stack.
*/


public class TowerOfHanoi {

    public enum Movements {
        STACK1, STACK2, STACK3
    };

    private final Stack stack1;
    private final Stack stack2;
    private final Stack stack3;

    private final int sizeGame;


    public TowerOfHanoi(int size){

        this.stack1 = new Stack(size, true);
        this.stack2 = new Stack(size, true);
        this.stack3 = new Stack(size, true);

        for(int i = 0; i < size; i++){
            stack1.push( (int) Math.random() * size + 1  );
            stack2.push( (int) Math.random() * size + 1  );
        }

        this.sizeGame = size + 1;
    }

    public boolean move( Movements from, Movements to ){

        if(from == to){
            return false;
        }

        if(from == Movements.STACK1){
            if(to == Movements.STACK2) { 
                this.stack1.pop();
                return this.stack2.push(  this.stack1.getValueTop()  );
             }

             if(to == Movements.STACK3) { 
                this.stack1.pop();
                return this.stack3.push(  this.stack1.getValueTop()  );
             }
        }

        if(from == Movements.STACK2){
            if(to == Movements.STACK1) { 
                this.stack2.pop();
                return this.stack1.push(  this.stack2.getValueTop()  );
             }

             if(to == Movements.STACK3) { 
                this.stack2.pop();
                return this.stack3.push(  this.stack2.getValueTop()  );
             }
        }

        if(from == Movements.STACK3){
            if(to == Movements.STACK1) { 
                this.stack3.pop();
                return this.stack1.push(  this.stack3.getValueTop()  );
             }

             if(to == Movements.STACK2) { 
                this.stack3.pop();
                return this.stack2.push(  this.stack3.getValueTop()  );
             }
        }


        return true;
    }

    public boolean win(){

        ArrayList<Integer> stack1Numbers = new ArrayList<Integer>();
        ArrayList<Integer> stack2Numbers = new ArrayList<Integer>();

        for(int i = 0; i < this.sizeGame; i++){
            if(this.stack1.findIndex(i) != -1){
                stack1Numbers.add(i);
            }

            if(this.stack2.findIndex(i) != -1){
                stack2Numbers.add(i);
            }

        }

        for(int i = 0; i < stack1Numbers.size(); i++){
            Integer elem = stack1Numbers.get(i);

            for(int j = elem - 1; j >= 0; j--){
                if(stack2Numbers.contains(j)){
                    return false;   
                }
            }
        }

        return true;
    }


}
