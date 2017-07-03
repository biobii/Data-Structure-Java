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
public class DataArray {
    
    private Mahasiswa[] mhs;
    private int nElemen;
    
    public DataArray(int max) {
        mhs = new Mahasiswa[max];
        nElemen = 0;
    }
    
    public void insert(long nim, String nama, String asal) {
        mhs[nElemen] = new Mahasiswa(nim, nama, asal);
        nElemen++;
    }
    
    public void displayArray() {
        for(int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
        System.out.print("\n");
    }
    
    public void BubbleSort(){
        int batas, i;
        for(batas = nElemen-1; batas > 0; batas--){
            for(i = 0; i < batas; i++){
                if(mhs[i].getNim() > mhs[i+1].getNim()){
                    swap(i,i+1);
                }
            }
        }
        System.out.println("Sorting Mahasiswa by NIM (Bubble)");
        displayArray();
    }
    
    public void SelectionSort(){
        int awal, i, min;
        for(awal = 0; awal < nElemen-1; awal++){
            min = awal;
            for(i = awal+1; i < nElemen; i++){
                if(mhs[i].getNim() < mhs[min].getNim()){
                    min = i;
                }
            }
            swap(awal,min);
        }
        System.out.println("\nSorting Mahasiswa by NIM (Selection)");
        displayArray();
    }
    
    public void swap(int one, int two){
        
        Mahasiswa temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }
    
    public void insertionSortbyName(){
        int i,curIn;
        for (curIn = 1; curIn < nElemen; curIn++) {
            Mahasiswa temp = mhs[curIn];
            i = curIn;
            while (i>0 && mhs[i-1].getNama().compareTo(temp.getNama()) > 0) {                
                mhs[i]=mhs[i-1];
                i--;
            }
            mhs[i] = temp;
        }
        System.out.println("Sorting Mahasiswa by NAME");
        displayArray();
    }
    
}
