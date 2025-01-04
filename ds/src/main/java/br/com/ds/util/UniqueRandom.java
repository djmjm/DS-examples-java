package br.com.ds.util;

import java.util.Collections;
import java.util.LinkedList;

public class UniqueRandom {
    private LinkedList<Integer> randomList;

    public UniqueRandom(int size){
        randomList = new LinkedList<Integer>();
        for (Integer i=1; i<=size; i++) randomList.add(i);
        Collections.shuffle(randomList);
    }

    public int generateRandomInteger(){
        return randomList.removeFirst();
    }

}
