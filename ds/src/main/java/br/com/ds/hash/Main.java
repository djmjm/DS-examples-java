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

        System.out.println(hash.remove(HelloWorld));
        System.out.println(hash.remove(HelloWorld));

        System.out.println( hash.find(HelloWorld));

        System.out.println(hash.get(0));
        System.out.println(hash.get(1));

        HashChain chainingHash = new HashChain(10);
        System.out.println(chainingHash.getSize());

        System.out.println(chainingHash.put(HelloWorld));
        System.out.println(chainingHash.put(HelloWorld));
        System.out.println(chainingHash.put(HelloWorld));

        System.out.println(chainingHash.getSize());

        System.out.println(chainingHash.find(HelloWorld));
        System.out.println(chainingHash.find(quit));
        System.out.println(chainingHash.find(quit));

        System.out.println(chainingHash.remove(HelloWorld));
        System.out.println(chainingHash.getSize());

        System.out.println(chainingHash.remove(HelloWorld));
        System.out.println(chainingHash.getSize());

        System.out.println(chainingHash.remove(HelloWorld));
        System.out.println(chainingHash.getSize());

        System.out.println(chainingHash.remove(HelloWorld));
        System.out.println(chainingHash.getSize());

        System.out.println(chainingHash.remove(quit));
    }
}
