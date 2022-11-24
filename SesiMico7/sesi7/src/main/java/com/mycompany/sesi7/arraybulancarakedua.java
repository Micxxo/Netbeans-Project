/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi7;

/**
 *
 * @author INFINIX
 */
public class arraybulancarakedua {
    public static void main(String[] args) {
        String[] Bulan;
        int[] Hari;
        
        Bulan = new String[12];
        Hari = new int[12];
        
        Bulan [0] = "Januari";
        Bulan [1] = "Februari";
        Bulan [2] = "Maret";
        Bulan [3] = "April";
        Bulan [4] = "Mei";
        Bulan [5] = "Juni";
        Bulan [6] = "Juli";
        Bulan [7] = "Agustus";
        Bulan [8] = "September";
        Bulan [9] = "Oktober";
        Bulan [10] = "November";
        Bulan [11] = "Desember";
        
        int[] JumlahHari = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int i = 0; i < Bulan.length; i++){
        System.out.println("Bulan " + Bulan[i] + " --> " + Bulan[i] + " Hari");
        }
        
    }
}
