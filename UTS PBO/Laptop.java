/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;

/**
 *
 * @author LAB-SI-PC
 */
public class Laptop extends Elektronik{
    
    private int ukuranLayar;
    private int kapasitasRAM;
    
    public Laptop(){
        
    }
    
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    
    public void setUkuranLayar(int Ukuranlayar){
        this.ukuranLayar=ukuranLayar;
    }
    
    public int getKapasitasRAM(){
        return kapasitasRAM;
    }
    
    public void setKapasitasRAM(int kapasitasRAM){
        this.kapasitasRAM=kapasitasRAM;
    }
    
    public Laptop(String merek,int tahunProduksi,int garansi,int ukuranLayar,int kapasitasRAM){
        super(merek,tahunProduksi,garansi);
        this.ukuranLayar=ukuranLayar;
        this.kapasitasRAM=kapasitasRAM;
    }
    
    
    
    
    
    
}
