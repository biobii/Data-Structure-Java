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
        
        //NIM
        public void shellSort() {
        int in, out;
        Mahasiswa temp;
        int h = 1;
        while(h <= nElemen/3) {
            h = h*3+1;
        }
        while(h > 0) {
            for(out = h; out < nElemen; out++) {
                temp = mhs[out];
                in = out;
                while(in > h-1 && mhs[in-h].getNim() >= temp.getNim()) {
                    mhs[in] = mhs[in-h];
                    in -= h;
                }
                mhs[in] = temp;
            }
            h = (h-1) / 3;
        }
        System.out.println("Data Mahasiswa Setelah Diurutkan NIM (ShellSort)");
        displayArray();
    }
   
   //QUICK NAMA
    public void quickSort() {
        recQuickSort(0, nElemen-1);
        System.out.println("Data Mahasiswa Setelah Diurutkan Nama (QuickSort)");
        displayArray();
    }
    
    public void recQuickSort(int batasKiri, int batasKanan) {
        if(batasKanan - batasKiri <= 0) {
            return;
        } else {
            Mahasiswa pivot = mhs[batasKanan];
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            recQuickSort(batasKiri, partisi-1);
            recQuickSort(partisi + 1, batasKanan);
        }
    }
    
    public int partitionIt(int batasKiri, int batasKanan, Mahasiswa pivot) {
        int indexKiri = batasKiri-1; //0
        int indexKanan = batasKanan; //8
        while(true) {
            while(mhs[++indexKiri].getNama().compareTo(pivot.getNama()) < 0 );
            while(indexKanan > batasKiri && mhs[--indexKanan].getNama().compareTo(pivot.getNama()) > 0);
            if(indexKiri >= indexKanan) {
                break;
            } else {
                swap(indexKiri, indexKanan);
            }
        }
        swap(indexKiri, batasKanan);
        return indexKiri;
    }
    
    public void swap(int one, int two){
        
        Mahasiswa temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }
    
     //MERGE NAMA
    public void mergeSort() {
        Mahasiswa[] workSpace = new Mahasiswa[nElemen];
        recMergeSort(workSpace, 0, nElemen-1);
        System.out.println("Data Mahasiswa Setelah Diurutkan NAMA (MergeSort)");
        displayArray();
    }
    
    private void recMergeSort(Mahasiswa[] workSpace, int bawah, int atas) {
        if(bawah == atas) {
            return;
        } else {
            int mid = (bawah + atas) / 2;
            recMergeSort(workSpace, bawah, mid);
            recMergeSort(workSpace, mid+1, atas);
            merge(workSpace, bawah, mid+1, atas);
        }
    }
    
    private void merge(Mahasiswa[] workSpace, int indexKiri, int indexKanan, int atas) {
        int j = 0;
        int bawah = indexKiri;
        int mid = indexKanan-1;
        int n = atas-bawah+1;
        
        while(indexKiri <= mid && indexKanan <= atas) {
            if(mhs[indexKiri].getNama().compareTo(mhs[indexKanan].getNama()) < 0) {
                workSpace[j++] = mhs[indexKiri++];
            } else {
                workSpace[j++] = mhs[indexKanan++];
            }
        }
            while(indexKiri <= mid) {
                workSpace[j++] = mhs[indexKiri++];
            }
            
            while(indexKanan <= atas) {
                workSpace[j++] = mhs[indexKanan++];
            }
            
            for(j = 0; j < n; j++) {
                mhs[bawah+j] = workSpace[j];
            }
        }
    }
