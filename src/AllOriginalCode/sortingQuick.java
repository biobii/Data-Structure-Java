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
public class sortingQuick {

    private int[] array; // ref to array theArray
    private int nElemen; // number of data items

    public sortingQuick(int max) {
        array = new int[max]; // create the array
        nElemen = 0; // no items yet
    }

    public void insert(int value) {
        array[nElemen] = value; // insert it
        nElemen++; // increment size
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public void quickSort() {
        recQuickSort(0, nElemen - 1);
    }

    public void recQuickSort(int left, int right) {
        if (right - left <= 0) {
            return; // already sorted
        } else {
            int pivot = array[right];
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition - 1); // sort left side
            recQuickSort(partition + 1, right); // sort right side
        }
    }

    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1; // left (after ++)
        int rightPtr = right; // right-1 (after --)
        while (true) {
            // find bigger item
            while (array[++leftPtr] < pivot); // (nop)
            // find smaller item
            while (rightPtr > 0 && array[--rightPtr] > pivot); // (nop)
            if (leftPtr >= rightPtr) {
                break; // partition done
            } else // not crossed, so
            {
                swap(leftPtr, rightPtr); // swap elements
            }
        } // end while(true)
        swap(leftPtr, right); // restore pivot
        return leftPtr; // return pivot location
    }
    
    public void swap(int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
