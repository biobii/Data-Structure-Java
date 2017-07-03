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
public class MergeSorting {
    
    private int[] arr;
    private int nElemen;
    
    public MergeSorting(int max) {
        arr = new int[max];
        nElemen = 0;
    }
    
    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }
    
    public void display() {
        for(int i = 0; i < nElemen; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public void mergeSort() {
        int[] workSpace = new int[nElemen];
        recMergeSort(workSpace, 0, nElemen-1);
    }
    
    private void recMergeSort(int[] workSpace, int lowerBound, int upperBound) {
        if(lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid+1, upperBound);
            merge(workSpace, lowerBound, mid+1, upperBound);
        }
    }
    
    private void merge(int[] workSpace, int lowPtr, int highPtr, int upperBound) {
        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr-1;
        int n = upperBound-lowerBound+1;
        
        while(lowPtr <= mid && highPtr <= upperBound) {
            if(arr[lowPtr] < arr[highPtr]) {
                workSpace[j++] = arr[lowPtr++];
            } else {
                workSpace[j++] = arr[highPtr++];
            }
        }
            while(lowPtr <= mid) {
                workSpace[j++] = arr[lowPtr++];
            }
            
            while(highPtr <= upperBound) {
                workSpace[j++] = arr[highPtr++];
            }
            
            for(j = 0; j < n; j++) {
                arr[lowerBound+j] = workSpace[j];
            }
        }
    }
    

