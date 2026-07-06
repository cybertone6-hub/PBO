/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum_06042026;

/**
 *
 * @author Lenovo
 */
public class MainAkunBankEnkapsulasi {

    public static void main(String[] args) {
        AkunBankEnkapsulasi akun = new AkunBankEnkapsulasi("1234567","AmeCantik");
        
        //tampil saldo awal 
        System.out.println("=====Data Awal=====");
        akun.tampilInfo();
        
        System.out.println();
        
        //deposit
        akun.deposit(500000);
        System.out.println("Saldo setelah deposit = "+akun.getSaldo());
        
        System.out.println();
        
        //withdraw
        akun.withdraw(2000000);//coba yang berhasil
        akun.withdraw(300000);//coba yang gagal
        System.out.println("Saldo setelah Withdraw = "+akun.getSaldo());
        
    }
    
    
}
