/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum02.SimpleSorting;

/**
 *
 * @author Biobii
 */
public class DataArrayApp {
    
    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);
        
        System.out.println("Data Mahasiswa Sebelum Diurutkan");
        arr.insert(16650270, "Agung", "Madiun");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650280, "Arina", "Malang");
        arr.insert(16650260, "Helmi", "Madura");
        arr.insert(16650220, "Ismail", "Banyuwangi");
        arr.insert(16650240, "Dinda", "Bandung");
        arr.insert(16650250, "Rais", "Ambon");
        arr.insert(16650200, "Jundi", "Malang");
        arr.insert(16650210, "Ahmad", "Sidoarjo");
        
        arr.displayArray();

        arr.BubbleSort();
        arr.SelectionSort();
        arr.insertionSortbyName();
        
    }
    
}
