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
public class DataOrangApp {
    
    public static void main(String[] args) {
        
        DataOrang app;
        app = new DataOrang(5);
        
        System.out.println(">> Beberapa mulai mengantri");
        app.insert("Andi");
        app.insert("Ahmad");
        app.insert("Satrio");
        app.insert("Afrizal");
        app.insert("Sukran");
        app.insert("Mahmud");
        
        System.out.println("\n>> isi antrian");
        app.peek();
        
        System.out.println("\n>>Satu persatu keluar antrian");
        app.keluar();
    }
    
}
