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

class qLink {
    
    public long nim;
    public String nama;
    public qLink next;
    
    public qLink(long nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
    
    public void displayLink(){
        System.out.println("\t" + nim + " " + nama);
    }
    
}

class FirstLastList {
    
    private qLink first;
    private qLink last;
    
    public FirstLastList(){
        first = null;
        last = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void insertLast(long nim, String nama){
        qLink newLink = new qLink(nim, nama);
        if(isEmpty()){
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }
    
    public long deleteFirst(){
        long temp = first.nim;
        if(first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }
    
    public void displayList(){
        qLink current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    
}

class LinkQueue {
    
    private FirstLastList theList;
    
    public LinkQueue(){
        theList = new FirstLastList();
    }
    
    public boolean isEmpty(){
        return theList.isEmpty();
    }
    
    public void insert(long nim, String nama){
        theList.insertLast(nim, nama);
    }
    
    public long remove() {
        return theList.deleteFirst();
    }
    
    public void displayQueue(){
        System.out.println("Queue (front --> rear): ");
        theList.displayList();
    }
    
}

public class LinkQueueApp {
    
    public static void main(String[] args) {
        
        LinkQueue theQueue = new LinkQueue();
        theQueue.insert(1665100, "Dee");
        theQueue.insert(1665200, "Deaja");
        theQueue.displayQueue();
        
        theQueue.insert(1665300, "Ami");
        theQueue.insert(1665400, "Haya");
        theQueue.insert(1665500, "Yati");
        theQueue.displayQueue();
        
        theQueue.remove();
        theQueue.remove();
        theQueue.displayQueue();
        
    }
    
}
