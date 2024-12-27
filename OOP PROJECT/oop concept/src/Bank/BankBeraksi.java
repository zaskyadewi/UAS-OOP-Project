/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author MyBook Hype AMD
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank ABC = new Bank(100000);
        ABC.getSaldo();
        ABC.simpanUang(500000);
        ABC.ambilUang(150000);
    }
}