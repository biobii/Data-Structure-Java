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
public class pangkatRecursive {
    
    public static int pangkat(int x, int y) {
        if(y == 0) {
            return 1;
        } else {
            return x * pangkat(x,y-1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(pangkat(2,10));
        System.out.println(pangkat(3,5));
        System.out.println(pangkat(3,16));
    }
    
}
