/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllOriginalCode;

import java.util.Scanner;

/**
 *
 * @author Biobii
 */
public class binarySearch {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //data urut
        int[] data = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        //print
        System.out.println(">> Data Array");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println("\n>> Masukkan nilai yang ingin dicari : ");
        int nilaiCari = scan.nextInt();
        boolean ketemu = false;
        int indeks = 0;

        //menentukan batas-batas pencarian
        //low = batas bawah, hight = batas atas, mid = batas tengah
        int low = 0;
        int high = data.length - 1;
        int mid = (low + high) / 2;
        int midValue;

        //pencarian
        while (low <= high) {
            midValue = data[mid];
            if (midValue == nilaiCari) {
                //nilai yang dicari ditemukan
                ketemu = true;
                indeks = mid;
                break;
            } else {
                //mengubah posisi index pencarian
                if (nilaiCari > midValue) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
                mid = (low + high) / 2;
            }
        }
        if (ketemu) {
            System.out.println("\n>> " + nilaiCari + " ditemukan di indeks ke-" + indeks);
        } else {
            System.out.println("\n>> " + nilaiCari + " tidak ditemukan");
        }

    }

}
