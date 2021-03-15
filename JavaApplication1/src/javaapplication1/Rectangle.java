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
public class Rectangle implements Shape{
    private double height;
    private double width;
    
    public Rectangle(double yukseklik,double genislik)
    {
        this.height=yukseklik;
        this.width=genislik;
    }
    @Override
    public String toString()
    {
        return ("Rectangle,height="+height+" width="+width);
    }
    @Override
    public double cevreHesapla() {
        return ((this.height+this.width)*2);
    }

    @Override
    public double alanHesapla() {
        return (this.height*this.width);
    }
    
    
}
