package br.com.ds.hash;

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
}
