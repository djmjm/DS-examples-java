package br.com.ds.tree;

import br.com.ds.list.Element;

public class Main {
    public static void main(String[] Args){
        /*BinaryTree tree = new BinaryTree();

        System.out.println(tree.getSize());
        System.out.println(tree.insert(new Element("Cissa")));
        System.out.println(tree.insert(new Element("Jake")));
        System.out.println(tree.insert(new Element("Bidu")));
        System.out.println(tree.insert(new Element("Uchira")));
        System.out.println(tree.insert(new Element("Pirata")));
        System.out.println(tree.insert(new Element("Cachorro")));
        System.out.println(tree.insert(new Element("Gato")));
        System.out.println(tree.insert(new Element("Vira lata")));

        System.out.println(tree.getSize());

        System.out.println(tree.printInOrder());
        System.out.println(tree.printPreOrder());
        System.out.println(tree.printWidth());*/

        AVLTree tree2 = new AVLTree();
        System.out.println(tree2.getSize());

        System.out.println(tree2.insert(new Element("Cissa")));
        System.out.println(tree2.insert(new Element("Jake")));
        System.out.println(tree2.insert(new Element("Bidu")));
        System.out.println(tree2.insert(new Element("Uchira")));
        System.out.println(tree2.insert(new Element("Pirata")));
        System.out.println(tree2.insert(new Element("Cachorro")));
        System.out.println(tree2.insert(new Element("Gato")));
        System.out.println(tree2.insert(new Element("Vira lata")));

        //System.out.println(tree2.isBalanceTree());

        System.out.println(tree2.getSize());

        System.out.println(tree2.printInOrder());
        System.out.println(tree2.printPreOrder());
        System.out.println(tree2.printWidth());


    }
}
