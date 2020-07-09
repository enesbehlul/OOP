/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author behlul
 */
public class Test {
    
    public static void main(String[] args) {
        Araba[] arabalar = new Araba[10];
                
        Araba a = new Mercedes();
        Araba b = new Fiat();
        a.setModel(1990);
        a.setMaxHiz(180);
        System.out.println(a);
        System.out.println(b);
        
        arabalar[0] = a;
        arabalar[1] = b;
        
        for (int i = 0; i < 2; i++) {
            if (arabalar[i] instanceof Mercedes) {
                ((Mercedes)arabalar[i]).koltukIsitmasiAc();
            } else
                ((Fiat)arabalar[i]).yukTasi();
            
        }

    }
}
