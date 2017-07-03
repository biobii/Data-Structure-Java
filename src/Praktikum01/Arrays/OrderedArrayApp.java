/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum01.Arrays;
/**
 *
 * @author Biobii
 */
public class OrderedArrayApp {
    public static void main(String[] args) {
        
        int maxSize = 20;
        OrderedArray data;
        data = new OrderedArray(maxSize);
        
        data.insert(15);
        data.insert(7);
        data.insert(25);
        data.insert(45);
        data.insert(36);
        data.insert(57);
        
        data.display();
        
        data.size();
    }
}
