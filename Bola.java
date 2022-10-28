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
public class Bola extends BangunRuang {
    public float luas;
    public float keliling;
    
    
    public float getLuas(){
        return luas;
    }
    public float getKeliling(){
        return keliling;
    }
    public void volumeBola(){
        volume = 4/3 * 22/7 * 7 * 7 ;
        // volume = 4/3 * luas;  rumus yang seharusnya
    }
    public void lpBola(){
        lp = 4 * 22/7 * 7 * 7;
        // lp= 4 * luas; rumus yang seharusnya
    }
    public void TampilBola(){
        System.out.println("BOLA");
        System.out.println("Volume: " +volume);
        System.out.println("Luas Permukaan: " +lp);
        System.out.println();
    }
}
