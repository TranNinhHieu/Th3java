/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class bai1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileOutputStream nhap = null;
        try {
            nhap = new FileOutputStream("b2.txt");
            String chuoi = "We are the best group";
            byte bite[] = chuoi.getBytes();
            nhap.write(bite);
            nhap.close();
            System.out.println("Nhập thành công @@");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            nhap.close();
        }
    }
    
}
