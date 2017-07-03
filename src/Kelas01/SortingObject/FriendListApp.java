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
public class FriendListApp {
    
    public static void main(String[] args) {
        
        int maxSize = 10;
        FriendList bio;
        bio = new FriendList(maxSize);
        
        System.out.println("List sebelum disorting :");
        bio.insert("Baso Akbar Usman", "Baso", "28-01-1999", "Palopo", 169);
        bio.insert("M Robih Thuuluz Zaman", "Obi", "09-08-1997", "Gresik", 157);
        bio.insert("M Fahrul Akbar", "Fahrul", "02-04-1998", "Samarinda", 155);
        bio.insert("Hafid Khoiruddin", "Hafid", "01-02-1998", "Malang", 170);
        bio.insert("M Naufal Firdaus", "Naufal", "25-04-1998", "Jombang", 163);
        bio.insert("Dicky Eka Asia P", "Dick", "28-04-1997", "Malang", 169);
        bio.insert("M Syahrul Faizin", "Faizin", "23-02-1998", "Malang", 176);
        bio.displayFriends();
        
        bio.insertionSortByNickName();
        
        bio.find("obi");
        bio.delete("Hafid");
        bio.displayFriends();
    }
    
}
