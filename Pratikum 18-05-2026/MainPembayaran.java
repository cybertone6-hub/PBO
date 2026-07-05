/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;
import java.util.Scanner;

/**
 *
 * @author LUTVI
 */
public class MainPembayaran {
    
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        
        Pembayaran pembayaran =null;
        Cetak cetak =null;
        
        System.out.println("---Sistem Pembayaran Toko ONLINE---");
        System.out.println("Masukkan ID Transaksi = ");
        String id= scanner.nextLine();
        
        System.out.println("Masukkan jumlah bayar");
        double jumlah = scanner.nextDouble();
        
        System.out.println("Pilih Metode Pembayaran : ");
        System.out.println("1. Transfer Bank");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.println("4. Pembayaran Tunai");
        System.out.print("Pilihan Metode Pembayaran Anda (1/2/3/4) ");
        int pilihan =scanner.nextInt();
        scanner.nextLine();
        
        switch(pilihan){
                        case 1 :    System.out.println("Metode Transfer Bank");
                                    System.out.println("Masukkan Nama Bank Tujuan = ");
                                    String bank=scanner.nextLine();
                                    PembayaranTransfer pt = new PembayaranTransfer(bank,jumlah,id);
                                    pembayaran = pt;
                                    cetak = pt; 
                                    cetak.cetakStruk();
                                    break;

                        case 2 :    System.out.println("Metode Kartu Kredit");
                                    System.out.println("Masukkan Nomor Kartu Kredit");
                                    String kartuKredit=scanner.nextLine();
                                    PembayaranKartuKredit pkk = new PembayaranKartuKredit(kartuKredit,jumlah,id);
                                    pembayaran = pkk;
                                    cetak = pkk; 
                                    cetak.cetakStruk();
                                    break;

                        case 3 :    System.out.println("Metode E-Wallet");
                                    System.out.println("Masukkan Nomor = ");
                                    String nomorHP=scanner.nextLine();
                                    PembayaranEWallet pew = new PembayaranEWallet(nomorHP,jumlah,id);
                                    pembayaran = pew;
                                    cetak = pew; 
                                    cetak.cetakStruk();
                                    break;

                        case 4 :    System.out.println("Metode Pembayaran Tunai");
                                    System.out.println("Masukkan jumlah bayar : ");
                                    double uang =scanner.nextDouble();
                                    PembayaranTunai ptunai = new PembayaranTunai(uang,jumlah,id);
                                    pembayaran = ptunai;
                                    cetak = ptunai; 
                                    cetak.cetakStruk();
                                    break;
                    }
        
        System.out.println("\n==Konfirmasi Bukti Pembayaran===");
        pembayaran.prosesPembayaran();
    }
    
}
