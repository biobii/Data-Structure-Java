/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum05.Recursion;

/**
 *
 * @author Biobii
 */
public class hanoiTowers {
    
    static int nDisk = 3;
    
    public static void doTowers(int topN, char from, char inter, char to) {
        if(topN == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            doTowers(topN-1, from, to, inter);
            System.out.println("Disk " + topN + " from " + from + " to " + to);
            doTowers(topN-1, inter, from, to);
        }
    }
    
    public static void main(String[] args) {
        
        doTowers(nDisk, 'A', 'B', 'C');
        
    }
    
}
