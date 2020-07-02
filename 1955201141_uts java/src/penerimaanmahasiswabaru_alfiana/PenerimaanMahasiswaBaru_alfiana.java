/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penerimaanmahasiswabaru_alfiana;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class PenerimaanMahasiswaBaru_alfiana {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws IOException {
       
         String pendartarann;
         String nama,tanggallahir;
         
           InputStreamReader isr = new InputStreamReader(System.in);
    
           BufferedReader br = new BufferedReader(isr);
           System.out.println("ambil formulir");
           
           System.out.println("isi nama");
           nama = br.readLine();
           
           System.out.println("tanggal lahir anda?");
           tanggallahir = br.readLine();
        
           System.out.println("nama saya "+ nama);
           System.out.println("TTL"+ tanggallahir);
                
        System.out.print("jalur ");
        boolean beasiswa = true;
        boolean ujian = true; 
        if(beasiswa == true){
            System.out.println("beasiswa");
        } 
        else {
            System.out.println("reguler");
        }   
        System.out.println("ujian tes");
        
        if(ujian == true) {
            System.out.println("ujian = lulus");
        } 
        else 
            System.out.println("mengulang");
            
            int a=1;
            do{
                System.out.println("melengkapi berkas" + a);
                a++;
            } while (a <= 3);
     
     
            System.out.println("masuk orientasi");
            System.out.println("kuliah");
            
            
           
        }
    }

     


     
            
       
     
  


        
     


     
        
    

