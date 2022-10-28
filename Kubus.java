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
public class Kubus extends BangunRuang {
    public float luasPersegi;
    public float kelilingPersegi;
    
    public float getLuasPersegi(){
        return luasPersegi;
    }
    public float getKelilingPersegi(){
        return kelilingPersegi;
    }
    public void volumeKubus(){
        volume = 5  * 5 * 5 ;
        // volume = s * s * s; rumus yg seharusnya
    }
    public void lpKubus(){
        lp = 6 * (5*5);
        // lp = 6 * (s*s); rumus yg seharusnya
    }
    public void TampilKubus(){
        System.out.println("KUBUS");
        System.out.println("Volume: " +volume);
        System.out.println("Luas Permukaan: " +lp);
        System.out.println();
    }
}
