/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum03.StackAndQueues;

/**
 *
 * @author Biobii
 */
public class Pembalik {
    
    private String input;
    private String output;
    
    public Pembalik(String in){
        input = in;
    }
    
    public String balik(){
        int size = input.length();
        Stack theStack = new Stack(size);
        
        for(int j = 0; j < input.length(); j++){
            char ch = input.charAt(j);
            theStack.push(ch);
        }
        
        output = "";
        
        while(!theStack.isEmpty()){
            char ch = theStack.pop();
            output = output + ch;
        }
        return output;
    }
    
}
