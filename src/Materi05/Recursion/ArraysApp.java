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
public class ArraysApp {
    
    public static void main(String[] args) {
        
        Arrays arr;
        arr = new Arrays(10);
        
        arr.insert(52);
        arr.insert(83);
        arr.insert(10);
        arr.insert(8);
        arr.insert(35);
        arr.insert(20);
        arr.insert(2);
        arr.insert(55);
        arr.insert(25);
        arr.insert(70);
        
        System.out.println("Data sebelum diurutkan :");
        arr.display();
        
        arr.mergeSort();
        
        System.out.println("Data setelah diurutkan :");
        arr.display();
    }
    
}
