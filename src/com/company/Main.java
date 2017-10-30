package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(5);
        tree.add(7);
        tree.add(7);
        tree.add(3);
        tree.add(4);
        tree.add(2);
        tree.add(1);
        tree.add(6);
        tree.add(10);
        tree.add(9);
        tree.add(11);
        tree.add(12);
        tree.remove(3);
        tree.remove(7);
        tree.remove(5);
        ArrayList<String> a = new ArrayList<String>();
        System.out.println(tree.contains(10));
        System.out.println(tree.contains(7));
        System.out.println(tree.contains(12));
        tree.traversalInfix();
        tree.traversalPostfix();
        tree.traversalPrefix();
    }
}