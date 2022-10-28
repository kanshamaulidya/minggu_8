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
public class Tinggi {
    public float tgg;
    
    public void Tinggi(){
        
    }
    public void Tinggi(float tgg){
        this.tgg=tgg;
    }
    public float getTinggi(){
        return tgg;
    }
    public void setTinggi(float tgg){
        this.tgg=tgg;
    }
    public void tampilTinggi(){
        System.out.println("Nilai Tinggi: " +tgg);
        System.out.println();
    }
}
