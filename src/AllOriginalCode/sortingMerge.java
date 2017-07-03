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
public class sortingMerge {

    private int[] array;
    private int nElemen;

    public sortingMerge(int max) {
        array = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        array[nElemen] = value;
        nElemen++;
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public void mergeSort() {
        int[] workSpace = new int[nElemen];
        recMergeSort(workSpace, 0, nElemen - 1);
    }

    private void recMergeSort(int[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid + 1, upperBound);
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    private void merge(int[] workSpace, int lowPtr,
        int highPtr, int upperBound) {
        int j = 0; // workspace index
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1;
        while (lowPtr <= mid && highPtr <= upperBound) {
            if (array[lowPtr] < array[highPtr]) {
                workSpace[j++] = array[lowPtr++];
            } else {
                workSpace[j++] = array[highPtr++];
            }
        }
        while (lowPtr <= mid) {
            workSpace[j++] = array[lowPtr++];
        }
        while (highPtr <= upperBound) {
            workSpace[j++] = array[highPtr++];
        }
        for (j = 0; j < n; j++) {
            array[lowerBound + j] = workSpace[j];
        }
    }
}
