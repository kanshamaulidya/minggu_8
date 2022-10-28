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
public class Segitiga extends LimasSegitiga {
    public float alas;
    public float tinggi;
    
    public void Segitiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public void luasSegitiga(){
        luasSegi = (alas * tinggi) / 2;
    }
    public void kelilingSegitiga(){
        
    }
    public void tampilSegitiga(){
        System.out.println("SEGITIGA");
        System.out.println("Alas: " +alas);
        System.out.println("Tinggi: " +tinggi);
        System.out.println("Luas Segitiga : "+luasSegi);
        System.out.println();
    } 
}
