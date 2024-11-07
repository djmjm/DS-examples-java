package br.com.ds.list;

public class Main {
    public static void main(String []args){

        LinkedList list = new LinkedList();
        
        list.push(
            new Element("BALCÃO")
        );

        list.push(
            new Element("CADEIRA")
        );

        list.push(
            new Element("COMPUTADOR")
        );

        list.push(
            new Element("CALCULADORA")
        );

        System.out.println(
            list.getFirst().print()
        );

        System.out.println(
            list.getLast().print()
        );

    }
}
