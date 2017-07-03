/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllOriginalCode;

/**
 *
 * @author Biobii
 */
public class sortingShellApp {
    
    public static void main(String[] args) {
        
        int maxSize = 10;
        sortingShell arr;
        arr = new sortingShell(maxSize);
        
        arr.insert(20);
        arr.insert(5);
        arr.insert(25);
        arr.insert(15);
        arr.insert(30);
        arr.insert(10);
        arr.insert(50);
        arr.insert(35);
        arr.insert(45);
        arr.insert(40);
        
        arr.display();
        arr.shellSort();
        arr.display();
        
    }
    
}
