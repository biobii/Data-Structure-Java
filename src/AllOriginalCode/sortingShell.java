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
public class sortingShell {
    
    private int[] array;
    private int nElemen;
    
    public sortingShell(int max) {
        array = new int[max];
        nElemen = 0;
    }
    
    public void insert(int value) {
        array[nElemen] = value;
        nElemen++;
    }
    
    public void display() {
        System.out.print("A = ");
        for(int i = 0; i < nElemen; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
    public void shellSort() {
        int inner, outer;
        int temp;
        
        //using Knuth interval
        int h = 1;
        while(h <= nElemen/3) {
            h = h * 3 + 1;
        }
        
        while(h > 0) {
            for(outer = h; outer < nElemen; outer++) {
                temp = array[outer];
                inner = outer;
                while(inner > h-1 && array[inner-h] >= temp) {
                    array[inner] = array[inner-h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h-1) / 3;
        }
    }
    
}
