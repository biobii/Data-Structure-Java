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
public class SortingQuick {
    
    private int[] arr;
    private int nElemen;
    
    public SortingQuick(int max) {
        arr = new int[max];
        nElemen = 0;
    }
    
    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }
    
    public void quickSort() {
        recQuickSort(0, nElemen-1);
    }
    
    public void recQuickSort(int batasKiri, int batasKanan) {
        if(batasKanan - batasKiri <= 0) {
            return;
        } else {
            int pivot = arr[batasKanan];
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            recQuickSort(batasKiri, partisi-1);
            recQuickSort(partisi + 1, batasKanan);
        }
    }
    
    public int partitionIt(int batasKiri, int batasKanan, int pivot) {
        int indexKiri = batasKiri-1;
        int indexKanan = batasKanan;
        while(true) {
            while(indexKiri < batasKanan && arr[++indexKiri] < pivot);
            while(indexKanan > batasKiri && arr[--indexKanan] > pivot);
            if(indexKiri >= indexKanan) {
                break;
            } else {
                swap(indexKiri, indexKanan);
            }
        }
        swap(indexKiri, batasKanan);
        return indexKiri;
    }
    
    public void swap(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public void display() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
