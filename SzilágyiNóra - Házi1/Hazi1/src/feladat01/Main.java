/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat01;

/**
 * Ebben a Main osztályban 4 pontot hozunk létre, tetszőleges értékekkel, majd ezek
 * koordinátáit a feladat szerint módosítjuk és kiíratjuk a képernyőre.
 * @author szila
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * Példányosítás során létrehozunk 4 új pontot.
         */
        Pont p1 = new Pont(8,7);
        Pont p2 = new Pont(4,9);
        Pont p3 = new Pont(6,6);
        Pont p4 = new Pont(3,5);
        
        
        /**
         * Az első 2 pontunk Y koordinátáit növeljük 5-tel, a másik 2 pontunk 
         * X koordinátáit pedig csökkentjük 3.4-gyel.
         */
        p1.setY(p1.getY()+5);
        p2.setY(p2.getY()+5);
        p3.setX((double)(p3.getX()-3.4));
        p4.setX((double)(p4.getX()-3.4));
        
        
        /** 
         * Kiíratjuk a képernyőre a módosított pontokat,
         * ehhez a lekérdező (getter) metódust használjuk.
         * 
         */
        System.out.println(p1.getX()+" ; "+p1.getY());
        System.out.println(p2.getX()+" ; "+p2.getY());
        System.out.println(p3.getX()+" ; "+p3.getY());
        System.out.println(p4.getX()+" ; "+p4.getY());
        
    }
}
