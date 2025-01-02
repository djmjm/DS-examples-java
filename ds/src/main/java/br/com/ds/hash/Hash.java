package br.com.ds.hash;

import java.math.BigInteger;
import java.lang.Math;

import br.com.ds.list.Element;

public class Hash {
    private final Element[] table;
    private int maxSize;
    private int size;

    public Hash(int maxSize){
        table = new Element[maxSize];

        this.maxSize = maxSize;
        size = 0;
    }

    private int hash(long number){
        return (int) (number % maxSize);
    }

    public int put(Element elem){
        BigInteger numberFirst = new BigInteger(elem.getId().replace("-", ""), 16);
        long number = Math.abs(numberFirst.longValue());
        int key = hash(number);

        for(int i = key; i < maxSize; i++){
            if(table[i] == null){
                table[i] = elem;
                size++;
                return i;
            }
        }

        for(int i = key; i >= 0; i--){
            if(table[i] == null){
                table[i] = elem;
                size++;
                return i;
            }
        }

        return -1;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getSize() {
        return size;
    }

    

}
