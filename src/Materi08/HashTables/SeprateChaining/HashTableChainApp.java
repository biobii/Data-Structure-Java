/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi08.HashTables.SeprateChaining;

/**
 *
 * @author ASUS
 */
public class HashTableChainApp {
    
    public static void main(String[] args) {
        
        HashTableChain chain = new HashTableChain(15);
        
        chain.displayTable();
        chain.insert(15);
        chain.insert(30);
        chain.insert(90);
        chain.insert(22);
        chain.insert(60);
        chain.insert(15);
        chain.displayTable();
        chain.find(22);
        chain.delete(60);
        chain.delete(22);
        chain.displayTable();
        
    }
    
}
