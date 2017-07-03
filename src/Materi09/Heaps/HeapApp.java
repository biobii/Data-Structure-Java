/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi09.Heaps;

/**
 *
 * @author ASUS
 */
public class HeapApp {
    
    public static void main(String[] args) {
        
        Heap hp = new Heap(10);
        hp.insert(20);
        hp.insert(50);
        hp.insert(10);
        hp.insert(90);
        hp.insert(70);
        hp.insert(30);
        hp.insert(10);
        hp.displayHeap();
        hp.remove();
        hp.displayHeap();
        hp.change(4, 60);
        hp.displayHeap();
        
    }
    
}
