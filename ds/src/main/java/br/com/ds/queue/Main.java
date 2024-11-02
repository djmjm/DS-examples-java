package br.com.ds.queue;

public class Main {
    public static void main(String[] args){
        Queue queue = new Queue(5);

        System.out.println(
            queue.print()
        );
        System.out.println(
            queue.peek()
        );

        queue.enqueue(5);
        queue.enqueue(9);
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);

        System.out.println(queue.print());

        System.out.println(
            queue.peek()
        );

        queue.dequeue();

        System.out.println(
            queue.peek()
        );

        queue.dequeue();

        System.out.println(
            queue.peek()
        );

        queue.dequeue();

        System.out.println(
            queue.peek()
        );

        queue.dequeue();

        System.out.println(
            queue.peek()
        );

        queue.dequeue();

        System.out.println(
            queue.peek()
        );

        queue.enqueue(999);

        System.out.println(
            queue.print()
        );

        queue.enqueue(-2);

        System.out.println(
            queue.print()
        );

        System.out.println(
            queue.peek()
        );

        


    }
}
