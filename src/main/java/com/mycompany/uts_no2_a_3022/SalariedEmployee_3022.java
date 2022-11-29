/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_a_3022;

/**
 *
 * @author ASUS
 * Ailsya Putri / 21103022 / SI05A
 */
public class SalariedEmployee_3022 {
    String nama_3022;
    int nip_3022;
    double upah_3022, gaji_3022;
    
    public double gaji_3022(){
        gaji_3022 = upah_3022;
        return gaji_3022;
    }
    
    public void tampilDataSalariedEmployee_3022(){
        System.out.println("Nama               : " + nama_3022);
        System.out.println("NIP                : " + nip_3022);
        System.out.println("Upah Mingguan      : " + gaji_3022);
    }
}
