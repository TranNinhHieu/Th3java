/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.io.FileInputStream;

/**
 *
 * @author ADMIN
 */
public class bai1c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileInputStream nhan = null;
        try {

          nhan = new FileInputStream("b1.txt");
 
          
 
          byte[] tam = new byte[10];
          int i = -1;
 
          
          while ((i = nhan.read(tam)) != -1) {
              
              String s = new String(tam, 0, i);
              System.out.println(s);
          }
          nhan.close();
      } catch (Exception e) {
          e.printStackTrace();
      }
    }
    
}
