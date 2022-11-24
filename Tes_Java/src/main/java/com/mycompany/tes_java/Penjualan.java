/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tes_java;
import com.mycompany.tes_java.Makanan;
import com.mycompany.tes_java.Kasir;

/**
 *
 * @author INFINIX
 */
public class Penjualan {
    int jumlah1;

    public int getJumlah1() {
        return jumlah1;
    }

    public void setJumlah1(int jumlah1) {
        this.jumlah1 = jumlah1;
    }

    int harga1;

    public int getHarga1() {
        return harga1;
    }

    public void setHarga1(int harga1) {
        this.harga1 = harga1;
    }

    double hargaDiskon;

    public double getHargaDiskon() {
        return hargaDiskon;
    }

    public void setHargaDiskon(double hargaDiskon) {
        hargaDiskon = (getDiskon1() - getHarga1());
        this.hargaDiskon = hargaDiskon;

    }

    boolean member;

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    double diskon1;

    public double getDiskon1() {
        return diskon1;
    }

    public void setDiskon1(double diskon1) {
        diskon1 = getHarga1() * diskon1;
        this.diskon1 = diskon1;
    }
    int uang;

    public int getUang() {
        return uang;
    }
    
    public int getTotal() {
        return getHarga1() * getJumlah1();
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

}

