/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum07.BinaryTrees;

/**
 *
 * @author fall
 */
public class Stack {
    
    public Node[] theStack;
    public int top;
    
    public Stack() {
        theStack = new Node[100];
        top = -1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public void push(Node value) {
        theStack[++top] = value;
    }
    
    public Node pop() {
        return theStack[top--];
    }
    
}
