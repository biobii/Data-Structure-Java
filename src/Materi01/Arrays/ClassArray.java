/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi01.Arrays;

/**
 *
 * @author Biobii
 */
public class ClassArray {
    
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        
        //tambahan nomer 2
        array = new int[20];
        
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }
    
}
