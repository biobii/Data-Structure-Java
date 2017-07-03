/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum09.Heaps;

/**
 *
 * @author ASUS
 */
public class HeapSortApp {
    
    public static void main(String[] args) {
        
        int size = 50;
        
        Heap hp = new Heap(size);
        
        //isi value random
        for (int i = 0; i < size; i++) {
            int random = (int)(java.lang.Math.random()*100);
            Node newNode = new Node(random);
            hp.insertAt(i, newNode);
            hp.currentSize();
        }
        
        System.out.print("Sebelum sorting: ");
        hp.displayArray();
        hp.heapSort();
        System.out.print("Setelah sorting: ");
        hp.displayArray();
        
    }
    
}
