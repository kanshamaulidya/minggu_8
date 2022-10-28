/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author HP
 */
public class Persegi extends Kubus {
    public float s;
    
    
    public void PersegiPanjang(float s){
        this.s=s;
       
    }
    public void luasP(){
        luasPersegi = s * s;
    }
    public void kelilingP(){
        kelilingPersegi = 6 * s;
    }
    public void getP(){
        System.out.println("PERSEGI");
        System.out.println("Sisi: " +s);
        System.out.println("Luas Persegi: " +luasPersegi);
        System.out.println("Keliling Persegi: " +kelilingPersegi);
        System.out.println();
    }
}
