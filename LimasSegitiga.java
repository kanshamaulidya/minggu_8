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
public class LimasSegitiga extends BangunRuang {
    public float luasSegi;
    public float kelilingSegi;
    
    public float getLuasSegi(){
        return luasSegi;
    }
    public float getKelilingSegi(){
        return kelilingSegi;
    }
    public void volumeLimasSegitiga(){
        //volume = 1/2 * luasAlas * tgg ;
    }
    public void lpLimasSegitiga(){
        //lp = luasAlas(4*luasSegi);
    }
    public void TampilLS(){
        System.out.println("LIMAS SEGITIGA");
        System.out.println("Volume: " +volume);
        System.out.println("Luas Permukaan: " +lp);
        System.out.println();
    }
    
}
