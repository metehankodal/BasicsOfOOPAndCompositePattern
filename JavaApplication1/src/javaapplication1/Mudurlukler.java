/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author meteh
 */
public class Mudurlukler extends FirmaBilesen {
    private String mudurlukAdı;
    ArrayList<FirmaBilesen> firmaBilesenArrayi;
    
    public Mudurlukler(String mudurlukAdıı)
    {
        mudurlukAdı=mudurlukAdıı;
        firmaBilesenArrayi=new ArrayList<FirmaBilesen>();
    }
    
    
    @Override
    public int maliyet() {
        int toplamMaliyet=0;
        for(Object x :firmaBilesenArrayi)
        {
            FirmaBilesen y=(FirmaBilesen)x;
            toplamMaliyet+=y.maliyet();
        }
        return toplamMaliyet;
         
    }
    public void ekle(FirmaBilesen herhangi)
    {
        firmaBilesenArrayi.add(herhangi);        
    }
    
}
