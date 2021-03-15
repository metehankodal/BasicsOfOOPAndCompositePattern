/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author meteh
 */
public class Soru1Deneme {
    
    public static void main(String[] args ) throws FileNotFoundException, IOException
    {
        String tip;
        Shape[] shapeArrayi = new Shape[5];
        Scanner textIcerigi= new Scanner(System.in);
        File dosya = new File("girdi.txt");
        BufferedReader reader =new BufferedReader(new FileReader(dosya));
        
        for(int x=0;x<5;x++)
        {
            StringTokenizer strTokens = new StringTokenizer(reader.readLine());
            tip=strTokens.nextToken();
            if(tip.equals("Circle"))
            {
                Circle circle = new Circle(Double.parseDouble(strTokens.nextToken()));
                shapeArrayi[x]=circle;
            }
            else if (tip.equals("Rectangle"))
            {
                Rectangle rectangle = new Rectangle(Double.parseDouble(strTokens.nextToken()),Double.parseDouble(strTokens.nextToken()));
                shapeArrayi[x]=rectangle;
            }
            else if(tip.equals("DikUcgen"))
            {
                
                  DikUcgen dikucgen = new DikUcgen(Double.parseDouble(strTokens.nextToken()),Double.parseDouble(strTokens.nextToken()));
                  shapeArrayi[x]=dikucgen;
            }
            
        }
            for(int z=0;z<5;z++)
            {
                if(shapeArrayi[z] instanceof DikUcgen)
                {
                    DikUcgen dikucgenCast;
                  
                    dikucgenCast=(DikUcgen)shapeArrayi[z];//casting etmem gerek alta doğru çünkü buna özel metod ve override edilmemiş ulaşamaz üstteki kapsayan class.
                    System.out.print(shapeArrayi[z].toString()+" Çevre="+shapeArrayi[z].cevreHesapla()+" Alan="+shapeArrayi[z].alanHesapla()+" Tanjant değerleri= ");
                    
                    dikucgenCast.tangentValues();
                    
                }
                else
                {
                    System.out.println(shapeArrayi[z].toString()+" Çevre="+shapeArrayi[z].cevreHesapla()+" Alan="+shapeArrayi[z].alanHesapla());
                }
                
                
            }
            
            
        
        
        //şimdi nasıl yapıcam önce metodu bulmam lazım.C hesabı tek tek gitsem mi yoksa tamam hallettim bunu stringtokenizer çak gec
        
        
        
        
        
        
    }
    
}
