package br.com.ds.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);

        System.out.println(stack.print());
        
        System.out.println("--------------------");

        for (int i = 0; i < 1000; i++) {
            stack.push((int) (Math.random() * 100));
        }

       System.out.println(stack.print());

       System.out.println("--------------------");

       stack.pop(); stack.pop();

       System.out.println(stack.print());

       System.out.println("--------------------");

       stack.push(1000);

       System.out.println(stack.print());
    }
}
