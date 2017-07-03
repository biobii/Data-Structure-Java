/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi06.AdvancedSorted;

/**
 *
 * @author Biobii
 */
public class shellSortApp {
    
    public static void main(String[] args) {
        
        shellSort arr;
        arr = new shellSort(8);
        
        arr.insert(20);
        arr.insert(50);
        arr.insert(5);
        arr.insert(10);
        arr.insert(15);
        arr.insert(2);
        arr.insert(99);
        arr.insert(25);
        arr.display();
        System.out.println("");
        arr.shellSort();
        arr.display();
    }
    
}
