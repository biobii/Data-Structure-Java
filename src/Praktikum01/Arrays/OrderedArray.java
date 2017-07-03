/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum01.Arrays;

/**
 *
 * @author Biobii
 */

public class OrderedArray {
    
    private int[] data;
    private int nElemen;
    
    public OrderedArray(int max) {
        data = new int[max];
        nElemen = 0;
    }
    
    public void insert(int value){
        data[nElemen] = value;
        int i = nElemen;
        int index;
        int dataLength = data.length;
        while(i < dataLength) {
            int temp = data[nElemen];
            for(index = i; index > 0; index--) {
                if(temp < data[index-1]) {
                    data[index] = data[index-1];
                } else {
                    break;
                }
            }
            data[index] = temp;
            i++;
        }
        nElemen++;
    }
    
    public void display() {
        System.out.print(">> Isi Data : ");
        for(int i = 0; i < nElemen; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
    
    public void size() {
        int kapasitas = data.length;
        int terpakai = nElemen;
        int kosong = data.length-nElemen;
        System.out.println(">> Kapasitas Array = " + kapasitas);
        System.out.println(">> Data terpakai = " + terpakai);
        System.out.println(">> Slot tersedia = " + kosong);
    }
    
    public void find(int key) {
        int low = 0;
        int high = nElemen-1;
        int mid = (low+high)/2;
        int midValue;
        int index = 0;
        boolean ketemu = false;
        
        while(low <= high) {
            midValue = data[mid];
            if(key == midValue) {
                index = mid;
                ketemu = true;
                break;
            } else {
                if(key > midValue) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
                mid = (low+high)/2;
            }
        }
        if(ketemu) {
            System.out.println(">> " + key + " ditemukan pada index ke " + index);
        } else {
            System.out.println(">> " + key + " tidak ditemukan!");
        }
    }
    
}
