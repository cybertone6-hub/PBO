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
public class cekArray {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int[] angka ={10,20,30,40,50};
        try{
        System.out.print("Mau Angka indek ke berapa = ");
        int index = input .nextInt();
        System.out.println("angka pada indeks"+index+"adalah"+angka[index]);
        
        System.out.print("Mau di bagi berapa = ");
        int pembagi = input.nextInt();
        
        int hasil = angka[index]/pembagi;
        System.out.println("Hasil Pembagian = "+hasil);
        }//1.Exception Array diluar jangkauan
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("index Array tidak ada,masukkan 0-4");
        }//2.Input tidak Sesuai
            catch(InputMismatchException e){
                System.out.println("Pastikan input berupa angka");
        }//3.Pembagian dengan nol
            catch(ArithmeticException e){
                System.out.println("Tidak boleh pembagian dengan 0");
        }finally{
            System.out.println("Proses selesai, isi array adalah = ");
            for(int i = 0;i<angka.length;i++)
                System.out.print(""+angka[i]);
            System.out.println("isi array  = "+ java.util.Arrays.toString(angka));
            //tampilkan isi Array
        }
    }
                
}
