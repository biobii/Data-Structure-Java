/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas01.SortingObject;

/**
 *
 * @author Biobii
 */
public class FriendList {
    
    private Teman[] teman;
    private int nElemen;
    
    public FriendList(int max){
        teman = new Teman[max];
        nElemen = 0;
    }
    
    public void insert(String fullName, String nickName, String birthday, String tempatLahir, int tinggi){
        teman[nElemen] = new Teman(fullName, nickName, birthday, tempatLahir, tinggi);
        nElemen++;
    }
    
    public void insertionSortByNickName(){
        int i,curIn;
        for (curIn = 1; curIn < nElemen; curIn++) {
            Teman temp = teman[curIn];
            i = curIn;
            while (i>0 && teman[i-1].getNickName().compareTo(temp.getNickName()) > 0) {                
                teman[i] = teman[i-1];
                i--;
            }
            teman[i] = temp;
        }
        System.out.println("Sorting Teman by NickName");
        displayFriends();
    }
    
    public void displayFriends(){
        for(int i = 0; i < nElemen; i++){
            teman[i].displaySemua();
        }
        System.out.print("\n");
    }
    
    public void find(String key){
        int low = 0, high = nElemen-1, mid = (low+high)/2;
        Teman midValue;
        int posisi = 0;
        boolean ketemu = false;
        
        while(low <= high){
            midValue = teman[mid];
            if(key.compareToIgnoreCase(midValue.getNickName()) == 0){
                posisi = mid;
                ketemu = true;
                break;
            } else {
                if(key.compareToIgnoreCase(midValue.getNickName()) > 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
                mid = (low+high)/2;
            }
        }
        System.out.println(">> Pencarian: " + key);
        System.out.print("\t");
        if(ketemu){
            System.out.print(key + " berada di posisi ke " + posisi + "\n");
        } else {
            System.out.print(key + " tidak ditemukan!\n");
        }
    }
    
    public boolean delete(String value){
        int i;
        for(i = 0; i < nElemen; i++) {
            if(value == teman[i].getNickName()) {
                break;
            }
        }
        if(i == nElemen) {
            return false;
        } else {
            for(int j = i; j < nElemen; j++) {
                teman[j] = teman[j + 1];
            }
            nElemen--;
            System.out.println(">> Hapus:");
            System.out.print("\t");
            System.out.print(value + " berhasil dihapus!\n");
            return true;
        }
    }
    
}
