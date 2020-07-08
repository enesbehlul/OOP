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
public abstract class Araba {
    private int anlikHiz;
    private int model;
    private int maxHiz;
    private int vitesSayisi;
    private String renk;
    
    // default constructor
    public Araba(){
        this.model = 2020;
        this.maxHiz = 200;
        this.vitesSayisi = 5;
        this.renk = "BEYAZ";
    }

    public Araba(int model, int maxHiz, int vitesSayisi, String renk) {
        this.model = model;
        this.maxHiz = maxHiz;
        this.vitesSayisi = vitesSayisi;
        this.renk = renk;
    }
    
    public int getAnlikHiz() {
        return anlikHiz;
    }

    public void setAnlikHiz(int anlikHiz) {
        this.anlikHiz = anlikHiz;
    }
    
    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getMaxHiz() {
        return maxHiz;
    }

    public void setMaxHiz(int maxHiz) {
        this.maxHiz = maxHiz;
    }

    public int getVitesSayisi() {
        return vitesSayisi;
    }

    public void setVitesSayisi(int vitesSayisi) {
        this.vitesSayisi = vitesSayisi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
    
    public abstract void hizlan(int hiz);
    
}
