/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi04.LinkedList;

/**
 *
 * @author Biobii
 */
public class SingleLinkedList {
    
    private SingleLink first;
    
    public SingleLinkedList(){
        first = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void insertFirst(int Data){
        SingleLink newLink = new SingleLink(Data);
        newLink.next = first;
        first = newLink;
    }
    
    public SingleLink deleteFirst(){
        SingleLink temp = first;
        first = first.next;
        return temp;
    }
    
    public SingleLink find(int key){
        SingleLink current = first;
        while(current.Data != key){
            if(current.next == null){
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }
    
    public SingleLink delete(int key){
        SingleLink current = first;
        SingleLink previous = first;
        while(current.Data != key){
            if(current.next == null){
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if(current == first){
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }
    
    public void displayList(){
        System.out.println("List(first --> last):");
        SingleLink current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    
}
