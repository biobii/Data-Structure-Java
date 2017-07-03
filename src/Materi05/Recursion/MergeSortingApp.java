/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi05.Recursion;

/**
 *
 * @author Biobii
 */
public class MergeSortingApp {
    
    public static void main(String[] args) {
        
        MergeSorting arr;
        arr = new MergeSorting(12);
        
        arr.insert(15);
        arr.insert(5);
        arr.insert(25);
        arr.insert(10);
        arr.insert(30);
        arr.insert(20);
        arr.insert(40);
        arr.insert(35);
        arr.insert(90);
        arr.insert(70);
        arr.insert(60);
        arr.insert(50);
        
        arr.mergeSort();
        arr.display();
        
        
    }
    
}
