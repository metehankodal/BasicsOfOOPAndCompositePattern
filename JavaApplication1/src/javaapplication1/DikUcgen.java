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
public class DikUcgen implements Shape {
    private double a;
    private double b;
    private double c;
    public DikUcgen(double gelenA,double gelenB)
    {
        this.a=gelenA;
        this.b=gelenB;
        this.c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
    }
    @Override
    public String toString()
    {
        return ("DikUcgen,a="+a+" b="+b+" c="+c);
    }
    public void tangentValues()
    {
        System.out.println("a/b="+(a/b)+" b/a="+(b/a));
    }
    @Override
    public double cevreHesapla() {
        return (a+b+c);
    }

    @Override
    public double alanHesapla() {
        return (a*b/2);
    }
    
    
    
    
}
