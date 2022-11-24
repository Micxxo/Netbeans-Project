/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi4mico;
import java.util.Scanner; 
/**
 *
 * @author INFINIX
 */
public class pemilu {
    public static void main(String[] args) {
          System.out.println("Program Penentuan Calon Pemlih");
          
          Scanner input = new Scanner (System.in);
          
          System.out.println("Silahkan masukan umur anda:  ");
          int umur = input.nextInt();
          
          if (umur < 17) {
              System.out.println("Maaf anda tidak berhak mengikuti pemilu");
          } else {
              System.out.println("Selamat anda berhak mengikuti pemilu");
          }
    }
}
