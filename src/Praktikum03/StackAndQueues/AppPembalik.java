/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum03.StackAndQueues;
import java.util.Scanner;
/**
 *
 * @author Biobii
 */
public class AppPembalik {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String input, output;
        
        input = "kasur";
        System.out.println(">> Katanya...\n\t" + input);
        Pembalik diBalik = new Pembalik(input);
        output = diBalik.balik();
        System.out.println(">> dibalik jadi...\n\t" + output);
        
        while(true){
            System.out.print("Masukkan kata : ");
            input = scan.nextLine();
            if(input.equals("")){
                break;
            }
            Pembalik diBalik2 = new Pembalik(input);
            output = diBalik2.balik();
            System.out.println("Kebalikan : " + output);
        }
        
    }
    
}
