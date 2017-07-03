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
public class QueueApp {
    
    public static void main(String[] args) {
        
        Antri app = new Antri(4);
        
        System.out.println(">> beberapa mulai mengantri");
        app.in("Andi");
        app.in("Ahmad");
        app.in("Satria");
        app.in("Afrizal");
        app.in("Sukran");
        app.in("Mahmud");
        System.out.println("");
        System.out.println(">> isi antrian");
        app.displayAntri();
        System.out.println(">> satu persatu keluar");
        app.out();
        app.out();
        app.out();
        app.out();
        app.kosong();
        
    }
    
}
