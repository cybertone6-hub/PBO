/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanPBO;

/**
 *
 * @author LUTVI
 */
import java.util.Scanner;
import latihanPBO.Produk;

public class mainProduk {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("=== Input Data Produk ===");
        
       
        System.out.print("Masukkan kode produk   : ");
        String kode = input.nextLine();
        
        System.out.print("Masukkan nama produk   : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan harga produk  : ");
        double harga = input.nextDouble();
        
        System.out.print("Masukkan stok produk   : ");
        int stok = input.nextInt();
        
        
        Produk belanjaan = new Produk(kode, nama, harga, stok);
        
        
        System.out.println("\n=== Data Belanjaan ===");
        System.out.println("Kode Produk  = " + belanjaan.getkodeProduk());
        System.out.println("Nama Produk  = " + belanjaan.getnamaProduk());
        System.out.println("Harga        = " + belanjaan.getHarga());
        System.out.println("Stok         = " + belanjaan.getStock());
        
     
        System.out.println("\n--- Mencoba Kurangi Stok ---");
        System.out.print("Masukkan jumlah yang dibeli: ");
        int jumlahBeli = input.nextInt();
        
        belanjaan.kurangiStok(jumlahBeli);
        System.out.println("Stok Sekarang = " + belanjaan.getStock());
        
        
        }
}
