/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi08.HashTables.SeprateChaining;

/**
 *
 * @author ASUS
 * SeprateChaining or OpenHash
 * 
 */
public class Link {
    
    private int iData;
    public Link next;
    
    public Link(int iData) {
        this.iData = iData;
    }
    
    public int getKey() {
        return iData;
    }
    
    public void displayLink() {
        System.out.print(iData + " ");
    }
    
}
