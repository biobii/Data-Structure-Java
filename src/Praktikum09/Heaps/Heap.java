/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum09.Heaps;

/**
 *
 * @author ASUS
 */
public class Heap {
    
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;
    
    public Heap(int size) {
        maxSize = size;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }
    
    public void insertAt(int index, Node newValue) {
        heapArray[index] = newValue;
    }
    
    public void currentSize() {
        currentSize++;
    }
    
    public Node remove() {
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }
    
    public void trickleDown(int index) {
        int largerChild;
        Node top = heapArray[index];
        while(index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            
            if(rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()) {
                largerChild = rightChild;
            } else {
                largerChild = leftChild;
            }
            if(top.getKey() >= heapArray[largerChild].getKey()) {
                break;
            }
            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = top;
    }
    
    public void displayArray() {
        for (int j = 0; j < maxSize; j++) {
            System.out.print(heapArray[j].getKey() + " ");
        }
        System.out.println("");
    }
    
    public void heapSort() {
        int j;
        for (j = maxSize/2-1; j >= 0; j--) {
            trickleDown(j);
        }
        
        for(j = maxSize-1; j >= 0; j--) {
            Node newNode = remove();
            insertAt(j, newNode);
        }
    }
    
}
