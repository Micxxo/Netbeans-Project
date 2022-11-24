/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studikasus;

/**
 *
 * @author INFINIX
 */
public class LuasSegitiga {
    
    public double alas;
    public double tinggi;

    public void setAlas(double alas){
    this.alas = alas;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    
//    membuat method getter
    public double getAlas(){
        return alas;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public double HitungVolume(){
    double luas = 1.0/3.0 * alas * tinggi;
    return luas;
    }

}
