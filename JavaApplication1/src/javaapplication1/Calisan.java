/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author meteh
 */
public class Calisan extends FirmaBilesen {
    private String adSoyad;
    private int maas;
    public Calisan(String adSoyadd,int maass)
    {
        adSoyad=adSoyadd;
        maas=maass;
    }
    @Override
    public int maliyet() {
        return maas;
    }
    
    
}
