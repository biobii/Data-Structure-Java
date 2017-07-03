/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum04.LinkedList;

/**
 *
 * @author Biobii
 */
class Link {
    
    public int iData;
    public String sData;
    public Link next;
    
    public Link(int iData, String sData){
        this.iData = iData;
        this.sData = sData;
    }
    
    public void displayLink(){
        System.out.println("{" + iData + ", " + sData + "}");
    }
    
}

class LinkList {
    
    private Link first;
    
    public LinkList(){
        first = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void insertFirst(int iData, String sData){
        Link newLink = new Link(iData, sData);
        newLink.next = first;
        first = newLink;
    }
    
    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }
    
    public void displayList(){
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    
}

class LinkStack {
    
    private LinkList theList;
    
    public LinkStack(){
        theList = new LinkList();
    }
    
    public void push(int iData, String sData) {
        theList.insertFirst(iData, sData);
    }
    
    public void pop(){
        theList.deleteFirst();
    }
    
    public boolean isEmpty(){
        return (theList.isEmpty());
    }
    
    public void displayStack(){
        System.out.println("Stack (top --> bottom): ");
        theList.displayList();
    }
    
}

public class LinkStackApp {
    
    public static void main(String[] args) {
        
        LinkStack theStack = new LinkStack();
        
        theStack.push(1, "VCD");
        theStack.push(2, "TV");
        theStack.displayStack();
        
        theStack.push(3, "Kulkas");
        theStack.push(4, "PC");
        theStack.push(5, "Rice cooker");
        theStack.push(6, "Dispenser");
        theStack.displayStack();
        
        theStack.pop();
        theStack.pop();
        theStack.displayStack();
        
    }
    
}
