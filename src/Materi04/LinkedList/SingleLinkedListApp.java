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
public class SingleLinkedListApp {
    
    public static void main(String[] args) {
        
        SingleLinkedList theList = new SingleLinkedList();
        
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);
        theList.displayList();
        
        while(!theList.isEmpty()){
            SingleLink aLink = theList.deleteFirst();
            System.out.print("Deleted ");
            aLink.displayLink();
            System.out.println("");
        }
        
        theList.displayList();
        
        theList.insertFirst(33);
        theList.insertFirst(55);
        theList.insertFirst(77);
        theList.insertFirst(88);
        theList.displayList();
        
        SingleLink f = theList.find(77);
        
        if(f != null){
            System.out.println("Ketemu... " + f.Data);
        } else {
            System.out.println("Link tidak ditemukan!");
        }
        
        SingleLink d = theList.delete(88);
        
        if(d != null){
            System.out.println("Hapus link dengan key " + d.Data);
        } else {
            System.out.println("Link tidak ditemukan");
        }
        
        theList.displayList();
        
    }
    
}
