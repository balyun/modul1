/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Client
 */
public class KonversiSuhu {
    public static void main(String[] args) {
        int C, F, R, K;
        C = 78;
        R = (4/5)*C;
        F = (9/5)*C+32;
        K = C+273;
        System.out.println("Konversi suhu dari "+C+" Celcius ke "+R+ " Reamur");
        System.out.println("Konversi suhu dari "+C+" Celcius ke "+F+ " Fahrenheit");
        System.out.println("Konversi suhu dari "+C+" Celcius ke "+K+ " Kelvin");
    }
    
}
