/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;

/**
 *
 * @author LAB-SI-PC
 */
public class Gaming extends Laptop{
    
    private String kartuGrafis;
    private int refreshRate;
    
    public Gaming(){
        
    }
    
    public String getKartuGrafis(){
        return kartuGrafis;
    }
    
    public void setKartuGrafis(String kartuGrafis){
        this.kartuGrafis=kartuGrafis;
    }
    
    public int getRefreshRate(){
        return refreshRate;
    }
    
    public void setRefreshRate(int refreshRate){
        this.refreshRate=refreshRate;
    }
    
    public Gaming(String merek,int tahunProduksi,int garansi,int ukuranLayar,int kapasitasRAM,String kartuGrafis,int refreshRate){
        super(merek,tahunProduksi,garansi,ukuranLayar,kapasitasRAM);
        this.kartuGrafis=kartuGrafis;
        this.refreshRate=refreshRate;
    }
    
    public void reset(String merek,int tahunProduksi,int garansi,int ukuranLayar,int kapasitasRAM,String kartuGrafis,int refreshRate){
        setMerek(merek);
        setTahunProduksi(tahunProduksi);
        setGaransi(garansi);
        setUkuranLayar(ukuranLayar);
        setKapasitasRAM(kapasitasRAM);
        setKartuGrafis(kartuGrafis);
        setRefreshRate(refreshRate);
    }
    
    
}
