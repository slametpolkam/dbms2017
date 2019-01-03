/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author oryza
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Koneksi {
    public static Connection apa;
    public static Statement statemen;
    
  
    public void konfigurasi() {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
           apa=DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan","perpustakaan","perpustakaan");
            statemen=apa.createStatement();
            System.out.println("Koneksi Berhasil");
        }catch(Exception e){
            System.out.println("gagal koneksi"+ e);
        }
    }
   
}
