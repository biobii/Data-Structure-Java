/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum06.AdvancedSort;

/**
 *
 * @author Biobii
 */
public class DataArrayApp {
    
    public static void main(String[] args) {
        
        DataArray data;
        data = new DataArray(9);
        
        System.out.println("Data Mahasiswa Sebelum Diurutkan");
        data.insert(16650270, "Agung", "Madiun");
        data.insert(16650230, "Sofi", "Semarang");
        data.insert(16650280, "Arina", "Malang");
        data.insert(16650260, "Helmi", "Madura");
        data.insert(16650220, "Ismail", "Banyuwangi");
        data.insert(16650240, "Dinda", "Bandung");
        data.insert(16650250, "Rais", "Ambon");
        data.insert(16650200, "Jundi", "Malang");
        data.insert(16650210, "Ahmad", "Sidoarjo");
        
        data.displayArray();
        data.mergeSort();
        data.shellSort();
        data.quickSort();
        
    }
    
}
