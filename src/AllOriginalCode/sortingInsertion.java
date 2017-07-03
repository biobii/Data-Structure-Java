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
public class sortingInsertion {
  
    public static void main(String[] args) {
        
        int[] data = {20, 50, 25, 5, 45, 35, 10, 30, 15, 40};
        
        //proses pengurutan
        int i=1;
        int index;
        int dataLength = data.length;
        while(i<dataLength){
            //mengambil elemen yang akan disisipkan
            int temp = data[i];
            //mencari lokasi penyisipan
            //dengan cara menggeser nilai-nilai kesebelah kanan
            for(index=i;index>0;index--){
                if(temp<data[index-1]){
                    //geser
                    data[index] = data[index-1];
                } else {
                    break;
                }
            }
                //menyisipkan lokasi yang sesuai
                data[index] = temp;
                i++;
        }
        
        //print
        System.out.println("+---- INSERTION SORT ----+");
        for(int j = 0; j < data.length; j++) {
            System.out.print(data[j]+" ");
        }
        
    }
    
}
