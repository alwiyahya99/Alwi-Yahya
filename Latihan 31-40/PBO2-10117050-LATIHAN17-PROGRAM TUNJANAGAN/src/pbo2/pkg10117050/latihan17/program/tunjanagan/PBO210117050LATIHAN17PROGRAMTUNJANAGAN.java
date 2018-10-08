/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117050.latihan17.program.tunjanagan;

import java.util.Scanner;

public class PBO210117050LATIHAN17PROGRAMTUNJANAGAN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Gaji gaji = new Gaji();
        System.out.println("======Program Tunjangan======");
        Scanner scn = new Scanner(System.in);

        System.out.print("Berapa gaji pokok anda perbulan : ");
        gaji.gajiPokok = scn.nextInt();

        System.out.print("Status Anda (menikah/belum) : ");
        gaji.status = scn.next();

        gaji.programTunjangan(gaji.gajiPokok, gaji.status, gaji.tunjangan, gaji.totalGaji);
        System.out.println("(Develop By : Alwi Yahya Muljabar)");
    }

}
