/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_06042026;

/**
 *
 * @author Lenovo
 */
public class AkunBankEnkapsulasi {
    private String noRekening;
    private String namaNasabah;
    private double saldo;
    
    
    public AkunBankEnkapsulasi(){
        
    }
    public AkunBankEnkapsulasi(String noRekening, String namaNasabah){
        this.noRekening = noRekening;
        this.namaNasabah = namaNasabah;
        this.saldo = 1000000;//awalnya 1juta
    }
    //getter
    public String getNoRekening(){
        return noRekening;
    }
    public String getNamaNasabah(){
        return namaNasabah;
    }
    public double getSaldo(){
        return saldo;
    }
   
   // method deposit (menabung)
    public void deposit(double jumlah) {
        saldo += jumlah;
        System.out.println("Deposit berhasil: " + jumlah);
    }

    // method withdraw (ambil uang)
    public void withdraw(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Withdraw berhasil: " + jumlah);
        } else {
            System.out.println("Saldo tidak cukup!");
        }
    }

    // tampil info
    public void tampilInfo() {
        System.out.println("No Rekening : " + noRekening);
        System.out.println("Nama        : " + namaNasabah);
        System.out.println("Saldo       : " + saldo);
    }
}
