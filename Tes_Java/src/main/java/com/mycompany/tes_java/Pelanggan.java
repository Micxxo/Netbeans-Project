/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tes_java;
import java.util.Scanner;
   
/**
 *
 * @author INFINIX
 */
public class Pelanggan {
    boolean member;
    int total;
    Scanner scan = new Scanner(System.in);
    Penjualan hitung = new Penjualan();
    Makanan setMakanan= new Makanan();
    
    public void pembelian() {
        
        System.out.println("-----------------Struk Harga--------------------");
        System.out.println(setMakanan.getNamaMakanan() + "\t" + setMakanan.getHarga()+ "\t"+ (hitung.getHarga1() * hitung.getJumlah1()) );

        
        
        
        if (member) {
            System.out.println("Total Harga Setelah Diskon: " + (((hitung.getHarga1() * hitung.getJumlah1()) - hitung.getDiskon1())));
        }

        System.out.println("Pembayaran: " + hitung.getUang());
        System.out.println("Member: " + member);
        if (member) {
            System.out.println("kembalian: " + (hitung.getUang() - (((hitung.getHarga1() * hitung.getJumlah1()) - hitung.getDiskon1()))));
        } 
        else {
            System.out.println("kembalian: " + (hitung.getUang() - ((hitung.getHarga1() * hitung.getJumlah1()))));

        }
        System.out.println("*************************************************");
        
    }

    public void pesan() {
        
        System.out.print("Masukan menu: ");
        int menu1 = scan.nextInt();
        setMakanan.setNomorMakanan(menu1);
        setMakanan.setNamaMakanan(setMakanan.getNomorMakanan());
        setMakanan.setHarga(setMakanan.getNamaMakanan());
        
        int hargaAwal = setMakanan.getHarga();
        hitung.setHarga1(hargaAwal);
        setMakanan.setDiskon(setMakanan.getNomorMakanan());
        hitung.setDiskon1(setMakanan.getDiskon());
        System.out.print("Masukan Jumlah yang ingin dibeli: ");
        int jumlah1 = scan.nextInt();
        hitung.setJumlah1(jumlah1);
        
        
        System.out.print("Masukan nominal uang yang akan dibayarkan: ");
        int uang = scan.nextInt();
        hitung.setUang(uang);
        System.out.print("member? (member/bukan)");
        String userMember = scan.next();
        
        switch (userMember) {
            case "member":
                member = true;
                break;
            case "bukan":
                member = false;
                break;
                
        }
    }
}


