package br.com.ds.tree;

import br.com.ds.list.Element;

public class Main {
    public static void main(String[] Args){
        BinaryTree tree = new BinaryTree();

        System.out.println(tree.getSize());
        System.out.println(tree.insert(new Element("Cissa")));
        System.out.println(tree.insert(new Element("Jake")));
        System.out.println(tree.insert(new Element("Bidu")));
        System.out.println(tree.insert(new Element("Uchira")));

        System.out.println(tree.getSize());

        System.out.println(tree.printWidth());
    }
}
