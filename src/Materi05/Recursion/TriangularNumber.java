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
public class TriangularNumber {

    public static void main(String[] args) {

        TriangularNumber ob = new TriangularNumber();

        System.out.println("Iterasi : " + ob.triangleIter(10));
        System.out.println("Recursion : " + ob.triangleRecur(10));

    }

    public int triangleIter(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            result += i;
        }
        return result;
    }

    public int triangleRecur(int n) {
        System.out.println("Entering : " + n);
        if (n == 1) {
            System.out.println("Returning 1");
            return 1;
        } else {
            int temp = n + triangleRecur(n -1);
            System.out.println("Returning temp : " + temp);
            return temp;
        }
    }

}
