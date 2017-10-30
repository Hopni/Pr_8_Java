package com.company;

public class BinaryTree {
    class Node {
        public int value;
        public Node left;
        public Node right;

        public Node() {
            this.left = null;
            this.right = null;
        }

        public Node(int val) {
            this.value = val;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    private Node createNode(int val) {
        return new Node(val);
    }

    public void add(int val) {
        if (this.root == null) {
            this.root = new Node(val);
        } else {
            Node buff = this.root;
            while (true) {
                if (buff.value == val) {
                    return;
                }
                if (buff.value > val) {
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

    public void remove(int val) {
        if (this.root.value == val) {
            if (this.root.right != null) {
                Node buffLeftBranch = root.left;
                root = root.right;
                if (buffLeftBranch != null) {
                    Node buff = root;
                    while (buff.left != null) {
                        buff = buff.left;
                    }
                    buff.left = buffLeftBranch;
                }
                return;
            } else {
                this.root = this.root.left;
                return;
            }
        }
        Node buff = this.root;
        while (buff != null) {
            if (buff.value > val) {
                if (buff.left != null && buff.left.value == val) {
                    if (buff.left.right != null) {
                        Node buffLeftBranch = buff.left.left;
                        buff.left = buff.left.right;
                        Node newLeftBranch = buff.left;
                        while (newLeftBranch.left != null) {
                            newLeftBranch = newLeftBranch.left;
                        }
                        newLeftBranch.left = buffLeftBranch;
                        return;
                    } else {
                        buff.left = buff.left.left;
                        return;
                    }
                } else {
                    buff = buff.left;
                }
            } else {
                if (buff.right != null && buff.right.value == val) {
                    if (buff.right.right != null) {
                        Node buffLeftBranch = buff.right.left;
                        buff.right = buff.right.right;
                        Node newLeftBranch = buff.right.left;
                        while (newLeftBranch.left != null) {
                            newLeftBranch = newLeftBranch.left;
                        }
                        newLeftBranch.left = buffLeftBranch;
                        return;
                    } else {
                        buff.right = buff.right.left;
                        return;
                    }
                } else {
                    buff = buff.right;
                }
            }
        }
    }

    public boolean contains(int val) {
        if (this.root.value == val) {
            return true;
        } else {
            Node buff = this.root;
            while (buff != null) {
                if (buff.value > val) {
                    if (buff.left != null && buff.left.value == val) {
                        return true;
                    } else {
                        buff = buff.left;
                    }
                } else {
                    if (buff.right != null && buff.right.value == val) {
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
        System.out.print(top.value + " ");
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
        System.out.print(top.value + " ");
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
            System.out.print(top.value + " ");
            this.traversalInfix(top.right);
            return;
        }
        System.out.print(top.value + " ");
    }

    public void traversalInfix() {
        System.out.println("Travers Left-Root-Right");
        this.traversalInfix(this.root);
        System.out.println('\n');
    }
}
