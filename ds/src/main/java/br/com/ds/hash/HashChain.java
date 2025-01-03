package br.com.ds.hash;

import java.math.BigInteger;
import java.util.LinkedList;

import br.com.ds.list.Element;

public class HashChain {
    private LinkedList<Element>[] table;
    private int maxSize;
    private int size;

    @SuppressWarnings("unchecked")
    public HashChain(int maxSize){
        table = new LinkedList[maxSize];
        for(int i = 0; i < maxSize; i++){
            table[i] = new LinkedList<Element>();
        }

        this.maxSize = maxSize;
        size = 0;
    }

    private int hash(Element elem){
        BigInteger numberFirst = new BigInteger(elem.getId().replace("-", ""), 16);
        long number = Math.abs(numberFirst.longValue());
        return (int) (number % maxSize);
    }

    public boolean put(Element elem){

        try{
            int key = hash(elem);
            table[key].push(elem);
            size++;
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }

    }

    public boolean find(Element elem){

        int key = hash(elem);

        for(int i = 0; i < table[key].size(); i++){
            if( table[key].get(i) == elem){
                return true;
            }
        }

        return false;
    }

    public boolean remove(Element elem){

        int key = hash(elem);
        if(table[key].remove(elem)){
            size--; return true;
        }else{
            return false;
        }

    }
    public LinkedList<Element> get(int key){
        if(table[key].size() != 0){
            return table[key];
        }

        return null;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getSize() {
        return size;
    }

}
