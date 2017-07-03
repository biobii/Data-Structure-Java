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
public class ClassArray2 {
    
    public static void main(String[] args) {
        
        int[] array = new int[100];
        int nElemen = 0;
        array[0] = 30;
        array[1] = 20;
        array[2] = 60;
        array[3] = 70;
        array[4] = 50;
        array[5] = 10;
        nElemen = 6;
        
        for(int i = 0; i < nElemen; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }
    
}
