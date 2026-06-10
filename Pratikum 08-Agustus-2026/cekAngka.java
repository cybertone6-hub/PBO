/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum08062026;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LUTVI
 */
public class cekAngka{
    public static void  main(String[]args){
        int a,b;
        Scanner input = new Scanner (System.in);
        try{
        System.out.print("Masukkan Pembilang = ");
        a = input.nextInt();
        System.out.print("Masukkan Penyebut = ");
        b = input.nextInt();
        int hasil = a/b;
        System.out.println("Hasil Pembagian = "+hasil);
        } catch(InputMismatchException e){
            System.out.println("Harus input angka");
        } catch(ArithmeticException e){
            System.out.println("Tidak boleh ada pembagian dengan 1100");
        }finally{
            System.out.println("Pengecekan angka sukses");
        }
    }
}
