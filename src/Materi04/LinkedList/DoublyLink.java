/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi04.LinkedList;

/**
 *
 * @author Biobii
 */
public class DoublyLink {
    
    public int Data;
    public DoublyLink next;
    public DoublyLink previous;
    
    
    public DoublyLink(int Data){
        this.Data = Data;
    }
    
    public void displayLink(){
        System.out.print(Data + " ");
    }
    
}
