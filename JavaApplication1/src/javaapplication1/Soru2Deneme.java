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
public class Soru2Deneme {
    public static void main(String[] args) {
        Calisan Ali = new Calisan("Ali",5000);
        Calisan Veli = new Calisan("Veli",6000);
        Calisan Ayse= new Calisan("Ayse",4000);
        Calisan Can = new Calisan("Can",3000);
        Calisan Selim= new Calisan("Selim",2000);
        Calisan Murat = new Calisan("Murat",1500);
        Calisan Zeynep = new Calisan("Zeynep",2500);
        Calisan Emre = new  Calisan("Emre",3000);
        Calisan Ahmet = new Calisan("Ahmet",4000);
        Calisan Bahar = new  Calisan("Bahar",2500);
        Calisan Sedat = new Calisan("Sedat",1500);
        Calisan Vedat = new Calisan("Vedat",2500);
        Mudurlukler mudurlukNesnesiAkdeniz = new Mudurlukler("Akdeniz Müdürlüğü");
        Mudurlukler mudurlukNesnesiEge = new Mudurlukler("Ege Müdürlüğü");
        Mudurlukler mudurlukNesnesiGenel = new Mudurlukler("Genel Müdürlük");
        Mudurlukler mudurlukAntalya=new Mudurlukler("Antalya il müdürlüğü");
        mudurlukAntalya.ekle(Bahar);
        mudurlukAntalya.ekle(Sedat);
        mudurlukAntalya.ekle(Vedat);
        mudurlukNesnesiAkdeniz.ekle(mudurlukAntalya);
        mudurlukNesnesiAkdeniz.ekle(Emre);
        mudurlukNesnesiAkdeniz.ekle(Ahmet);
        mudurlukNesnesiGenel.ekle(mudurlukNesnesiAkdeniz);
        mudurlukNesnesiGenel.ekle(Veli);
        mudurlukNesnesiGenel.ekle(Ali);
        Mudurlukler mudurlukIzmır = new Mudurlukler("İzmir il müdürlüğü");
        mudurlukIzmır.ekle(Selim);
        mudurlukIzmır.ekle(Murat);
        mudurlukIzmır.ekle(Zeynep);
        mudurlukNesnesiEge.ekle(Ayse);
        mudurlukNesnesiEge.ekle(Can);
        mudurlukNesnesiEge.ekle(mudurlukIzmır);
        mudurlukNesnesiGenel.ekle(mudurlukNesnesiEge);
        
        System.out.println("Ege  müdürlüğün toplam maliyeti "+mudurlukNesnesiEge.maliyet());
        System.out.println("Akdeniz müdürlüğünün toplam maliyeti "+mudurlukNesnesiAkdeniz.maliyet());
        System.out.println("Genel müdürlüğün toplam maliyeti "+mudurlukNesnesiGenel.maliyet());
        
        
       
        
        
        
        
        
        
        
        
       
        
    }
    
}
