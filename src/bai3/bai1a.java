/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class bai1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileInputStream nhan=null;
        try {
            nhan = new FileInputStream("b1.txt");
            int i = 0;
            while ((i = nhan.read()) != -1) {
                System.out.print(i + " " + (char)i + "\n");
            }
 
            nhan.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            nhan.close();
        }
    }
    
}
