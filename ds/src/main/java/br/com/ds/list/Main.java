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

        System.out.println(
            list.getSize()
        );

        System.out.println(
            list.getEnd().print()
        );

        
        System.out.println(
            list.find(
                list.getLast().getId()
            ).print()
        );

        System.out.println(
            list.find(
                list.getFirst().getId()
            ).print()
        );

        Element elemInsertTwo = new Element("InsertTwo");

        System.out.println(
            list.insert(
                elemInsertTwo,
                2
            )
        );

        System.out.println(
            list.getSize()
        );

        System.out.println(
            list.getLast().print()
        );

        System.out.println(
            list.find(
                elemInsertTwo.getId()
            ).print()
        );

        System.out.println(
            list.getSize()
        );

        System.out.println(
            list.find(
                elemInsertTwo.getId()
            ).print()
        );

        System.out.println(
            list.remove(2)
        );

        System.out.println(
            list.find(
                elemInsertTwo.getId()
            )
        );

        DoublyLinkedList doublyList = new DoublyLinkedList();
        ElementBack elemBack = new ElementBack("HELLO");
        doublyList.pushFirst(elemBack);
        
        System.out.println(
            doublyList.getFirst().print()
        );

        System.out.println(
            doublyList.getSize()
        );

        doublyList.pushBack(new ElementBack("WORLD"));

        System.out.println(
            doublyList.getSize()
        );

        System.out.println(
            doublyList.getEnd().getName()
        );

        System.out.println(
            doublyList.getFirst().getName()
        );

        System.out.println(
            doublyList.removeBack()
        );

        System.out.println(doublyList.getSize());

        System.out.println(
            doublyList.removeBack()
        );

        System.out.println(doublyList.getSize());

        System.out.println(doublyList.removeFirst());


    }
}
