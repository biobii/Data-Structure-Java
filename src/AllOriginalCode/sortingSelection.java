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
public class sortingSelection {
  
    public static void main(String[] args) {
        
        int[] data = {20, 50, 25, 5, 45, 35, 10, 30, 15, 40};
        
        int dataLength = data.length;
        int max;
        while(dataLength > 0){
            //mencari nilai terbesar
            max = 0;
            for(int i=1;i<dataLength;i++){
                if(data[max] < data[i]){
                    max = i;
                }
            }
            //penukaran
            int temp = data[max];
            data[max] = data[dataLength - 1];
            data[dataLength - 1] = temp;
            
            //kunci / geser batas data yang akan diurutkan
            dataLength--;
        }
        
        for(int j = 0; j < data.length; j++) {
            System.out.print(data[j] + " ");
        }
        
    }
    
}
