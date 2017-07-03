/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi05.Recursion;

/**
 *
 * @author Biobii
 */
public class factorial {
    
    public static void main(String[] args) {
        
        factorial fc = new factorial();
        System.out.println("Recursive Factorial : " + fc.RecursiveFactorial(6));
        System.out.println("Loop Factorial : " + fc.LoopFactorial(6));
    }
    
    public int RecursiveFactorial(int n) {
        if(n == 0) {
            return 1;
        } else {
            return (n * RecursiveFactorial(n-1));
        }
    }
    
    public int LoopFactorial(int n) {
        int factorial = 1;
        for(int i = n; i > 0; i--){
            factorial *= i;
        }
        return factorial;
    }
    
}
