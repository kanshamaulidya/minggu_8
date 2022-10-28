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
public class Lingkaran extends Bola {
    public float r;
    
    public void Lingkaran(float r){
        this.r = r;
    }
    
    public void luasLingkaran(){
        luas = 22/7  * r * r;
    }
    public void kelilingLingkaran(){
        keliling = 22/7 * 2 * r;
    }
    
   public void tampilLingkaran(){
        System.out.println("LINGKARAN");
        System.out.println("Nilai r: "+r);
        System.out.println("Luas Lingkaran : " +luas);
        System.out.println("Keliling Lingkaran : " +keliling);
        System.out.println();
    }
}
