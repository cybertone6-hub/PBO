package UTS_PBO;

import java.util.Scanner; // Import ini wajib untuk input data


public class ElektronikDemo {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT DATA LAPTOP ===");

        System.out.println("=== INPUT DATA LAPTOP ===");

        System.out.print("Masukkan Merek            : ");
        String mrk = input.nextLine();

        System.out.print("Masukkan Tahun Produksi   : ");
        int thn = input.nextInt();

        System.out.print("Masukkan Garansi          : ");
        int grn = input.nextInt();

        System.out.print("Masukkan Ukuran Layar     : ");
        int ul = input.nextInt();

        System.out.print("Masukkan Kapasitas RAM    : ");
        int kr = input.nextInt();

        input.nextLine(); // membersihkan Enter

        System.out.print("Masukkan Kartu Grafis     : ");
        String vga = input.nextLine();

        System.out.print("Masukkan Refresh Rate     : ");
        int rr = input.nextInt();
        
        Gaming p1 = new Gaming(mrk, thn, grn, ul, kr, vga, rr);

        System.out.println("\n=== HASIL OUTPUT ===");
        p1.tampilData();
        
        
        
        
        input.close();
    }
}

    