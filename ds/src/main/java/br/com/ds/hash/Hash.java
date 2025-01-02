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

    private int hash(Element elem){
        BigInteger numberFirst = new BigInteger(elem.getId().replace("-", ""), 16);
        long number = Math.abs(numberFirst.longValue());
        return (int) (number % maxSize);
    }

    public boolean put(Element elem){
        int key = hash(elem);

        for(int i = key; i < maxSize; i++){
            if(table[i] == null){
                table[i] = elem;
                size++;
                return true;
            }
        }

        for(int i = key; i >= 0; i--){
            if(table[i] == null){
                table[i] = elem;
                size++;
                return true;
            }
        }

        return false;
    }

    public boolean find(Element elem){
        int key = hash(elem);

        for(int i = key; i < maxSize; i++){
            if(table[i] != null){
                if(elem.getId() == table[i].getId()){
                    return true;
                }
            }else{
                break;
            }
        }

        for(int i = key; i >= 0; i--){
            if(table[i] != null){
                if(elem.getId() == table[i].getId()){
                    return true;
                }
            }else{
                break;
            }
        }


        return false;

    }

    public boolean remove(Element elem){
        int key = hash(elem);

        for(int i = key; i < maxSize; i++){
            if(table[i] != null){
                if(elem.getId() == table[i].getId()){
                    table[i] = null;
                    return true;
                }
            }else{
                break;
            }
        }

        for(int i = key; i >= 0; i--){
            if(table[i] != null){
                if(elem.getId() == table[i].getId()){
                    table[i] = null;
                    return true;
                }
            }else{
                break;
            }
        }


        return false;

    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getSize() {
        return size;
    }

    

}
