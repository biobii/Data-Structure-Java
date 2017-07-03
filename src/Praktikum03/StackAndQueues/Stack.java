/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum03.StackAndQueues;

/**
 *
 * @author Biobii
 */
public class Stack {
    
    private int maxSize;
    private char[] charArray;
    private int top;
    
    public Stack(int max){
        maxSize = max;
        charArray = new char[maxSize];
        top= -1;
    }
    
    public void push(char item){
        charArray[++top] = item;
    }
    
    public char pop(){
        return charArray[top--];
    }
    
    public char peek(){
        return charArray[top];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
}
