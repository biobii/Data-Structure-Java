/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum03.StackAndQueues;

/**
 *
 * @author Biobii
 */
public class DataOrang {

    private int maxSize;
    private String[] namaOrang;
    private int front;
    private int rear;
    private int nItems;

    public DataOrang(int size) {
        maxSize = size;
        namaOrang = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(String nama) {
        if (nItems == maxSize - 1) {
            System.out.println("Maaf " + nama + ", antrian masih penuh");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            namaOrang[++rear] = nama;
            nItems++;
            System.out.println(nama + " masuk antrian");
        }
    }

    public void peek() {
        for (int i = 0; i < nItems; i++) {
            System.out.print(namaOrang[i] + ", ");
        }
        System.out.print("\n");
    }

    public String remove() {
        String temp = namaOrang[front];
        namaOrang[front++] = "Kosong";

        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public int size() {
        return nItems;
    }

    public void keluar() {

        while (!isEmpty()) {
            System.out.println(remove() + " keluar dari antrian");
            for (int i = 0; i <= nItems; i++) {
                if (i >= front) {
                    System.out.print(namaOrang[i] + ", ");
                }
            }
            for (int i = 0; i < front; i++) {
                System.out.print(namaOrang[i] + ", ");
            }
            System.out.println("\n");
        }
        System.out.println(size() + " Person");
        for(int i = 0; i < front; i++){
            System.out.print(namaOrang[i] + ", ");
        }
    }

}
