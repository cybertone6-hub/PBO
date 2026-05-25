/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemPenggajianKaryawan;

/**
 *
 * @author LUTVI
 */
public class KaryawanTetap extends Karyawan{

    public KaryawanTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }
    
    @Override
    public double hitungTotalGaji() {
        // Menggunakan getGajiPokok() karena variabel gajiPokok di parent sudah private
        double tunjangan = 0.025 * getGajiPokok(); 
        return getGajiPokok() + tunjangan;
    }
    
    @Override
    public void cetakData() {
        super.cetakData(); 
        double tunjangan = 0.025 * getGajiPokok();
        System.out.println("Status        : Karyawan Tetap");
        System.out.println("Tunjangan (2.5%): Rp " + tunjangan);
        System.out.println("Total Gaji    : Rp " + hitungTotalGaji());
    }
}
