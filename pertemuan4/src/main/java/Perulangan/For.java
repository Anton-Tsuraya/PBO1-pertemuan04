/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

/**
 *
 * @author ANTON TSURAYA
 */
public class For {
    public static void main(String[] args) {
      int isiGelas =0;
      int penuh=225;
      
      System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
      System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");      
        for(isiGelas = 0 ; isiGelas <= penuh ; isiGelas++){
            
            System.out.println("Sedang Mengisi Gelas..");
            System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        }
           
      System.out.println("Finale: Isi Gelas Sekarang : " + isiGelas + "ml");        
    }
    
}
