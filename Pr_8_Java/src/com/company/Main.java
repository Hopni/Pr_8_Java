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
        tree.add(new SpecialNumber(-10));
        tree.add(new SpecialNumber(6));
        tree.add(new SpecialNumber(11));
        tree.add(new SpecialNumber(9));
        tree.add(new SpecialNumber(8));
        tree.add(new SpecialNumber(10));
        tree.add(new SpecialNumber(12));
        tree.add(new SpecialNumber(-20));
        tree.add(new SpecialNumber(0));
        tree.add(new SpecialNumber(-5));
        tree.add(new SpecialNumber(-3));
        tree.add(new SpecialNumber(-2));
        tree.add(new SpecialNumber(-4));
        tree.add(new SpecialNumber(-30));
        tree.add(new SpecialNumber(-15));
        tree.traversalInfix();
        tree.remove(new SpecialNumber(-10));
        tree.traversalPrefix();
        tree.traversalInfix();
        tree.remove(new SpecialNumber(9));
        tree.traversalInfix();
        tree.remove(new SpecialNumber(7));
        tree.traversalInfix();
        tree.remove(new SpecialNumber(5));
        System.out.println("Remove 5");
        tree.traversalInfix();
        tree.remove(new SpecialNumber(20));
        tree.traversalInfix();
        System.out.println(tree.contains(new SpecialNumber(10)));
        System.out.println(tree.contains(new SpecialNumber(7)));
        System.out.println(tree.contains(new SpecialNumber(12)));
        tree.traversalInfix();
        tree.traversalPostfix();
        tree.traversalPrefix();
    }
}
