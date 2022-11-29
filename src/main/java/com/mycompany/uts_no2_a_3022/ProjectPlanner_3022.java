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
public class ProjectPlanner_3022 extends SalariedEmployee_3022{
    String nama_3022;
    int nip_3022, proyek_3022;
    double gaji_3022, komisi_3022, pajak_3022, gaji_pokok_3022;
    
    public double gaji_project() {
        pajak_3022 = (0.05 * gaji_pokok_3022);
        gaji_3022 = gaji_pokok_3022 + (komisi_3022 * proyek_3022) - pajak_3022;
        return gaji_3022;
    } 
    
    public void tampilDataProjectPlanner_3022(){
        System.out.println("Nama               : " + nama_3022);
        System.out.println("NIP                : " + nip_3022);
        System.out.println("Gaji Pokok         : " + gaji_3022);
        System.out.println("Komisi             : " + komisi_3022);
        System.out.println("Total Hasil Proyek : " + proyek_3022);
     }
}
