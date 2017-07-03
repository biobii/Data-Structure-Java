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
public class Antri {
    
    private Queue queue;
    
    public Antri(int size){
        queue = new Queue(size);
    }
    
    public void in(String nama){
        if(!queue.isFull()){
            queue.insert(nama);
            System.out.println(nama + " masuk antrian");
        } else {
            System.out.println("Maaf " + nama + ", antrian sudah penuh");
        }
    }
    
    public void out(){
        if(!queue.isEmpty()){
            System.out.println(queue.remove() + " keluar antrian");
        } else {
            System.out.println("Antrian");
        }
        displayAntri();
    }
    
    public void displayAntri(){
        queue.display();
        System.out.println("");
    }
    
    public void kosong(){
        if(queue.isEmpty()){
            System.out.println("Antrian kosong");
            System.out.println(queue.size() + " person");
        } else {
            System.out.println("Ada antrian");
            System.out.println(queue.size() + " person");
        }
        displayAntri();
    }
    
}
