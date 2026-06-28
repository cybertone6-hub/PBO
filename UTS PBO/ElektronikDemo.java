package UTS_PBO;

import java.util.Scanner; // Import ini wajib untuk input data

public class ElektronikDemo {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT DATA PESAWAT ===");
        
        System.out.print("Masukkan Nama Merek: ");
        String mrk = input.nextLine();
        
        System.out.print("Masukkan Tahun Produksi: ");
        int thn = input.nextInt();
        
        System.out.print("Garansi: ");
        int grn = input.nextInt();
        
        System.out.print("Masukkan UKuran layar: ");
        int ul = input.nextInt();
        
        System.out.print("kpasitas RAM: ");
        int kr = input.nextInt();
        
        System.out.print("VGA: ");
        String vga = input.nextLine();
        
        System.out.print("refresh Rate: ");
        int rr = input.nextInt();
       /* 
        ElektronikDemo p1 = new ElektronikDemo(mrk,thn,grn,ul,kr,vga,rr);

        // Menampilkan Hasil
        System.out.println("\n=== HASIL OUTPUT ===");
        System.out.println("Merek      : " + p1.getMerek());
        System.out.println("tahun produksi      : " + p1.getTahunProduksi());
        System.out.println("Garansi      : " + p1.getGaransi());
        System.out.println("UKuran Layar      : " + p1.getUkuranLayar());
        System.out.println("Kpasitas RAM      : " + p1.getKapasitasRAM());
        System.out.println("VGA      : " + p1.getKartuGrafis());
        System.out.println("refreh Rate      : " + p1.getRefreshRate());
        */
        
        
        
        input.close();
    }

    private String getMerek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}