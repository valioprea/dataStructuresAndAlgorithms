package org.example;

public class Main {
    public static void main(String[] args) {
        // Binary tree = a tree where each node has NO MORE than two children

        // Binary search tree = values are arranged in a certain order.
        // Root node has a value > left value and < than right value
        // The leftmost child should be the least value and the rightmost value the max one

        // They should be arranged like this for quick lookup

        // Runtime complexity: O(log n) in best case

        //Binary Search Tree = A tree data structure, where each node is greater than it's left child,
        //		                         but less than it's right.

        //					   benefit: easy to locate a node when they are in this order

        //					   time complexity: best case  O(log n)
        //									 worst case O(n)

        //					   space complexity: O(n)

        // !!! ATTENTION
        // the order in which you insert nodes into a bst matters if it's unbalanced
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

//        tree.remove(1);

        tree.display();
        System.out.println(tree.search(19));
        tree.remove(0);
    }
}