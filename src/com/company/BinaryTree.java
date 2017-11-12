package com.company;

public class BinaryTree<T extends Comparable<T>> {
    class Node {
         T value;
         Node left;
         Node right;

        public Node() {
            this.left = null;
            this.right = null;
        }

        public Node(T val) {
            this.value = val;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    private Node createNode(T val) {
        return new Node(val);
    }

    public void add(T val) {
        if (this.root == null) {
            this.root = new Node(val);
        } else {
            Node buff = this.root;
            while (true) {
                if (buff.value.compareTo(val) == 0) {
                    return;
                }
                if (buff.value.compareTo(val) > 0) {
                    if (buff.left == null) {
                        buff.left = this.createNode(val);
                        break;
                    } else {
                        buff = buff.left;
                    }
                } else {
                    if (buff.right == null) {
                        buff.right = this.createNode(val);
                        break;
                    } else {
                        buff = buff.right;
                    }
                }
            }
        }
    }

    public void remove(T val) {
        Node buffNode = this.root;
        if(this.root.value.compareTo(val) == 0){
            if (buffNode.right != null){
                Node newNode = buffNode.right;
                Node buff = buffNode.right.right;
                Node buffLeft = buffNode.left;
                if(newNode.left != null) {
                    while (newNode.left.left != null){
                        newNode = newNode.left;
                    }
                    newNode.left.left = buffNode.left;
                    this.root = newNode.left;
                    newNode.left = newNode.left.right;
                    this.root.right = newNode;
                    return;
                } else {
                    buffNode.left = buffNode.left.right;
                    buffNode.left.right = buffLeft;
                    return;
                }
            }
        }
        while (buffNode != null){
            if(buffNode.left != null && buffNode.left.value.compareTo(val) == 0){
                Node newNode = buffNode.left.right;
                Node buff = buffNode.left.right;
                Node buffLeft = buffNode.left.left;
                if(newNode.left != null) {
                    while (newNode.left.left != null){
                        newNode = newNode.left;
                    }
                    newNode.left.left = buffNode.left.left;
                    buffNode.left = newNode.left;
                    newNode.left = newNode.left.right;
                    buffNode.left.right = buff;
                    return;
                } else {
                    buffNode.left = buffNode.left.right;
                    buffNode.left.left = buffLeft;
                    return;
                }
            }
            if (buffNode.right != null && buffNode.right.value.compareTo(val) == 0){
                Node newNode = buffNode.right.right;
                Node buff = buffNode.right.right;
                Node buffLeft = buffNode.right.left;
                if(newNode.left != null) {
                    while (newNode.left.left != null){
                        newNode = newNode.left;
                    }
                    newNode.left.left = buffNode.right.left;
                    buffNode.right = newNode.left;
                    newNode.left = newNode.left.right;
                    buffNode.right.right = buff;
                    return;
                } else {
                    buffNode.left = buffNode.left.right;
                    buffNode.left.right = buffLeft;
                    return;
                }
            }
            if (buffNode.value.compareTo(val) > 0){
                buffNode = buffNode.left;
            } else {
                buffNode = buffNode.right;
            }
        }
    }

    public boolean contains(T val) {
        if (this.root.value.compareTo(val) == 0) {
            return true;
        } else {
            Node buff = this.root;
            while (buff != null) {
                if (buff.value.compareTo(val) > 0) {
                    if (buff.left != null && (buff.left.value.compareTo(val) == 0)) {
                        return true;
                    } else {
                        buff = buff.left;
                    }
                } else {
                    if (buff.right != null && (buff.right.value.compareTo(val) == 0)) {
                        return true;
                    } else {
                        buff = buff.right;
                    }
                }
            }
        }
        return false;
    }

    private void traversalPrefix(Node top) {
        System.out.print(top.value.toString() + " ");
        if (top.left != null) {
            this.traversalPrefix(top.left);
        }
        if (top.right != null) {
            this.traversalPrefix(top.right);
        }
    }

    public void traversalPrefix() {
        System.out.println("Travers Root-Left-Right");
        this.traversalPrefix(this.root);
        System.out.println('\n');
    }


    private void traversalPostfix(Node top) {
        if (top.left != null) {
            this.traversalPostfix(top.left);
        }
        if (top.right != null) {
            this.traversalPostfix(top.right);
        }
        System.out.print(top.value.toString() + " ");
    }

    public void traversalPostfix() {
        System.out.println("Travers Left-Right-Root");
        this.traversalPostfix(this.root);
        System.out.println('\n');
    }

    private void traversalInfix(Node top) {
        if (top.left != null) {
            this.traversalInfix(top.left);
        }
        if (top.right != null) {
            System.out.print(top.value.toString() + " ");
            this.traversalInfix(top.right);
            return;
        }
        System.out.print(top.value.toString() + " ");
    }

    public void traversalInfix() {
        System.out.println("Travers Left-Root-Right");
        this.traversalInfix(this.root);
        System.out.println('\n');
    }
}
