/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi07.BinaryTrees;

/**
 *
 * @author Biobii
 */
public class Stack {
    
    private int maxSize;
    private int[] stackArray;
    private int top;
    
    public Stack() {
        stackArray = new int[maxSize];
        top = -1;
    }
    
    public void push(int value) {
        stackArray[++top] = value;
    }
    
    public int pop() {
        return stackArray[top--];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
}
