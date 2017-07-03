/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllOriginalCode;

/**
 *
 * @author Biobii
 */
public class sortingBubble {
    
    public static void main(String[] args) {
        
        int[] data = {20, 50, 25, 5, 45, 35, 10, 30, 15, 40};
        
        int dataLength = data.length;
        int n = 0;
        while(n < dataLength) {
            for(int i=1; i<dataLength; i++){
                if(data[i-1] > data[i]){
                    //tukar
                    int temp = data[i];
                    data[i] = data[i-1];
                    data[i-1] = temp;
                }
            }
            n++;
        }
        
        for(int j = 0; j < data.length; j++) {
            System.out.print(data[j] + " ");
        }
        
    }
    
}
