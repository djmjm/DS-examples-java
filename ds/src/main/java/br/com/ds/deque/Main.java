package br.com.ds.deque;

public class Main {
    public static void main(String[] Args){
        Deque deque = new Deque(5);

        System.out.println(deque.enqueueFirst(1));
        System.out.println( deque.peekLast());

        System.out.println(deque.enqueueFirst(2));
        System.out.println( deque.peekLast());

        System.out.println(deque.enqueueFirst(3));
        System.out.println( deque.peekLast());

        System.out.println(deque.enqueueFirst(4));
        System.out.println( deque.peekLast());

        System.out.println(deque.enqueueFirst(5));
        System.out.println( deque.peekLast());

        System.out.println(deque.enqueueFirst(55));
        System.out.println( deque.peekLast());

        System.out.println(deque.print());

        System.out.println(deque.dequeueLast());
        System.out.println( deque.peekLast());

        System.out.println(deque.print());

    }
}
