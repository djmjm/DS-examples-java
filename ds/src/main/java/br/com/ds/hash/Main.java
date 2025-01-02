package br.com.ds.hash;

import br.com.ds.list.Element;

public class Main {
    public static void main(String[] args){
        Element HelloWorld = new Element("Hello World");
        Hash hash = new Hash(2);

        System.out.println( hash.put(HelloWorld) );
        System.out.println( hash.put(HelloWorld) );
        System.out.println( hash.put(HelloWorld) );
        System.out.println( hash.put(HelloWorld) );
    }
}
