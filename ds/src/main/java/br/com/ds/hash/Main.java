package br.com.ds.hash;

import br.com.ds.list.Element;

public class Main {
    public static void main(String[] args){
        Element HelloWorld = new Element("Hello World");
        Element quit = new Element("Isso é tudo, pessoal ...");

        Hash hash = new Hash(2);

        System.out.println( hash.getSize() );
        System.out.println( hash.getMaxSize() );

        System.out.println( hash.find(HelloWorld));
        System.out.println( hash.find(quit));

        System.out.println( hash.put(HelloWorld) );
        System.out.println( hash.put(HelloWorld) );
        System.out.println( hash.put(HelloWorld) );
        System.out.println( hash.put(HelloWorld) );

        System.out.println( hash.find(HelloWorld));
        System.out.println( hash.find(quit));

        System.out.println( hash.getSize() );
        System.out.println( hash.getMaxSize() );
    }
}
