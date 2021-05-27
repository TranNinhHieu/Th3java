/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.io.FileReader;
import java.io.Reader;

/**
 *
 * @author ADMIN
 */
public class bai1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] str = new char[1000];
        try {
            Reader a = new FileReader("A2.txt");
            a.read(str);
            System.out.println(str);
            a.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
    
}
