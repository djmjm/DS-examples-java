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

        this.maxSize = maxSize;
        size = 0;
    }

    private int hash(Element elem){
        BigInteger numberFirst = new BigInteger(elem.getId().replace("-", ""), 16);
        long number = Math.abs(numberFirst.longValue());
        return (int) (number % maxSize);
    }

    public boolean put(Element elem){
        return false;
    }

    public boolean find(Element elem){
        return false;
    }

    public boolean remove(Element elem){
        return false;

    }
    public Element get(int key){
        return  null;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getSize() {
        return size;
    }

}
