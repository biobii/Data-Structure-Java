/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum07.BinaryTrees;
import java.io.*;
/**
 *
 * @author Biobii
 */
public class TreeApp {
    
    public static void main(String[] args) throws IOException {
        int value;
        String data;
        Tree theTree = new Tree();
        theTree.insert(50, "Ahmad");
        theTree.insert(25, "Rosa");
        theTree.insert(75, "Raisa");
        theTree.insert(12, "Naya");
        theTree.insert(37, "Gagas");
        theTree.insert(43, "Ainun");
        theTree.insert(30, "Beri");
        theTree.insert(33, "Vivid");
        theTree.insert(87, "Orin");
        theTree.insert(93, "Wiwid");
        theTree.insert(97, "Sasa");
        
        while(true) {
            System.out.print("Enter first letter of show, " + "insert or minmax: ");
            int choice = getChar();
            switch(choice) {
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value and data to" + " insert: ");
                    value = getInt();
                    data = getString();
                    theTree.insert(value, data);
                    break;
                case 'm':
                    System.out.print("Minimum value: ");
                    theTree.minimum();
                    System.out.println();
                    System.out.print("Maximum value: ");
                    theTree.maximum();
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid entry!");
            }
        }
        
    }
        
        public static String getString() throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            return s;
        }
        
        public static char getChar() throws IOException {
            String s = getString();
            return s.charAt(0);
        }
        
        public static int getInt() throws IOException {
            String s = getString();
            return Integer.parseInt(s);
        }
}
