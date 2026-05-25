/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemPenggajianKaryawan;
import java.util.Scanner;

/**
 *
 * @author LUTVI
 */
public class MainSistemPenggajianKaryawan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT DATA KARYAWAN ===");
        System.out.print("Masukkan Nama Karyawan: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Gaji Pokok   : ");
        double gaji = input.nextDouble();

        System.out.println("\nPilih Jenis Karyawan:");
        System.out.println("1. Karyawan Biasa / Kontrak");
        System.out.println("2. Karyawan Tetap");
        System.out.print("Pilihan (1/2): ");
        int pilihan = input.nextInt();

        Karyawan karyawanTerpilih;

        if(pilihan == 2) 
        {
            karyawanTerpilih = new KaryawanTetap(nama, gaji);
        }
        else 
        {
            karyawanTerpilih = new Karyawan(nama, gaji);
        }
        System.out.println("RINCIAN GAJI");
        
        karyawanTerpilih.cetakData();
        
        
    }
}
