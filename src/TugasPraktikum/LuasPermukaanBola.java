/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author Client
 */
public class LuasPermukaanBola {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        Double r, phi, hasil;
        phi = 3.14;
        System.out.print("Masukkan jari jari bola: ");
        r = masukan.nextDouble();
        hasil = 4*phi*r*r;
        System.out.println(hasil);
    }
    
}
