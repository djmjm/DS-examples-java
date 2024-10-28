package br.com.ds.stack.examples;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        TowerOfHanoi objGame = new TowerOfHanoi(10);
        Scanner input = new Scanner(System.in);

        TowerOfHanoi.Movements from, to;

        System.out.println("TORRE DE HANOI");
        System.out.println("Bem vindo ao jogo!");
        System.out.println("Digite algo para continuar ....");

        input.next();

        while (true) { 
           clearScreen();
            
            System.out.println("TORRE DE HANOI");
            System.out.println("__________________");

            System.out.println(objGame.print());

            System.out.println("__________________");

            System.out.println("Selecione a pilha para retirar um numero");
            System.out.println("1 - pilha 1");
            System.out.println("2 - pilha 2");
            System.out.println("3 - pilha 3");

            try{
                int op = input.nextInt();
                from = checkOptionMovement(op);

                System.out.println("Selecione a pilha para Acrescentar um numero");
                System.out.println("1 - pilha 1");
                System.out.println("2 - pilha 2");
                System.out.println("3 - pilha 3");

                op = input.nextInt();
                to = checkOptionMovement(op);

                objGame.move(from, to);
    
    
            }catch(InputMismatchException err){
                clearScreen();
                System.out.println("Opção invalida!");

                input.next();input.next();
            }

            clearScreen();

            if(objGame.win()){
                System.out.println("Você ganhou!");
                input.next();
                input.close();
                return;
            }
        }

    }

    private static TowerOfHanoi.Movements checkOptionMovement(int option)
    throws InputMismatchException
    {
        if(option == 1){  return TowerOfHanoi.Movements.STACK1;  }else
        if(option == 2){  return TowerOfHanoi.Movements.STACK2;  }else
        if(option == 3){  return TowerOfHanoi.Movements.STACK3;  }else{
            throw new InputMismatchException("Opção invalida");
        }
    }

    private static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
