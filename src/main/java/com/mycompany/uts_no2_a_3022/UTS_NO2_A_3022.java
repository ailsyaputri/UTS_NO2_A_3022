/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_a_3022;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 * Ailsya Putri / 21103022 / SI05A
 */
public class UTS_NO2_A_3022 {

    public static void main(String[] args) {
        SalariedEmployee_3022 se = new SalariedEmployee_3022();
        CommissionEmployee_3022 ce = new CommissionEmployee_3022();
        ProjectPlanner_3022 pp = new ProjectPlanner_3022();
        System.out.println();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            se.nama_3022 = "Ailsya";
            se.nip_3022 = 1001;
            se.gaji_3022 = 2500000;
            
            ce.nama_3022 = "Putri";
            ce.nip_3022 = 1002;
            ce.gaji_3022 = 3000000;
            ce.komisi_3022 = 250000;
            ce.penjualan_3022 = 25;
            
            pp.nama_3022 = "Harmandita";
            pp.nip_3022 = 1003;
            pp.gaji_3022 = 2800000;
            pp.komisi_3022 = 300000;
            pp.proyek_3022 = 7;
            
            se.tampilDataSalariedEmployee_3022();
            System.out.println("");
            ce.tampilDataCommissionEmployee_3022();
            System.out.println("");
            pp.tampilDataProjectPlanner_3022();
            System.out.println("");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}