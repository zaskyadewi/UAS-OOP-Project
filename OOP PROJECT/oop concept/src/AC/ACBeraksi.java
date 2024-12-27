/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author MyBook Hype AMD
 */
public class ACBeraksi {
    public static void main(String[] args) {
        AC ac = new AC();
        System.out.println("Status AC Saat ini : mati");
        ac.hidupkan();
        ac.matikan();
        ac.matikan();
        ac.hidupkan();
        ac.hidupkan();
        
        System.out.println("Status AC Saat ini : dingin");
        ac.dinginkan();
        ac.panaskan();
        ac.panaskan();
        ac.dinginkan();
        ac.dinginkan();
    }
}
