/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi08.HashTables.LinearProbing;
/**
 *
 * @author ASUS
 */
public class HashTableApp {
    
    public static void main(String[] args) {
        
       HashTable theHashTable = new HashTable(15);
       theHashTable.insert(15);
       theHashTable.insert(30);
       theHashTable.insert(50);
       theHashTable.insert(10);
       theHashTable.delete(20);
       theHashTable.find(20);
       theHashTable.displayTable();
    }
    
}
    

