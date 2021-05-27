/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập số lượng dòng cần nhập ");
        n = sc.nextInt();
        String[] arrNhap = new String[n];
        sc.nextLine();
        System.out.print("Nhập: ");
        for(int i=0; i<n; i++){
            arrNhap[i] = sc.nextLine();
        }
        String data = "";
        for(int i=0; i<n; i++)
            data = data+arrNhap[i];
            
        try {
            Writer a = new FileWriter("A2.txt");
            a.write(data);
            a.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
    
}
