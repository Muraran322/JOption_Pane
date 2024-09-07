
package joptionpane_1;

import javax.swing.JOptionPane;

public class JOptionPane_1 {

       public static void main(String[] args) {
           int g =-1;
           while (g<=0){
               String input= JOptionPane.showInputDialog ("Can I have your name ");
               if (input.length()>0){
                   g++;
                   System.out.println("Thank you ");
               }else{
                   System.out.println("Your name Sir ");
               }
                   
           }
       
    }
    
}
