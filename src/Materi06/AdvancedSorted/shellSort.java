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
public class shellSort {
    
    private int[] arr;
    private int nElemen;
    
    public shellSort(int max) {
        arr = new int[max];
        nElemen = 0;
    }
    
    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }
    
    public void shellSort() {
        int in, out;
        int temp;
        //int h = nElemen/2;
        
        int h = 1;
        while(h <= nElemen/3) {
            h = h*3+1;
        }
        
        while(h > 0) {
            for(out = h; out < nElemen; out++) {
                temp = arr[out];
                in = out;
                while(in > h-1 && arr[in-h] >= temp) {
                    arr[in] = arr[in-h];
                    in -= h;
                }
                arr[in] = temp;
                display();
            }
            //h /= 2;
            h = (h-1)/3;
        }
    }
    
//    FIXED
//    public void shellSort() {
//        int in, out;
//        int temp;
//        int h = 1;
//        while(h <= nElemen/3) {
//            h = h*3+1;
//        }
//        while(h > 0) {
//            for(out = h; out < nElemen; out++) {
//                temp = arr[out];
//                in = out;
//                while(in > h-1 && arr[in-h] >= temp) {
//                    arr[in] = arr[in-h];
//                    in -= h;
//                }
//                arr[in] = temp;
//            }
//            h = (h-1) / 3;
//        }
//    }
    
    public void display() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
}
