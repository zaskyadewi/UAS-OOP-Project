/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author MyBook Hype AMD
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilCaca = new Mobil();
        
        mobilCaca.warna = "pink";
        mobilCaca.tahunProduksi = 2020;
        
        System.out.println("warna: " + mobilCaca.warna);
        System.out.println("Tahun Produksi: " + mobilCaca.tahunProduksi);
    }
}
