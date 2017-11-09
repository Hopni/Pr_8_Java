package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryTree<SpecialNumber> tree = new BinaryTree<SpecialNumber>();
        tree.add(new SpecialNumber(5));
        tree.add(new SpecialNumber(7));
        tree.add(new SpecialNumber(7));
        tree.add(new SpecialNumber(3));
        tree.add(new SpecialNumber(4));
        tree.add(new SpecialNumber(2));
        tree.add(new SpecialNumber(1));
        tree.add(new SpecialNumber(6));
        tree.add(new SpecialNumber(10));
        tree.add(new SpecialNumber(9));
        tree.add(new SpecialNumber(11));
        tree.add(new SpecialNumber(12));
        tree.remove(new SpecialNumber(3));
        tree.remove(new SpecialNumber(7));
        tree.remove(new SpecialNumber(5));
        tree.remove(new SpecialNumber(20));
        System.out.println(tree.contains(new SpecialNumber(10)));
        System.out.println(tree.contains(new SpecialNumber(7)));
        System.out.println(tree.contains(new SpecialNumber(12)));
        tree.traversalInfix();
        tree.traversalPostfix();
        tree.traversalPrefix();
    }
}
