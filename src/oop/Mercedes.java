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
public class Mercedes extends Araba {
    
    public Mercedes(){
        this.setMaxHiz(260);
        this.setVitesSayisi(6);
    }
    
    public Mercedes(int model, int maxHiz, int vitesSayisi, String renk){
        super(model, maxHiz, vitesSayisi, renk);
    }

    @Override
    public void hizlan(int artis) {
        if (artis >0 && this.getAnlikHiz() + artis <= this.getMaxHiz()) {
            this.setAnlikHiz(this.getAnlikHiz() + artis);
            System.out.println("Hizlaniliyor..." + " yeni hiz: " );
        } else if (artis <= 0) {
            System.out.println("artis hizi 0'dan buyuk olmalidir.");
        } else
            System.out.println("En yüksek hizi asmaya calisiyorsunuz.");
        
   }
    
}
