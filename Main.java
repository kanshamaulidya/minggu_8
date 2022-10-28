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
public class Main {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran();
        Bola b = new Bola();
        
        l.r = 7;
        l.luasLingkaran();
        l.kelilingLingkaran();
        l.tampilLingkaran();
        b.volumeBola();
        b.lpBola();
        b.TampilBola();
        
        Persegi p = new Persegi();
        Kubus k = new Kubus();
        p.s = 5;
        p.luasP();
        p.kelilingP();
        p.getP();
        k.volumeKubus();
        k.lpKubus();
        k.TampilKubus();
        
        Segitiga st = new Segitiga();
        st.alas=3;
        st.tinggi=7;
        st.luasSegitiga();
        st.kelilingSegitiga();
        st.tampilSegitiga();
                
        
        Tinggi t = new Tinggi();
        t.tgg=10;
        t.tampilTinggi();
        
        LimasSegitiga ls = new LimasSegitiga();
        ls.TampilLS();
        
        LimasSegiempat lse = new LimasSegiempat();
        lse.TampilLSE();
        
        
    }
    
    
}
