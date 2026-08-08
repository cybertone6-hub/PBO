/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswaEnkasulapsi;

/**
 *
 * @author LUTVI
 */
public class mahasiswaEnkasulapsi {
    
    private String nama;
    private String jurusan;
    private String nim;
    private int umur;
    private double ipk;
    
    public mahasiswaEnkasulapsi (){
        
    }
    
    public mahasiswaEnkasulapsi(String nama,String nim,String jurusan,int umur,double ipk){
        this.nama = nama;
        this.nim  = nim;
        this.jurusan = jurusan;
        this.umur = umur;
        this.ipk = ipk;
    }
    
    public String getnama (){
        return nama;
    }
    
    public String getnim (){
        return nim;
    }
    
    public String getjurusan (){
        return jurusan;
    }
    
    public int getumur (){
        return umur;
    }
    
    public double getipk (){
        return ipk;
    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public void setnim(String nim){
        this.nim = nim;
    }
    
    public void setjurusan(String jurusan){
        this.jurusan = jurusan;
    }
    
    public void setumur(int umur){
        this.umur = umur;
    }
    
    public void setipk(double ipk){
        this.ipk = ipk;
    }
    
    
    

} 


    
    

