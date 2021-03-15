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
public class Circle implements Shape{
    double radius;//yarıçap
    public Circle(double valueOfRadius)
    {
        this.radius=valueOfRadius;
    }

    @Override
    public double cevreHesapla() {
        return (2*Math.PI*radius);
    }

    @Override
    public double alanHesapla() {
        return (Math.PI*(Math.pow(radius,2)));
    }
    @Override
    public String toString()
    {
        return ("Circle,radius="+radius);
    }
    
}
