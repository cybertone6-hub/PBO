/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz_PBO;

/**
 *
 * @author LUTVI
 */

public class Kue {
    
    private String idKue;
    private double hargaJual;
    private int jumlahTersedia;
    private String kategori;

   
    public Kue(String idKue, double hargaJual, int jumlahTersedia, String kategori) {
        this.idKue = idKue;
        this.hargaJual = hargaJual;
        this.jumlahTersedia = jumlahTersedia;
        this.kategori = kategori;
    }

   
    public String getIdKue() {
        return idKue;
    }

    public void setIdKue(String idKue) {
        this.idKue = idKue;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    public int getJumlahTersedia() {
        return jumlahTersedia;
    }

    public void setJumlahTersedia(int jumlahTersedia) {
        this.jumlahTersedia = jumlahTersedia;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public double hitungTotalNilaiPenjualan() {
        return this.jumlahTersedia * this.hargaJual;
    }

    public void tampilkanInfoKue() {
        System.out.println("====================================");
        System.out.println("        INFORMASI DATA KUE          ");
        System.out.println("====================================");
        System.out.println("ID / Nama Kue     : " + idKue);
        System.out.println("Kategori          : " + kategori);
        System.out.println("Harga Jual        : Rp " + hargaJual);
        System.out.println("Jumlah Tersedia   : " + jumlahTersedia + " pcs");
        System.out.println("Total Nilai Stok  : Rp " + hitungTotalNilaiPenjualan());
        System.out.println("====================================\n");
    }

    
    public static void main(String[] args) {
       
        Kue kue1 = new Kue("KUE001 (Lapis Legit)", 50000, 10, "Kue Basah");
        
       
        Kue kue2 = new Kue("KUE002 (Nastar)", 80000, 5, "Kue Kering");

       
        kue1.tampilkanInfoKue();
        kue2.tampilkanInfoKue();
    }
}