/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum07.BinaryTrees;
import Praktikum07.BinaryTrees.Stack;
/**
 *
 * @author Biobii
 */
public class Tree {
    
    private Node root;
    
    public Tree() {
        root = null;
    }
    
    public void insert(int id, String data) {
        Node newNode = new Node();
        newNode.id = id;
        newNode.data = data;
        if(root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while(true) {
                parent = current;
                if(current.id == id) {
                    System.out.println("Can't insert! " + id + " already exist!");
                    return;
                } else if(id < current.id) {
                    current = current.leftChild;
                    if(current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(".................................................................");
        while(isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for(int j = 0; j < nBlanks; j++) {
                System.out.print(' ');
            }
            while(globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if(temp != null) {
                    System.out.print(temp.id);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if(temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j = 0; j < nBlanks * 2 - 2; j++) {
                    System.out.print(' ');
                }
            }
            System.out.println();
            nBlanks /= 2;
            while(localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }
        }
        System.out.println(".................................................................");
    }
    
    /*********************
     ******* SATU ********
     ********************/
    
    public void minimum() {
        Node current, last;
        current = root;
        last = null;
        while(current != null) {
            last = current;
            current = current.leftChild;
        }
        last.displayNode();
    }
    
    public void maximum() {
        Node current = root;
        Node last = null;
        while(current != null) {
            last = current;
            current = current.rightChild;
        }
        last.displayNode();
    }
    
}
