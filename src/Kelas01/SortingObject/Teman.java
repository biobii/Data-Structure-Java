/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas01.SortingObject;

/**
 *
 * @author Biobii
 */
public class Teman {
    
    private String fullName;
    private String nickName;
    private String birthday;
    private String tempatLahir;
    private int tinggi;
    
    public Teman(String fullName, String nickName, String birthday, String tempatLahir, int tinggi){
        this.fullName = fullName;
        this.nickName = nickName;
        this.birthday = birthday;
        this.tempatLahir = tempatLahir;
        this.tinggi = tinggi;
    }
    
    public void displaySemua(){
        System.out.print("\tNama Lengkap: "+fullName);
        System.out.print(", Panggilan: "+nickName);
        System.out.print(", Ulang Tahun: "+birthday);
        System.out.print(", Tempat Lahir: "+tempatLahir);
        System.out.println(", Tinggi: "+tinggi);
    }
    
    public String getNickName(){
        return nickName;
    }
    
    public String getTempatLahir(){
        return tempatLahir;
    }
    
}
