/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi1mico;

/**
 *
 * @author INFINIX
 */
public class Challenge1Case1 {
    
    public double panjang;
    public double lebar;
    public double tinggi;
    
    public void setPanjang(double panjang){
    this.panjang = panjang;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public void setTinggi(double tinggi) {
    this.tinggi = tinggi;
    }

    
//    membuat method getter
    public double getPanjang(){
        return panjang;
    }
    
    public double getLebar(){
        return lebar;
    }
    public double getTinggi(){
    return tinggi;
    }

    public double HitungVolume(){
    double volume = panjang * lebar * tinggi;
    return volume;
    }


    
}
