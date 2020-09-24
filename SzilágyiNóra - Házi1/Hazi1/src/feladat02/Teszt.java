/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat02;

/**
 * Ebben a Teszt osztályban a main metóduson belül létrehozunk 3 db RegularPolygon objektumot, 
 * a feladat szerinti konstruktorok használatával, majd kiíratjuk mindegyik kerületét és területét.
 * @author szila
 */
public class Teszt {
    public static void main(String[] args) {
        
        /**
         * Példányosítás során létrehozunk 3 új objektumot.
         */
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6,4);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
        
        
        /**
         * Kiíratjuk a képernyőre a kerületüket és területüket lekérdező metódus segítségével.
         */
        System.out.println("rp1 kerulete: " +rp1.getPerimeter()+ ", terulete: " +rp1.getArea());
        System.out.println("rp2 kerulete: " +rp2.getPerimeter()+ ", terulete: " +rp2.getArea());
        System.out.println("rp3 kerulete: " +rp3.getPerimeter()+ ", terulete: " +rp3.getArea());
        
    }
}
