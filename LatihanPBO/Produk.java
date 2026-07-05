/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanPBO;

/**
 *
 * @author LUTVI
 */
public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double Harga;
    private int Stock;
    
    public Produk (){
        
        }
    
    public Produk(String kodeProduk,String namaProduk,double Harga,int Stock){
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.Harga = Harga;
        this.Stock = Stock; 
    }
    
    public String getkodeProduk (){
        return kodeProduk;
    }
    
    public String getnamaProduk (){
        return namaProduk;
    }
    
    public double getHarga (){
        return Harga;
    }
    
    public int getStock(){
        return Stock;
    }
    
    public void setHarga(double hargaBaru){
        this.Harga = hargaBaru;
    }
    
    public void tambahStock(int jumlah){
        if (jumlah > 0){
            this.Stock += jumlah;
        }
    }
    
   
    public void kurangiStok(int jumlah) {
        // Gunakan >= agar jika stok 10 dan dikurangi 10 tetap bisa (stok jadi 0)
        if (Stock >= jumlah) {
            this.Stock -= jumlah;
        } else {
            System.out.println("Gagal mengurangi: Stok tidak mencukupi!");
        }
    }

    
}
